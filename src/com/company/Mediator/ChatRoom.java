package com.company.Mediator;

/**
 * Created by Пользователь on 22.11.2016.
 */
import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
