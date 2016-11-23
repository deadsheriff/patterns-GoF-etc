package com.company.Demo;

import com.company.Iterator.*;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class IteratorDemo implements Demo {
    @Override
    public void execute() {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
