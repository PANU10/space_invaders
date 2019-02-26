package com.company;

public class Barrera {
    // Campos  == variables
    int x, y;
    int w, h;

    //Metodos
    void pintar(){

        Canvas.fillRect(x,y,w, h);
        Canvas.fillRect(x,y+h,w,h);
        Canvas.fillRect(x+w,y,w, h);
        Canvas.fillRect(x+w*2,y,w, h);
        Canvas.fillRect(x+w*2,y+h,w, h);

    }
}
