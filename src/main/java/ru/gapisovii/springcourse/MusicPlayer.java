package ru.gapisovii.springcourse;

public class MusicPlayer {
    // в качестве зависимости используем интерфейс Music
    private Music music;

    //IoC- inversion of control
    //внедрение зависимости
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
