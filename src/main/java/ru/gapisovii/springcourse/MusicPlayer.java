package ru.gapisovii.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music1;
    private Music music2;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    public String playMusic() {
        return music1.getSong();
    }
}
