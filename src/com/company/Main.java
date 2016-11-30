package com.company;
import com.company.PatternSelector.PatternSelector;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try{
           PatternSelector.getPattern().execute();
        }catch (IOException e){
            System.out.println("Error IO");
        }catch (Exception e){
            System.out.println("Smth wrong with pattern code");
        }

    }

}
