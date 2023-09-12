package ru.gapisovii.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> song = new ArrayList<>();
    {
        song.add("classical song1");
        song.add("classical song2");
        song.add("classical song3");
    }
    @Override
    public List<String> getSong() {
        return song;
    }
}
