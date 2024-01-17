package com.ceglorenzo.tacoproject.domain;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class TacoOrder {

        private String deliveryName;
        private String deliveryStreet;
        private String deliveryCity;
        private String deliveryState;
        private String deliveryZip;
        private String ccNumber;
        private String ccExpiration;
        private String ccCVV;

        private Set<Taco> tacos = new HashSet<>();

        public void addTaco(Taco taco) {
            this.tacos.add(taco);
        }
    }

