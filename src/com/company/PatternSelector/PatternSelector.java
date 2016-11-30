package com.company.PatternSelector;
import com.company.Demo.*;

import java.io.IOException;

/**
 * Created by Пользователь on 30.11.2016.
 */
public class PatternSelector {
    public static Demo getPattern() throws IOException {
        Demo pattern;
        System.out.print("Type pattern name for demo: ");
        java.util.Scanner s = new java.util.Scanner(System.in);
        String patternSwitcher = s.nextLine().trim().toLowerCase();
        switch (patternSwitcher) {
            case "abstract factory": pattern = new AbstractFactoryDemo();
                break;
            case "adapter": pattern = new AdapterDemo();
                break;
            case "bridge": pattern = new BridgeDemo();
                break;
            case "builder": pattern = new BuilderDemo();
                break;
            case "chain of responsibility": pattern = new ChainOfResponsebilityDemo();
                break;
            case "command": pattern = new CommandDemo();
                break;
            case "composite": pattern = new CompositePatternDemo();
                break;
            case "dao": pattern = new DaoDemo();
                break;
            case "decorator": pattern = new DecoratorDemo();
                break;
            case "facade": pattern = new FacadeDemo();
                break;
            case "factory": pattern = new FactoryDemo();
                break;
            case "fly weight": pattern = new FlyWeightDemo();
                break;
            case "iterator": pattern = new IteratorDemo();
                break;
            case "mediator": pattern = new MediatorDemo();
                break;
            case "memento": pattern = new MementoDemo();
                break;
            case "observer": pattern = new ObserverDemo();
                break;
            case "prototype": pattern = new PrototypeDemo();
                break;
            case "proxy": pattern = new ProxyDemo();
                break;
            case "state": pattern = new StateDemo();
                break;
            case "template": pattern = new TemplateDemo();
                break;
            case "visitor": pattern = new VisitorDemo();
                break;
            case "null": pattern = new NullPatternDemo();
                break;
            default: pattern =  new NullPatternDemo();
        }
        return pattern;
    }
}
