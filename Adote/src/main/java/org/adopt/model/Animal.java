package org.adopt.model;

import jakarta.persistence.*;

@Entity
public class Animal {
    @Id
    private Long id;
    private String name;
    private Gender gender;
    private int age;
    private String race;
    private Size size;
    private String history;
    //se da bem ou não com outros animais
    private Boolean compatibility;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "animais",
//    joinColumns = {@JoinColumn(name = "gato",
//    referencedColumnName = "gato_id")},
//            inverseJoinColumns = {@JoinColumn(name = "cachorro",
//            referencedColumnName = "cachorro_id")}
//    )
    //private List<Animal> listaDosAnimais;

    public Animal(Long id, String name, Gender gender, int age, String race, Size size, String history,
                  Boolean compatibility) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.race = race;
        this.size = size;
        this.history = history;
        this.compatibility = compatibility;
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getRace() {
        return race;
    }

    public Size getSize() {
        return size;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getHistory() {
        return history;
    }

    public Boolean getCompatibility() {
        return compatibility;
    }
}
