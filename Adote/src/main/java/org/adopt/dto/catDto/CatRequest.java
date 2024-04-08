package org.adopt.dto.catDto;

import org.adopt.model.Gender;
import org.adopt.model.Size;

public record CatRequest(String name, int age, Gender gender, String race, Size size,
                         String history, Boolean compatibility, Boolean fiv, Boolean felv) {

}
