package com.bootcoding.java.assignment;

public class Boxapplication {
    public static void main (String[] args){
        Box b1= Box.Createbox();
        Box b2= Box.Createbox(35.0,21.0,20.0);
        Box.printBox(b1);
        Box.printBox(b2);

    }
}
