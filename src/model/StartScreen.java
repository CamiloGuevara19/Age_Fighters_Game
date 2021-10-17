package model;

import processing.core.PApplet;
import processing.core.PImage;

public class StartScreen {
	
	PImage startScreen;
	private PApplet app;
	
	public StartScreen(PApplet app) {
		
		this.app = app;
		startScreen = app.loadImage("start.jpg");
	}
	
	public void draw() {
		
		app.rectMode(app.CENTER);
		app.rect(621, 543, 209, 100);
		app.image(startScreen, 640, 360);
	}

}
