package model;

import processing.core.PApplet;
import processing.core.PImage;

public class IntroScreen {
	
	PImage introscreen;
	private PApplet app;
	
	public IntroScreen(PApplet app) {
		
		this.app = app;
		introscreen = app.loadImage("controlls.jpg");
	}
	
	public void draw() {
		
		app.rectMode(app.CENTER);
		app.rect(640, 568, 110, 100);
		app.image(introscreen, 640, 360);
	}

}
