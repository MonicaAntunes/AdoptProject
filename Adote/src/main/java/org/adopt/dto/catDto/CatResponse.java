package org.adopt.dto.catDto;

import org.adopt.model.Cat;
import org.adopt.model.Gender;
import org.adopt.model.Size;

public record CatResponse(Long id, String name, Gender gender, int age, String race, Size size, String history,
                          Boolean compatibility, Boolean fiv, Boolean felv) {


    public static CatResponse from(Cat cat) {
        return new CatResponse(
                cat.getId(),
                cat.getName(),
                cat.getGender(),
                cat.getAge(),
                cat.getRace(),
                cat.getSize(),
                cat.getHistory(),
                cat.getCompatibility(),
                cat.getFiv(),
                cat.getFelv()
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        CatResponse catResponse = (CatResponse) obj;
        return (name.equals(catResponse.name) && gender.equals(catResponse.gender) && age == catResponse.age && race.equals(catResponse.race) &&
                    size.equals(catResponse.size) && history.equals(catResponse.history) &&
                    compatibility.equals(catResponse.compatibility));
    }

    @Override
    public String toString() {
        return "Gato { " +
                "id, " + id +
                "name, " + name +
                "genêro, " + gender +
                "age, " + age +
                "race, " + race +
                "size, " + size +
                "history, " + history +
                "compatibility" + compatibility +
                " }";
    }

}
