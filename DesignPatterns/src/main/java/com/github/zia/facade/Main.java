package com.github.zia.facade;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        SoundSystem sound = new SoundSystem();
        StreamingDevice streamer = new StreamingDevice();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, sound, streamer);
        homeTheater.watchMovie("Netflix");
        homeTheater.endMovie();
    }
}
