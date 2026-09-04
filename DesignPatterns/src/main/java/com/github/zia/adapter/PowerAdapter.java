package com.github.zia.adapter;

public class PowerAdapter implements TwoPinSocket{
    private final ThreePinPlug item;

    public PowerAdapter(ThreePinPlug item){
        this.item=item;
    }
    @Override
    public void connectTwoPinSocket() {
        System.out.println("Connecting to Two Pin socket with Adapter ");
        item.plugThreePinDevice();
    }
}
