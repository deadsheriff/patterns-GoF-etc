package com.company.Memento;

/**
 * Created by Пользователь on 22.11.2016.
 */
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List mementoList = new ArrayList();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return (Memento) mementoList.get(index);
    }
}
