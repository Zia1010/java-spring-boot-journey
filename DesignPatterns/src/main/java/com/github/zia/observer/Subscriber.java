package com.github.zia.observer;

public interface Subscriber {
    void update(String videoTitle);
}
class User implements Subscriber {
    private String name;
    public User(String name) {
        this.name = name;
    }
    @Override
    public void update(String videoTitle) {
        System.out.println("Notification to " + name + ": New video uploaded -> " + videoTitle);
    }
}

