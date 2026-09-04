package com.github.zia.facade;

public class Television {
    public void turnOn() { System.out.println("TV is ON."); }
    public void setInput() { System.out.println("TV input set to HDMI 1."); }
    public void turnOff() { System.out.println("TV is OFF."); }
}

class SoundSystem {
    public void turnOn() { System.out.println("Sound system is ON."); }
    public void setVolume(int level) { System.out.println("Volume set to " + level); }
    public void turnOff() { System.out.println("Sound system is OFF."); }
}

class StreamingDevice {
    public void turnOn() { System.out.println("Streaming device is ON."); }
    public void launchApp(String app) { System.out.println("Launching " + app); }
    public void turnOff() { System.out.println("Streaming device is OFF."); }
}

