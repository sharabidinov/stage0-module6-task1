package com.epam.mjc.stage0;
import java.util.Scanner;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean getHasFur() {
        return hasFur;
    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return String.format("This animal is mostly %s. It has %s %s and %s fur.", color, numberOfPaws,
                numberOfPaws > 1 ? "paws" : "paw",
                hasFur ? "a" :
                        "no");
    }
}
