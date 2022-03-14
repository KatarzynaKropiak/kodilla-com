package com.kodilla.patterns.strategy.strategy.social;

import com.kodilla.patterns.strategy.strategy.social.predictors.SnapchatPublisher;

public class YGeneration extends User {
    public YGeneration (String name) {
        super (name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
