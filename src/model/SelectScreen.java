package model;

import processing.core.PApplet;
import processing.core.PImage;

public class SelectScreen {
	
	PImage selectScreen;
	private PApplet app;
	
	public SelectScreen(PApplet app) {
		
		this.app = app;
		selectScreen = app.loadImage("characters.jpg");
	}
	
	public void draw() {
		
		app.rectMode(app.CENTER);
		app.rect(640, 568, 110, 100);
		app.image(selectScreen, 640, 360);
	}

}
