package com.company;

public class Main {

    public static void main(String[] args) {

        Barrera uno  = new Barrera();
        uno.w = 50;
        uno.h = 50;
        uno.x = 100;
        uno.y = 100;
        uno.pintar();


        Barrera dos  = new Barrera();
        dos.w = 50;
        dos.h = 50;
        dos.x = 100*3;
        dos.y = 100;
        dos.pintar();

        Barrera tres  = new Barrera();
        tres.w = 50;
        tres.h = 50;
        tres.x = 100*5;
        tres.y = 100;
        tres.pintar();


    }
}
