package com.server;

public class ShapeMakerFacade {
	
	private Shape circle;
	private Shape rectangle;
	
	public ShapeMakerFacade(){
		circle = new Circle();
		rectangle = new Rectangle();
	}
	
	public void drawCicle(){
		circle.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
}
