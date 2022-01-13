package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {



    private final BigDecimal population;
    private final String name;
    private final String continent;

    public Country(final BigDecimal population, final String name, final String continent) {
        this.population = population;
        this.name = name;
        this.continent = continent;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "population=" + population +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }
}
