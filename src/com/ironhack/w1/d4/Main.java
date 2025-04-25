package com.ironhack.w1.d4;

public class Main {
    public static void main(String[] args) {

//        ABSTRACT CLASSES & INTERFACES

        WebPlayer webPlayer = new WebPlayer(0.5, 1);
        ApplePlayer applePlayer = new ApplePlayer(0.2, 2);
//        Player player = new Player(0.3, 3); no se puede crear una instancia de una clase abstracta porque hemos declarado la clase Player como abstracta


        System.out.println("WebPlayer volume is: " + webPlayer.getVolume());
        webPlayer.close();
        applePlayer.close();

        applePlayer.play();
        System.out.println(applePlayer.getVolume());
        applePlayer.increaseVolume();
        System.out.println(applePlayer.getVolume());

        AndroidPlayer androidPlayer = new AndroidPlayer(0.7, 5);
        androidPlayer.play();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        System.out.println(androidPlayer.getVolume());

        System.out.println(androidPlayer.share());




    }
}
