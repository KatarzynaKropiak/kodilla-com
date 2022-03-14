package com.kodilla.patterns.strategy.strategy.social.predictors;

import com.kodilla.patterns.strategy.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Facebook";
    }
}
