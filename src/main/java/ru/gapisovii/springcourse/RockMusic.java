package ru.gapisovii.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> song = new ArrayList<>();
    {
        song.add("rock song1");
        song.add("rock song2");
        song.add("rock song3");
    }
    @Override
    public List<String> getSong() {
        return song;
    }
}
