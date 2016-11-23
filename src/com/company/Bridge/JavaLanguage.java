package com.company.Bridge;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class JavaLanguage implements ILanguage {
    @Override
    public void Build() {
        System.out.println("Build jar files");
    }

    @Override
    public void Execute() {
        System.out.println("Run in JVM");
    }
}
