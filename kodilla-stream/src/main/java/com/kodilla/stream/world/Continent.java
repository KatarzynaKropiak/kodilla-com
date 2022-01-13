package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private List<Country> countries = new ArrayList<>();

    public Continent(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }
    public void addCountry(Country country) {
        countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return countries.remove(country);
    }
}
