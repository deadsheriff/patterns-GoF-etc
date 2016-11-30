package com.company.Demo;
import com.company.NullPattern.*;
/**
 * Created by Пользователь on 30.11.2016.
 */
public class NullPatternDemo implements Demo {
    @Override
    public void execute() {
        AbstractClass realEntity = new RealEntity();
        realEntity.doSomething(); // RealEntity::doSomething

        AbstractClass unknownEntity = new NullEntity();
        unknownEntity.doSomething(); // NullEntity::doSomething
    }
}
