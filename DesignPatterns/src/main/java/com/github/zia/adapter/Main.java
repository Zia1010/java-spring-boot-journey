package com.github.zia.adapter;

public class Main {
    public static void main(String[] args) {

        ThreePinPlug laptop=new ThreePinPlug();
        TwoPinSocket wallSocket= new PowerAdapter(laptop);

        wallSocket.connectTwoPinSocket();
    }
}
