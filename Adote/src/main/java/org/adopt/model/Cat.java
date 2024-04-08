package org.adopt.model;

import jakarta.persistence.Entity;

@Entity
public class Cat extends Animal {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long animalId;
    private Boolean fiv;
    private Boolean felv;
    public Cat(Long id, String name, Gender gender, int age, String race, Size size, String history,
               Boolean compatibility, Boolean fiv, Boolean felv) {
        super(id, name, gender, age, race, size, history, compatibility);
        this.fiv = fiv;
        this.felv = felv;
    }

    public Cat() {

    }

    public Boolean getFiv() {
        return fiv;
    }

    public void setFiv(Boolean fiv) {
        this.fiv = fiv;
    }

    public Boolean getFelv() {
        return felv;
    }

    public void setFelv(Boolean felv) {
        this.felv = felv;
    }

}
