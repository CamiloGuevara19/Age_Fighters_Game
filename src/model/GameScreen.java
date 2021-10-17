package model;

import processing.core.PApplet;
import processing.core.PImage;

public class GameScreen {
	
	PImage temple, ship, pyramid;
	PImage vidas;
	private PApplet app;
	
	public GameScreen(PApplet app) {
		
		this.app = app;
		temple = app.loadImage("temple.jpg");
		ship = app.loadImage("ship.jpg");
		pyramid = app.loadImage("pyramid.jpg");
		
		vidas = app.loadImage("data/lifeui.png");
		
	}
	
	public void draw(int GameScreen) { // 0 temple, 1 ship, 2 pyramid
		
		app.rectMode(app.CENTER);
		
		switch (GameScreen) {
		case 0:
			app.image(temple, 640, 360);
			break;
		case 1:
			app.image(ship, 640, 360);
			break;
		case 2:
			app.image(pyramid, 640, 360);
			break;

		default:
			break;
		}
		
		app.fill(0);
		app.rect(25, 360, 50, 720); //left limit
		app.rect(1255, 360, 50, 720); // right limit
		app.rect(640, 695, 1280, 50); // down limit
		app.rect(640, 298, 440, 50); // top platform
		app.rect(370, 500, 440, 50); // left platform
		app.rect(910, 500, 440, 50); // right platform
		
	}

}
