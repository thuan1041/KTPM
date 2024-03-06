package org.example;


import jdepend.swingui.JDepend;

public class Swing_UI_Main {
    public static void main(String[] args) throws Exception {
        JDepend jDepend = new JDepend( );
        jDepend.addDirectory("T:\\jdepend_ui\\Library-Assistant");
        jDepend.analyze();
        System.out.println("Done");
    }
}
