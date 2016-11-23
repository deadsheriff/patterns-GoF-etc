package com.company.Prototype;

/**
 * Created by Пользователь on 22.11.2016.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}