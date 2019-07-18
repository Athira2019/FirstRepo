package com.cerner.training.structural.adapter.change;

import com.cerner.training.structural.adapter.Circle;
import com.cerner.training.structural.adapter.Drawing;
import com.cerner.training.structural.adapter.Rectangle;

public class ObjectAdapterMain {
	public static void main(String[] args) {
	 System.out.println("Creating drawing of shapes...");
     Drawing drawing = new Drawing();
     drawing.addShape(new Rectangle());
     drawing.addShape(new Circle());
     drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
     drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));
     System.out.println("Drawing...");
     drawing.draw();
     System.out.println("Resizing...");
     drawing.resize();
}
}