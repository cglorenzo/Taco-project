package com.ceglorenzo.tacoproject.domain;

import lombok.Data;

import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class Taco {

    private String name;

    private List<Ingredient> ingredients = new ArrayList<>();

    private TacoOrder tacoOrder;
}
