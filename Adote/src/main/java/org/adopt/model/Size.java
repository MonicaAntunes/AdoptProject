package org.adopt.model;

public enum Size {

    SMALL("Pequeno"),
    MEDIUM("Médio"),
    LARGE("Grande");

    private final String description;

    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
