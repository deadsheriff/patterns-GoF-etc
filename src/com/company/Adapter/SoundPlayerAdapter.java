package com.company.Adapter;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class SoundPlayerAdapter implements IAudioPlayer {
    private SoundPlayer soundPlayer = new SoundPlayer();
    @Override
    public void load(String file) {
    soundPlayer.loadSong(file);
    }

    @Override
    public void play() {
    soundPlayer.playMusic();
    }
}
