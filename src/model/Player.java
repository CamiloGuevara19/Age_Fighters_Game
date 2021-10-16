package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Player {
	
	//;
	private PApplet app;
	private int x, y;
	
	public Player(PApplet app, int x, int y) {
		this.app = app;
		this.x = x;
		this.y = y;
	}
	
	public void draw(int characterSelect) {
		
		app.ellipseMode(app.CENTER);
		app.fill(255);
		app.ellipse(x, y, 100, 100);
		
		//Player 1
		switch (characterSelect) { // 0 samurai, 1 pirate, 2 azteck
		
		case 0:
			app.ellipse(x, y, 100, 100);
			break;
		case 1:
			
			break;
		case 2:
			
			break;
			

		default:
			break;
		}
		
		//Player 2
		switch (characterSelect) { // 0 samurai, 1 pirate, 2 azteck
		
		case 0:
			app.ellipse(x, y, 100, 100);
			break;
		case 1:
			
			break;
		case 2:
			
			break;
			

		default:
			break;
		}
	}

}
