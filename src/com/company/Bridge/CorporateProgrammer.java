package com.company.Bridge;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class CorporateProgrammer extends Programmer {
    public CorporateProgrammer(ILanguage language) {
        super(language);
    }

    @Override
    public void EarnMoney() {
        System.out.println("Earn money every month");
    }
}
