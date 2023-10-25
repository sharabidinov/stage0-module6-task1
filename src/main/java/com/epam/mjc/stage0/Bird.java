package com.epam.mjc.stage0;


public class Bird extends Animal {
    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return String.format("This animal is mostly %s. It has %s %s and %s fur. Moreover, it has 2 wings and can fly" +
                        ".", super.getColor(),
                super.getNumberOfPaws(),
                super.getNumberOfPaws() > 1 ? "paws" : "paw",
                super.getHasFur() ? "a" :
                        "no");
    }
}
