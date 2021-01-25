package com.discount.testquest.Game;

public class Trail {

    Trail[] direction;
    String subject, description;
    int deltaHealth, deltaEndurance;

    public Trail(String subject, String description, int variants, int deltaHealth, int deltaEndurance) {
        this.subject = subject;
        this.description = description;
        this.deltaHealth = deltaHealth;
        this.deltaEndurance = deltaEndurance;
        direction = new Trail[variants];
    }
}

