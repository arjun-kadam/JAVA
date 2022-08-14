package com.company;

interface TVRemote{
    void nextChannel();
    void volumeUp();
}
interface SmartTVRemote extends TVRemote{
    void openYouTube();
    void openSpotify();
}
class TV implements TVRemote{
    @Override
    public void nextChannel() {
        System.out.println("Next Channel");
    }

    @Override
    public void volumeUp() {
        System.out.println("Increase Volume");
    }
}
public class TVInheritance {
    public static void main(String[] args) {
        TV lg=new TV();
        lg.nextChannel();
        lg.volumeUp();

    }
}
