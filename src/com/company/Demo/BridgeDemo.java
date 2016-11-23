package com.company.Demo;
import com.company.Bridge.*;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class BridgeDemo implements Demo {

    @Override
    public void execute(){
        Programmer freelancer = new FreelanceProgrammer(new CppLanguage());
        freelancer.DoWork();
        freelancer.EarnMoney();

        freelancer.setLanguage(new JavaLanguage());
        freelancer.DoWork();
        freelancer.EarnMoney();
        Programmer corporate = new CorporateProgrammer(new JavaLanguage());
        corporate.DoWork();
    }
}