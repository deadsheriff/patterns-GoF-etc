package com.company.Bridge;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class FreelanceProgrammer extends Programmer {
    public FreelanceProgrammer(ILanguage language) {
        super(language);
    }

    @Override
    public void EarnMoney() {
        System.out.println("Make money for cases");
    }
}
