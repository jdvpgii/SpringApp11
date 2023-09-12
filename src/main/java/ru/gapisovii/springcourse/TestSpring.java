package ru.gapisovii.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(GenreOfMusic.CLASSICAL);
        musicPlayer.playMusic(GenreOfMusic.ROCK);

        context.close();

    }
}
