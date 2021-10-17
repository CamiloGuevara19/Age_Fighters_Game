package view;

import model.GameScreen;
import model.IntroScreen;
import model.Player;
import model.SelectScreen;
import model.StartScreen;
import processing.core.PApplet;
import processing.core.PImage;
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
	
	PImage p1, p2, pinktext1, pinktext2; //UI images

	private int screen; //0 menu, 1 select, 2 intro, 3 game
	private int gameScreen;
	private int p1C=0, p2C=0;
	private boolean player1ok,player2ok,p1caer,p2caer,p1jump,p2jump;
	boolean gameOver = false;
	private int xp1 = 194,xp2 = 194;
	private String accion;

	@Override
	public void settings() {
		size(1280,720);
	}
	
	@Override
	public void setup() {
		
		//UI KIT
		p1 = loadImage("data/P1.png");
		p2 = loadImage("data/P2.png");
		pinktext1 = loadImage("data/pinktext.png");
		pinktext2 = loadImage("data/pinktext2.png");
		
		screen = 0;
		start = new StartScreen(this);
		select = new SelectScreen(this);
		intro = new IntroScreen(this);
		game = new GameScreen(this);
		
		player1ok = false;
		player2ok = false;
		p1caer = false;
		p2caer = false; 
		p1jump = false;
		p2jump = false;
		
		
		player1 = new Player(this, 200, 620);
		player2 = new Player(this, 1100, 620);
		player2.setRightAn(false);
		
		accion="no conectado";

		gameScreen = (int) random(3); // random for random map

		 tcp = TCPLauncher.getInstance();
		 tcp.setObserver(this);
         tcp.start();
	}

	@Override
	public void draw() {
		background(255);	
		
		
		System.out.println(accion);
		
		
		switch (screen) {
		
		
		case 0:
			start.draw();
		
			
			break;
		case 1:
			select.draw();
		
		//selector img y condicionales
			 image(p1, xp1, 170);
			 image(p2, xp2, 170);
			
			
			break;
		case 2:
			intro.draw();
			
			break;
		case 3:
			game.draw(gameScreen);
			player1.draw(p1C);
			player2.draw(p2C);
			
			
			
			
		
			
		
			
			//logica
			
			//caer
			gravedad(player1,p1caer,p1jump);
			gravedad(player2,p2caer,p2jump);
			
			
			
					
					
				
				
			
			
			if(gameOver==true) {
				if(accion.equals("1:pink")) {player1ok=true;}
				if(accion.equals("2:pink")) {player2ok=true;}
				if(player1ok==true&&player2ok==true) {
					reset();
					player1ok=false; 
					player2ok=false;}
			}
			break;
		default:
			break;
		}
	}
	
	private void reset() {
		// TODO Auto-generated method stub
		
	}

	
	private void gravedad(Player player,boolean caer, boolean playerJump) {
		if(playerJump==false) {
		//colisiones
		if(player.getPosY()<620) {
		if(player.getPosY()>620) {
			caer =false;
		}else {
			
			//primera pltarforma
			if(player.getPosX()>125&&player.getPosX()<615) {
				if(player.getPosY()>=450&&player.getPosY()>=425) {
					if(!accion.equals("down")) {
					caer = false;}
				}
			}else {
			
			//segunda pltaforma
				if(player.getPosX()>665&&player.getPosX()<615) {
					if(player.getPosY()>=450&&player.getPosY()>=425) {
						if(!accion.equals("down")) {
							caer = false;}
					}
				}else {
					//tercera pltaforma
					if(player.getPosX()>395&&player.getPosX()<885) {
						if(player.getPosY()>=248&&player.getPosY()>=223) {
							if(!accion.equals("down")) {
								caer = false;}}}
					else {
								caer = true;	
								}
					
				}
			}
				
			
		}
		if(caer = true) {
			player.setAction("FALL");
			player.setPosY(player.getPosY()+3);
		}else {
			player.setPosY(player.getPosY());
		}}
		if(player.getPosY()>620) {
			player.setPosY(623);
		}}
		
		
		
		
		
		System.out.print(caer);
		System.out.print(player.getPosY());
		
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
	

	public void msgRecibido(int id, String msg) {
		accion = id + ":" + msg;
switch (screen) {
		
		
		case 0:
			if(accion.equals("1:pink")) {player1ok=true;}
			if(accion.equals("2:pink")) {player2ok=true;}
			if(player1ok==true) {
				screen=1;
				player1ok=false; 
				player2ok=false;}
			
			break;
		case 1:
		//controles
			if(accion.equals("1:right")){p1C++;}
			if(accion.equals("1:left")){p1C--;}
			if(accion.equals("2:right")){p2C++;}
			if(accion.equals("2:left")){p2C--;}
		//selector img y condicionales
			 if(p1C>2) {p1C=0;} if(p2C>2) {p2C=0;}
			 if(p1C<0) {p1C=2;} if(p2C<0) {p2C=2;}
			 if(p1C==0) {xp1=194;} if(p2C==0) {xp2=194;}
			 if(p1C==1) {xp1=640;} if(p2C==1) {xp2=640;}
			 if(p1C==2) {xp1=1097;} if(p2C==2) {xp2=1097;}
			 //continuar
				if(accion.equals("1:pink")) {player1ok=true;}
				if(accion.equals("2:pink")) {player2ok=true;}
				if(player1ok==true) {
					screen=2;
					player1ok=false; 
					player2ok=false;}
			break;
		case 2:
			if(accion.equals("1:pink")) {player1ok=true;}
			if(accion.equals("2:pink")) {player2ok=true;}
			if(player1ok==true) {
				screen=3;
				player1ok=false; 
				player2ok=false;}
			break;
		case 3:
			
			
			//animaciones
			
			//ataque
			if(accion.equals("1:pink")) {
				player1.setAction("ATTACK");
			}
			
			if(accion.equals("2:pink")) {
				player2.setAction("ATTACK");
			}
			
			//bloqueo
			
			if(accion.equals("1:blue")) {
				player1.setAction("BLOCK");
			}
			
			if(accion.equals("2:blue")) {
				player2.setAction("BLOCK");
			}
			
			//caminar 
			
			if(accion.equals("1:right")) {
				player1.setRightAn(true);
				player1.setAction("WALK");
			}
			
			if(accion.equals("1:left")) {
				player1.setRightAn(false);
				player1.setAction("WALK");
			}
			
			if(accion.equals("2:right")) {
				player2.setRightAn(true);
				player2.setAction("WALK");
			}
			
			if(accion.equals("2:left")) {
				player2.setRightAn(false);
				player2.setAction("WALK");
			}
			
			//saltar
		
			if(accion.equals("1:up")&&p1jump==false) {
				p1jump=true;
				player1.setAction("JUMP");
				p1jump= false;
				
				
			}
			
			if(accion.equals("2:up")&&p2jump==false) {
				p2jump=true;
				player2.setAction("JUMP");
				p2jump= false;
				
			}
			
			
			if(gameOver==true) {
				if(accion.equals("1:pink")) {player1ok=true;}
				if(accion.equals("2:pink")) {player2ok=true;}
				if(player1ok==true&&player2ok==true) {
					reset();
					player1ok=false; 
					player2ok=false;}
			}
			break;
		default:
			break;
		}
		
	}

	}

