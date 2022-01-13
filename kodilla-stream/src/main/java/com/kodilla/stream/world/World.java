package com.kodilla.stream.world;

import com.kodilla.stream.sand.SandStorage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private List<Continent> continents = new ArrayList<>();

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public List<Continent> getContinents() {
        return continents;
    }

        public void addContinent(Continent continent) {
            continents.add(continent);
        }

        public boolean removeContinent(Continent continent) {
            return continents.remove(continent);
        }

    public BigDecimal getPeopleQuantity() {

        BigDecimal totalPeople = continents.stream()
                .flatMap(countries -> countries.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
            return totalPeople;
    }
}

