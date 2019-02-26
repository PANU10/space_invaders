package com.company;

import java.awt.*;

public class Canvas extends javax.swing.JFrame {
    static Graphics2D g;

    public Canvas() {
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        java.awt.Canvas canvas = new java.awt.Canvas();
        canvas.setPreferredSize(new Dimension(800,600));
        canvas.setIgnoreRepaint(true);
        add(canvas);
        g = (Graphics2D)canvas.getGraphics();
        pack();
    }

    public static synchronized void draw(Object o) {
        if(g==null) {
            new Canvas();
            wait(200);
        }
        int x=0,y=0,w=0,h=0;
        try { w = o.getClass().getDeclaredField("width").getInt(o);}
        catch (Exception e) {}
        try{  h = o.getClass().getDeclaredField("height").getInt(o);}
        catch (Exception e) {}
        try { x = o.getClass().getDeclaredField("x").getInt(o);}
        catch (Exception e) {}
        try { y = o.getClass().getDeclaredField("y").getInt(o);}
        catch (Exception e) {}
        w = w > 0 ? w : 50;
        h = h > 0 ? h : 50;

        g.fillRect(x, y, w, h);
    }

    public static void fillRect(int x, int y, int width, int height){
        if(g==null) {
            new Canvas();
            wait(200);
        }
        g.fillRect(x, y, width, height);
    }

    public static void wait(int millis){
        try { Thread.sleep(millis); } catch (Exception e) {}
    }
}
