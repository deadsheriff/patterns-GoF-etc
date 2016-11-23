package com.company.Demo;
import com.company.AbstractFactory.*;
/**
 * Created by Пользователь on 23.11.2016.
 */
public class AbstractFactoryDemo implements Demo {

    @Override
    public void execute(){
        SquadFactory factory = new ElfSquadFactory();
        createSquad(factory);
        SquadFactory factory1 = new OrcSquadFactory();
        createSquad(factory1);
    }
    public void createSquad(SquadFactory factory){
        Mage mage = factory.createMage();
        Warrior warrior = factory.createWarrior();
        Archer archer = factory.createArcher();
        mage.cast();
        archer.shoot();
        warrior.hit();
        }
    }

