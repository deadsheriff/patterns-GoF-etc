package com.company.Memento;

/**
 * Created by Пользователь on 22.11.2016.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}