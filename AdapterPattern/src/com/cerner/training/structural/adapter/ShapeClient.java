package com.cerner.training.structural.adapter;

public class ShapeClient {
	 public static void main(String[] args) {
         System.out.println("Creating drawing of shapes...");
         Drawing drawing = new Drawing();
         drawing.addShape(new Rectangle());
         drawing.addShape(new Circle());
         System.out.println("Drawing...");
         drawing.draw();
         System.out.println("Resizing...");
         drawing.resize();
   }


}
