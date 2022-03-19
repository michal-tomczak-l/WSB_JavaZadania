package com.company.creatures;

public enum FoodType {

        MEET(0.7),
        CROPS(0.3),
        ALL(0.5);

        public final Double foodBodyRatio;

         FoodType(Double foodBodyRatio) {
            this.foodBodyRatio = foodBodyRatio;
        }
    }

