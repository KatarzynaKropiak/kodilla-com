package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.strategy.social.Millenials;
import com.kodilla.patterns.strategy.strategy.social.User;
import com.kodilla.patterns.strategy.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.strategy.social.ZGeneration;
import com.kodilla.patterns.strategy.strategy.social.predictors.FacebookPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User jessica = new Millenials("Jessica Links");
        User vanessa = new YGeneration("Vanessa Hemerald");
        User nicola = new ZGeneration("Nicola Kodilla");

        //When
        String jessicaPublished = jessica.sharePost();
        System.out.println("Jessica published: " + jessicaPublished);
        String vanessaPublished = vanessa.sharePost();
        System.out.println("Vanessa published: " + vanessaPublished);
        String nicolaPublished = nicola.sharePost();
        System.out.println("Nicola published: " + nicolaPublished);

        //Then
        assertEquals("Facebook", jessicaPublished);
        assertEquals("Snapchat", vanessaPublished);
        assertEquals("Twitter", nicolaPublished);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User nicola = new ZGeneration("Nicola Kodilla");

        //When
        String nicolaPublished = nicola.sharePost();
        System.out.println("Nicola published: " + nicolaPublished);
        nicola.setSocialPublisher(new FacebookPublisher());
        nicolaPublished = nicola.sharePost();
        System.out.println("Nicola published: " + nicolaPublished);

        //Then
        assertEquals("Facebook", nicolaPublished);
    }
}


