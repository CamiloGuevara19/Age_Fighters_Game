package model;

import processing.core.PApplet;
import processing.core.PImage;

public class IntroScreen {
	
	PImage introscreen;
	PImage pinktext;
	private PApplet app;
	
	public IntroScreen(PApplet app) {
		
		this.app = app;
		introscreen = app.loadImage("controlls.jpg");
		pinktext = app.loadImage("pinktext.png");
	}
	
	public void draw() {
		
		app.rectMode(app.CENTER);
		app.rect(640, 568, 110, 100);
		app.image(introscreen, 640, 360);
		app.image(pinktext, 620, 695, 250, 30);
	}

}
