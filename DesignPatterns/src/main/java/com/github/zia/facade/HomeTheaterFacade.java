package com.github.zia.facade;

public class HomeTheaterFacade {
    private Television tv;
    private SoundSystem sound;
    private StreamingDevice streamer;

    public HomeTheaterFacade(Television tv, SoundSystem sound, StreamingDevice streamer) {
        this.tv = tv;
        this.sound = sound;
        this.streamer = streamer;
    }
    public void watchMovie(String appName) {
        System.out.println("--- Preparing to watch movie ---");
        tv.turnOn();
        tv.setInput();
        sound.turnOn();
        sound.setVolume(20);
        streamer.turnOn();
        streamer.launchApp(appName);
        System.out.println("--- Movie is ready! ---");
    }

    public void endMovie() {
        System.out.println("--- Shutting down home theater ---");
        streamer.turnOff();
        sound.turnOff();
        tv.turnOff();
        System.out.println("--- Goodbye ---");
    }
}

