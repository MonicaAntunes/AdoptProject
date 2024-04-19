package org.adopt.model;

import jakarta.persistence.Entity;

@Entity
public class Dog extends Animal {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long animalId;

    public Dog(Long id, String name, Gender gender, int age, String race, Size size, String history,
               Boolean compatibility) {
        super(id, name, gender, age, race, size, history, compatibility);
    }

    public Dog() {

    }
}
