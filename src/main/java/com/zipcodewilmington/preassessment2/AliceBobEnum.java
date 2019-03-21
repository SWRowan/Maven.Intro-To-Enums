package com.zipcodewilmington.preassessment2;

public enum  AliceBobEnum {
    ALICE, BOB;

    private String name;

    static {
        ALICE.name = "ALICE";
        BOB.name = "BOB";
    }



    public String getCatchPhrase() {
        return "Hey, my name is "+name+"!";
    }

    public boolean isAlice() {

        return name.equals(ALICE.name);
    }

    public boolean isBob() {
        return name.equals(BOB.name);
    }
}
