package ru.gapisovii.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(GenreOfMusic genreOfMusic) {
        Random random = new Random();
        int randomNum = random.nextInt(3);

        if (genreOfMusic == GenreOfMusic.CLASSICAL){
            System.out.println(classicalMusic.getSong().get(randomNum));
        } else {
            System.out.println(rockMusic.getSong().get(randomNum));
        }
    }
}
