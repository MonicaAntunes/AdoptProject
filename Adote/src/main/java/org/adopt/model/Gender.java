package org.adopt.model;

public enum Gender {
    FEMALE("Femea"),
    MALE("Macho");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
