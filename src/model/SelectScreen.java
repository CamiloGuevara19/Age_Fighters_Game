package model;

import processing.core.PApplet;
import processing.core.PImage;

public class SelectScreen {
	
	PImage selectScreen;
	PImage pinktext;
	private PApplet app;
	
	public SelectScreen(PApplet app) {
		
		this.app = app;
		selectScreen = app.loadImage("characters.jpg");
		pinktext = app.loadImage("pinktext2.png");
	}
	
	public void draw() {
		
		app.rectMode(app.CENTER);
		app.rect(640, 568, 110, 100);
		app.image(selectScreen, 640, 360);
		app.image(pinktext, 620, 695, 250, 30);
	}

}
