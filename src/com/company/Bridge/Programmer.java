package com.company.Bridge;

/**
 * Created by Пользователь on 23.11.2016.
 */
public abstract class Programmer {
    protected ILanguage language;
    public void setLanguage(ILanguage language){
        this.language = language;
    }
    public Programmer(ILanguage language){
        this.language = language;
    }
    public void DoWork(){
        language.Build();
        language.Execute();
    }
    public abstract void EarnMoney();
}
