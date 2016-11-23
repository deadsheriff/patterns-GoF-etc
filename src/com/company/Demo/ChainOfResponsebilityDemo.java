package com.company.Demo;
import com.company.ChainOfResponsebility.*;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class ChainOfResponsebilityDemo implements Demo {
    @Override
    public void execute() {
        AbstractLogger loggerChain = ChainPatternDemo.getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
