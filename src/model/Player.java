package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Player {
	
	//images azteck 
	private PImage A;
	private PImage Ad;
	private PImage AB;
	private PImage ABd;
	private PImage[] AA;
	private PImage[] AAD;
	private PImage[] AC;
	private PImage[] ACD;
	private PImage[] ACA;
	private PImage[] ACAD;
	private PImage[] AS;
	private PImage[] ASD;

	//images pirate
	private PImage P;
	private PImage Pd;
	private PImage PB;
	private PImage PBd;
	private PImage[] PA;
	private PImage[] PAD;
	private PImage[] PC;
	private PImage[] PCD;
	//private PImage[] PCA;
	//private PImage[] PCAD;
	private PImage[] PS;
	private PImage[] PSD;
	
	//images samurai
	private PImage S;
	private PImage Sd;
	private PImage SB;
	private PImage SBd;
	private PImage[] SA;
	private PImage[] SAD;
	private PImage[] SC;
	private PImage[] SCD;
	private PImage[] SCA;
	private PImage[] SCAD;
	private PImage[] SS;
	private PImage[] SSD;
	
	private PApplet app;
	private int x, y;
	
	public Player(PApplet app, int x, int y) {
		this.app = app;
		this.x = x;
		this.y = y;
		
		AA = new PImage[3];
		AAD = new PImage[3];
		AC = new PImage[3];
		ACD = new PImage[3];
		ACA = new PImage[3];
		ACAD = new PImage[3];
		AS = new PImage[3];
		ASD = new PImage[3];
		
		PA = new PImage[3];
		PAD = new PImage[3];
		PC = new PImage[3];
		PCD = new PImage[3];
		//PCA = new PImage[3];
		//PCAD = new PImage[3];
		PS = new PImage[3];
		PSD = new PImage[3];
		
		SA = new PImage[3];
		SAD = new PImage[3];
		SC = new PImage[3];
		SCD = new PImage[3];
		SCA = new PImage[3];
		SCAD = new PImage[3];
		SS = new PImage[3];
		SSD = new PImage[3];
		loadImages();
	}
	
	public void draw(int characterSelect) {
		
		app.ellipseMode(app.CENTER);
		app.fill(255);
		app.ellipse(x, y, 100, 100);
		
		//Player 1
		switch (characterSelect) { // 0 samurai, 1 pirate, 2 azteck
		
		case 0:
			
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
			
			break;
		case 1:
			
			break;
		case 2:
			
			break;
			

		default:
			break;
		}
	}
	
	public void loadImages() {
		//load asteck images
		A = app.loadImage("data/A.png");
		Ad = app.loadImage("data/Ad.png");
		AB = app.loadImage("data/AB.png");
		ABd = app.loadImage("data/ABd.png");
		
		for (int i = 0; i < AA.length; i++) {
			AA[i] = app.loadImage("data/AA"+(i+1)+".png");
		}
		for (int i = 0; i < AAD.length; i++) {
			AAD[i] = app.loadImage("data/AAD"+(i+1)+".png");
		}
		for (int i = 0; i < AC.length; i++) {
			AC[i] = app.loadImage("data/AC"+(i+1)+".png");
		}
		for (int i = 0; i < ACD.length; i++) {
			ACD[i] = app.loadImage("data/ACD"+(i+1)+".png");
		}
		for (int i = 0; i < ACA.length; i++) {
			ACA[i] = app.loadImage("data/ACA"+(i+1)+".png");
		}
		for (int i = 0; i < ACAD.length; i++) {
			ACAD[i] = app.loadImage("data/ACAD"+(i+1)+".png");
		}
		for (int i = 0; i < AS.length; i++) {
			AS[i] = app.loadImage("data/AS"+(i+1)+".png");
		}
		for (int i = 0; i < ASD.length; i++) {
			ASD[i] = app.loadImage("data/ASD"+(i+1)+".png");
		}
		
		//load pirate images
		P = app.loadImage("data/P.png");
		Pd = app.loadImage("data/Pd.png");
		PB = app.loadImage("data/PB.png");
		PBd = app.loadImage("data/PBd.png");
		
		for (int i = 0; i < PA.length; i++) {
			PA[i] = app.loadImage("data/PA"+(i+1)+".png");
		}
		for (int i = 0; i < AAD.length; i++) {
			PAD[i] = app.loadImage("data/PAD"+(i+1)+".png");
		}
		for (int i = 0; i < PC.length; i++) {
			PC[i] = app.loadImage("data/PC"+(i+1)+".png");
		}
		for (int i = 0; i < PCD.length; i++) {
			PCD[i] = app.loadImage("data/PCD"+(i+1)+".png");
		}
		/*for (int i = 0; i < PCA.length; i++) {
			PCA[i] = app.loadImage("data/PCA"+(i+1)+".png");
		}
		for (int i = 0; i < PCAD.length; i++) {
			PCAD[i] = app.loadImage("data/PCAD"+(i+1)+".png");
		}*/
		for (int i = 0; i < PS.length; i++) {
			PS[i] = app.loadImage("data/PS"+(i+1)+".png");
		}
		for (int i = 0; i < PSD.length; i++) {
			PSD[i] = app.loadImage("data/PSD"+(i+1)+".png");
		}
		
		//load samurai images
		S = app.loadImage("data/S.png");
		Sd = app.loadImage("data/Sd.png");
		SB = app.loadImage("data/SB.png");
		SBd = app.loadImage("data/SBd.png");
		
		for (int i = 0; i < SA.length; i++) {
			SA[i] = app.loadImage("data/SA"+(i+1)+".png");
		}
		for (int i = 0; i < SAD.length; i++) {
			SAD[i] = app.loadImage("data/SAD"+(i+1)+".png");
		}
		for (int i = 0; i < SC.length; i++) {
			SC[i] = app.loadImage("data/SC"+(i+1)+".png");
		}
		for (int i = 0; i < SCD.length; i++) {
			SCD[i] = app.loadImage("data/SCD"+(i+1)+".png");
		}
		for (int i = 0; i < SCA.length; i++) {
			SCA[i] = app.loadImage("data/SCA"+(i+1)+".png");
		}
		for (int i = 0; i < SCAD.length; i++) {
			SCAD[i] = app.loadImage("data/SCAD"+(i+1)+".png");
		}
		for (int i = 0; i < SS.length; i++) {
			SS[i] = app.loadImage("data/SS"+(i+1)+".png");
		}
		for (int i = 0; i < SSD.length; i++) {
			SSD[i] = app.loadImage("data/SSD"+(i+1)+".png");
		}
	}

}
