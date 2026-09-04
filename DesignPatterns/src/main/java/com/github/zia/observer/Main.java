package com.github.zia.observer;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel techChannel = new YoutubeChannel("TechGear Review");

        User zia = new User("Zia");
        User ahmed = new User("Ahmed");
        User muneeb = new User("Muneeb");

        techChannel.subscribe(zia);
        techChannel.subscribe(ahmed);
        techChannel.subscribe(muneeb);
        techChannel.uploadVideo("iPhone 18 Pro Review");
        techChannel.unsubscribe(ahmed);
        techChannel.uploadVideo("Top 5 Laptops of 2026");
    }
}

