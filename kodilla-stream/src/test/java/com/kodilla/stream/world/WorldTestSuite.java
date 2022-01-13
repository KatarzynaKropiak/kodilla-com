package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {

        Country poland = new Country(new BigDecimal(38000000), "Poland", "Europe");
        Country china = new Country(new BigDecimal(1400000000), "China", "Asia");
        Country india = new Country(new BigDecimal(1350000000), "India", "Asia");
        Country kosovo = new Country(new BigDecimal(1800000), "Kosovo", "Europe");

        List<Country> europeList = new ArrayList<>();
        europeList.add(poland);
        europeList.add(kosovo);

        List<Country> asiaList = new ArrayList<>();
        asiaList.add(china);
        asiaList.add(india);

        Continent asia = new Continent(asiaList);
        Continent europe = new Continent(europeList);

        List<Continent> continentList = new ArrayList<>();
        continentList.add(asia);
        continentList.add(europe);

        World world = new World(continentList);

        Assertions.assertEquals(world.getPeopleQuantity(), new BigDecimal(2789800000L));

    }
}
