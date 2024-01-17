package com.ceglorenzo.tacoproject.domain;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Ingredient {

    private String id;
    private String name;
    private Type type;

    public Ingredient(String flto, String flourTortilla, Type type) {
    }


    Set<Taco> tacos = new HashSet<>();
}
