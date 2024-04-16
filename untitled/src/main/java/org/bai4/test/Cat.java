package org.bai4.test;

import org.bai4.oop.Animal;

public class Cat extends Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void display(String a) {
        System.out.println(a);
    }

    public void display() {
        System.out.println("abc");
    }
}
