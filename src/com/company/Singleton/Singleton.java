package com.company.Singleton;

/**
 * Created by Пользователь on 22.11.2016.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    //make the constructor private so that this class cannot be
    //instantiated
    private Singleton(){}

    //Get the only object available
    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
