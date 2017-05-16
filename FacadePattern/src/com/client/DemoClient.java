package com.client;

import com.server.ShapeMakerFacade;

public class DemoClient {

	public static void main(String[] args) {
		ShapeMakerFacade shapeMakerFacade = new ShapeMakerFacade();
		shapeMakerFacade.drawCicle();
		shapeMakerFacade.drawRectangle();

	}

}
