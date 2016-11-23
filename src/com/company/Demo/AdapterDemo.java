package com.company.Demo;
import com.company.Adapter.*;
/**
 * Created by Пользователь on 23.11.2016.
 */
public class AdapterDemo implements Demo {

    @Override
    public void execute() {
        IAudioPlayer player = new SoundPlayerAdapter();
        player.load("E:Music");
        player.play();
    }
}
