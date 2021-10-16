package view;

import model.GameScreen;
import model.IntroScreen;
import model.Player;
import model.SelectScreen;
import model.StartScreen;
import processing.core.PApplet;

public class Principal extends PApplet{

	public static void main(String[] args) {
		PApplet.main("view.Principal");
	}
	
	StartScreen start;
	SelectScreen select;
	IntroScreen intro;
	GameScreen game;
	
	TCPLauncher tcp;
	
	Player player1;
	Player player2;
	
	private int screen; //0 menu, 1 select, 2 intro, 3 game
	private int gameScreen;
	
	private String accion;
	
	@Override
	public void settings() {
		size(1280,720);
	}
	
	@Override
	public void setup() {
		
		screen = 0;
		start = new StartScreen(this);
		select = new SelectScreen(this);
		intro = new IntroScreen(this);
		game = new GameScreen(this);
		
		player1 = new Player(this, 200, 620);
		player2 = new Player(this, 1100, 620);
		
		gameScreen = (int) random(3); // random for random map
		
		 tcp = TCPLauncher.getInstance();
		 tcp.setObserver(this);
         tcp.start();
	}
	
	@Override
	public void draw() {
		background(255);	
		
		switch (screen) {
		
		case 0:
			start.draw();
			break;
		case 1:
			select.draw();
			break;
		case 2:
			intro.draw();
			break;
		case 3:
			game.draw(gameScreen);
			player1.draw(0);
			player2.draw(0);
			break;

		default:
			break;
		}
	}

	
	@Override
	public void keyPressed() {
		
	}
	
	@Override
	public void mousePressed() {
		
//--------------------BUTTONS--------------------//
		
		// StartScreen --> SelectScreen
		if (screen == 0 && mouseX > (621 - (209 / 2))
				&& mouseX < (621 + (209 / 2))
				&& mouseY > (543 - (50 / 2))
				&& mouseY < (543 + (50 / 2))) {
			screen = 1;
		}
		
		// SelectScreen --> IntroScreen
		if (screen == 1 && mouseX > (640 - (110 / 2))
				&& mouseX < (640 + (110 / 2))
				&& mouseY > (619 - (50 / 2))
				&& mouseY < (619 + (50 / 2))) {
			screen = 2;
		}
		
		// IntroScreen --> GameScreen
		if (screen == 2 && mouseX > (640 - (110 / 2))
				&& mouseX < (640 + (110 / 2))
				&& mouseY > (568 - (50 / 2))
				&& mouseY < (568 + (50 / 2))) {
			screen = 3;
		}
	}
	
	@Override
	public void mouseDragged() {
		
	}
	
	@Override
	public void mouseReleased() {
		
	}
	
	public void msgRecibido(int id, String msg) {
		accion = id + ":" + msg;
	}

	}


