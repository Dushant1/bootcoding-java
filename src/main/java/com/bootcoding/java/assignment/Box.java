package com.bootcoding.java.assignment;

public class Box {
   double length;
   double breadth;
   double height;

   public static Box Createbox (){
       Box Box= new Box();
       Box.length=10.0;
       Box.breadth=10.0;
       Box.height=10.0;
       return Box;

   }public static Box Createbox(double length, double breadth, double height){
       Box Box =new Box();
       Box.length=length;
       Box.breadth=breadth;
       Box.height=height;
       return Box;

   }
   public static void printBox (Box Box){
        System.out.println("Box length"+ Box.length);
        System.out.println("Box breadth"+ Box.breadth);
        System.out.println("Box height"+ Box.height);
   }

}
