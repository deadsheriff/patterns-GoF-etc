package com.company.Factory;

/**
 * Created by Пользователь on 22.11.2016.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}