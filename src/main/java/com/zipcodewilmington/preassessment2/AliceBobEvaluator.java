package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    private String name;


    public AliceBobEvaluator(String input) {
        this.name = input;
    }

    public boolean isAlice() {
        return name.equals("Alice");
    }

    public boolean isBob() {
        return name.equals("Bob");
    }
}
