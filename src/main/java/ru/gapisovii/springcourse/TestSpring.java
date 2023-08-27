package ru.gapisovii.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestSpring {
    public static void main(String[] args) {
        // обращается к "applicationContext.xml", считывает
        // и помещает все бины в ApplicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();

    }
}
