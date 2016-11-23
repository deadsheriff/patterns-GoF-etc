package com.company.AbstractFactory;

/**
 * Created by Пользователь on 23.11.2016.
 */
public abstract class SquadFactory {
    public abstract Mage createMage();
    public abstract Archer createArcher();
    public abstract Warrior createWarrior();
}
