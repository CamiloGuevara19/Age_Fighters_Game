package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Player implements Runnable{
	
	public final static String WALK = "walk";
	public final static String JUMP = "jump";
	public final static String FALL = "fall";
	public final static String DEFAULT = "default";
	public final static String ATTACK = "attack";
	public final static String BLOCK = "block";
	
	private String action;
	private Boolean rightAn;
	
	private int jumpTimer, runTimer, fallTimer, attackTimer;
	
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
	private int posX, posY;
	private int health = 60;
	
	public Player(PApplet app, int posX, int posY) {
		
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		
		action = DEFAULT;
		rightAn = true;
		
		jumpTimer = 0;
		runTimer = 0;
		fallTimer = 0;
		attackTimer = 0;
		
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
		app.ellipse(posX, posY, 100, 100);
		
		//Player 1
		switch (characterSelect) { // 0 samurai, 1 pirate, 2 azteck
		
		case 0:
			
			switch (action) { //Different animations for samurai
			
			case DEFAULT:
				
				break;
			case JUMP:
				
				break;
			case FALL:
				
				break;
			case WALK:
				
				break;
			case ATTACK:
				
				break;
			case BLOCK:
				
				break;

			default:
				break;
			}
			
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
	
	@Override
	public void run() {
		
	}
	
	private void jumpAnimationAzteck() {
		
		if(rightAn == false) {
			if (jumpTimer >= 0 && jumpTimer < 20) {
				app.image(AS[0], posX, posY);
			}else if(jumpTimer >= 20 && jumpTimer < 40) {
				app.image(AS[1], posX, posY);
			}else if(jumpTimer >= 40 && jumpTimer < 60) {
				app.image(AS[2], posX, posY);
			}else if(jumpTimer >= 60 && jumpTimer < 80) {
				app.image(ACA[0], posX, posY);
			}else if(jumpTimer >= 80 && jumpTimer < 100) {
				app.image(ACA[1], posX, posY);
			}else if(jumpTimer >= 100 && jumpTimer < 120) {
				app.image(ACA[2], posX, posY);
			}
		}
		
		if(rightAn == true) {
			if (jumpTimer >= 0 && jumpTimer < 20) {
				app.image(ASD[0], posX, posY);
			}else if(jumpTimer >= 20 && jumpTimer < 40) {
				app.image(ASD[1], posX, posY);
			}else if(jumpTimer >= 40 && jumpTimer < 60) {
				app.image(ASD[2], posX, posY);
			}else if(jumpTimer >= 60 && jumpTimer < 80) {
				app.image(ACAD[0], posX, posY);
			}else if(jumpTimer >= 80 && jumpTimer < 100) {
				app.image(ACAD[1], posX, posY);
			}else if(jumpTimer >= 100 && jumpTimer < 120) {
				app.image(ACAD[2], posX, posY);
			}
		}
		
		jumpTimer++;
		
		if(jumpTimer>120) {
			jumpTimer = 0;
			action = DEFAULT;
		}
	}
	
	private void jumpAnimationPirate() {
		
		if(rightAn == false) {
			if (jumpTimer >= 0 && jumpTimer < 20) {
				app.image(PS[0], posX, posY);
			}else if(jumpTimer >= 20 && jumpTimer < 40) {
				app.image(PS[1], posX, posY);
			}else if(jumpTimer >= 40 && jumpTimer < 60) {
				app.image(PS[2], posX, posY);
			}else if(jumpTimer >= 60 && jumpTimer < 80) {
				app.image(PS[2], posX, posY);
			}else if(jumpTimer >= 80 && jumpTimer < 100) {
				app.image(PS[1], posX, posY);
			}else if(jumpTimer >= 100 && jumpTimer < 120) {
				app.image(PS[0], posX, posY);
			}
		}
		
		if(rightAn == true) {
			if (jumpTimer >= 0 && jumpTimer < 20) {
				app.image(PSD[0], posX, posY);
			}else if(jumpTimer >= 20 && jumpTimer < 40) {
				app.image(PSD[1], posX, posY);
			}else if(jumpTimer >= 40 && jumpTimer < 60) {
				app.image(PSD[2], posX, posY);
			}else if(jumpTimer >= 60 && jumpTimer < 80) {
				app.image(PSD[2], posX, posY);
			}else if(jumpTimer >= 80 && jumpTimer < 100) {
				app.image(PSD[1], posX, posY);
			}else if(jumpTimer >= 100 && jumpTimer < 120) {
				app.image(PSD[0], posX, posY);
			}
		}
		
		jumpTimer++;
		
		if(jumpTimer>120) {
			jumpTimer = 0;
			action = DEFAULT;
		}
	}
	
	private void jumpAnimationSamurai() {
		
		if(rightAn == false) {
			if (jumpTimer >= 0 && jumpTimer < 20) {
				app.image(SS[0], posX, posY);
			}else if(jumpTimer >= 20 && jumpTimer < 40) {
				app.image(SS[1], posX, posY);
			}else if(jumpTimer >= 40 && jumpTimer < 60) {
				app.image(SS[2], posX, posY);
			}else if(jumpTimer >= 60 && jumpTimer < 80) {
				app.image(SCA[0], posX, posY);
			}else if(jumpTimer >= 80 && jumpTimer < 100) {
				app.image(SCA[1], posX, posY);
			}else if(jumpTimer >= 100 && jumpTimer < 120) {
				app.image(SCA[2], posX, posY);
			}
		}
		
		if(rightAn == true) {
			if (jumpTimer >= 0 && jumpTimer < 20) {
				app.image(SSD[0], posX, posY);
			}else if(jumpTimer >= 20 && jumpTimer < 40) {
				app.image(SSD[1], posX, posY);
			}else if(jumpTimer >= 40 && jumpTimer < 60) {
				app.image(SSD[2], posX, posY);
			}else if(jumpTimer >= 60 && jumpTimer < 80) {
				app.image(SCAD[0], posX, posY);
			}else if(jumpTimer >= 80 && jumpTimer < 100) {
				app.image(SCAD[1], posX, posY);
			}else if(jumpTimer >= 100 && jumpTimer < 120) {
				app.image(SCAD[2], posX, posY);
			}
		}
		
		jumpTimer++;
		
		if(jumpTimer>120) {
			jumpTimer = 0;
			action = DEFAULT;
		}
	}
	
	private void walkAnimationAzteck() {
		
		if(rightAn == false) {
			if (runTimer >= 0 && runTimer < 10) {
				app.image(AC[0], posX, posY);
			}else if(runTimer >= 10 && runTimer < 20) {
				app.image(AC[1], posX, posY);
			}else if(runTimer >= 20 && runTimer < 30) {
				app.image(AC[2], posX, posY);
			}
		}
		
		if(rightAn == true) {
			if (runTimer >= 0 && runTimer < 10) {
				app.image(ACD[0], posX, posY);
			}else if(runTimer >= 10 && runTimer < 20) {
				app.image(ACD[1], posX, posY);
			}else if(runTimer >= 20 && runTimer < 30) {
				app.image(ACD[2], posX, posY);
			}
		}
		
		runTimer++;
		
		if(runTimer>30) {
			runTimer = 0;
			action = DEFAULT;
		}
	}
	
	private void walkAnimationPirate() {
		
		if(rightAn == false) {
			if (runTimer >= 0 && runTimer < 10) {
				app.image(PC[0], posX, posY);
			}else if(runTimer >= 10 && runTimer < 20) {
				app.image(PC[1], posX, posY);
			}else if(runTimer >= 20 && runTimer < 30) {
				app.image(PC[2], posX, posY);
			}
		}
		
		if(rightAn == true) {
			if (runTimer >= 0 && runTimer < 10) {
				app.image(PCD[0], posX, posY);
			}else if(runTimer >= 10 && runTimer < 20) {
				app.image(PCD[1], posX, posY);
			}else if(runTimer >= 20 && runTimer < 30) {
				app.image(PCD[2], posX, posY);
			}
		}
		
		runTimer++;
		
		if(runTimer>30) {
			runTimer = 0;
			action = DEFAULT;
		}
	}
	
	private void walkAnimationSamurai() {
		
		if(rightAn == false) {
			if (runTimer >= 0 && runTimer < 10) {
				app.image(SC[0], posX, posY);
			}else if(runTimer >= 10 && runTimer < 20) {
				app.image(SC[1], posX, posY);
			}else if(runTimer >= 20 && runTimer < 30) {
				app.image(SC[2], posX, posY);
			}
		}
		
		if(rightAn == true) {
			if (runTimer >= 0 && runTimer < 10) {
				app.image(SCD[0], posX, posY);
			}else if(runTimer >= 10 && runTimer < 20) {
				app.image(SCD[1], posX, posY);
			}else if(runTimer >= 20 && runTimer < 30) {
				app.image(SCD[2], posX, posY);
			}
		}
		
		runTimer++;
		
		if(runTimer>30) {
			runTimer = 0;
			action = DEFAULT;
		}
	}
	
	private void fallAnimationAzteck() {
		
		if(rightAn == false) {
			if (fallTimer >= 0 && fallTimer < 10) {
				app.image(ACA[0], posX, posY);
			}else if(fallTimer >= 10 && fallTimer < 20) {
				app.image(ACA[1], posX, posY);
			}else if(fallTimer >= 20 && fallTimer < 30) {
				app.image(ACA[2], posX, posY);
			}
		}
		
		if(rightAn == true) {
			if (fallTimer >= 0 && fallTimer < 10) {
				app.image(ACAD[0], posX, posY);
			}else if(fallTimer >= 10 && fallTimer < 20) {
				app.image(ACAD[1], posX, posY);
			}else if(fallTimer >= 20 && fallTimer < 30) {
				app.image(ACAD[2], posX, posY);
			}
		}
		
		fallTimer++;
		
		if(fallTimer>30) {
			fallTimer = 0;
			action = DEFAULT;
		}
	}
	
	private void fallAnimationPirate() {
		
		if(rightAn == false) {
			if (fallTimer >= 0 && fallTimer < 10) {
				app.image(PS[2], posX, posY);
			}else if(fallTimer >= 10 && fallTimer < 20) {
				app.image(PS[1], posX, posY);
			}else if(fallTimer >= 20 && fallTimer < 30) {
				app.image(PS[0], posX, posY);
			}
		}
		
		if(rightAn == true) {
			if (fallTimer >= 0 && fallTimer < 10) {
				app.image(PSD[2], posX, posY);
			}else if(fallTimer >= 10 && fallTimer < 20) {
				app.image(PSD[1], posX, posY);
			}else if(fallTimer >= 20 && fallTimer < 30) {
				app.image(PSD[0], posX, posY);
			}
		}
		
		fallTimer++;
		
		if(fallTimer>30) {
			fallTimer = 0;
			action = DEFAULT;
		}
	}
	
	private void fallAnimationSamurai() {
		
		if(rightAn == false) {
			if (fallTimer >= 0 && fallTimer < 10) {
				app.image(SCA[0], posX, posY);
			}else if(fallTimer >= 10 && fallTimer < 20) {
				app.image(SCA[1], posX, posY);
			}else if(fallTimer >= 20 && fallTimer < 30) {
				app.image(SCA[2], posX, posY);
			}
		}
		
		if(rightAn == true) {
			if (fallTimer >= 0 && fallTimer < 10) {
				app.image(SCAD[0], posX, posY);
			}else if(fallTimer >= 10 && fallTimer < 20) {
				app.image(SCAD[1], posX, posY);
			}else if(fallTimer >= 20 && fallTimer < 30) {
				app.image(SCAD[2], posX, posY);
			}
		}
		
		fallTimer++;
		
		if(fallTimer>30) {
			fallTimer = 0;
			action = DEFAULT;
		}
	}
	
	private void attackAnimationAzteck() {
		
		if(rightAn == false) {
			if (attackTimer >= 0 && attackTimer < 10) {
				app.image(AA[0], posX, posY);
			}else if(attackTimer >= 10 && attackTimer < 20) {
				app.image(AA[1], posX, posY);
			}else if(attackTimer >= 20 && attackTimer < 30) {
				app.image(AA[2], posX, posY);
			}
		}
		
		if(rightAn == true) {
			if (attackTimer >= 0 && attackTimer < 10) {
				app.image(AAD[0], posX, posY);
			}else if(attackTimer >= 10 && attackTimer < 20) {
				app.image(AAD[1], posX, posY);
			}else if(attackTimer >= 20 && attackTimer < 30) {
				app.image(AAD[2], posX, posY);
			}
		}
		
		attackTimer++;
		
		if(attackTimer>30) {
			attackTimer = 0;
			action = DEFAULT;
		}
	}
	
	private void attackAnimationPirate() {
		
		if(rightAn == false) {
			if (attackTimer >= 0 && attackTimer < 10) {
				app.image(PA[0], posX, posY);
			}else if(attackTimer >= 10 && attackTimer < 20) {
				app.image(PA[1], posX, posY);
			}else if(attackTimer >= 20 && attackTimer < 30) {
				app.image(PA[2], posX, posY);
			}
		}
		
		if(rightAn == true) {
			if (attackTimer >= 0 && attackTimer < 10) {
				app.image(PAD[0], posX, posY);
			}else if(attackTimer >= 10 && attackTimer < 20) {
				app.image(PAD[1], posX, posY);
			}else if(attackTimer >= 20 && attackTimer < 30) {
				app.image(PAD[2], posX, posY);
			}
		}
		
		attackTimer++;
		
		if(attackTimer>30) {
			attackTimer = 0;
			action = DEFAULT;
		}
	}
	
	private void attackAnimationSamurai() {
		
		if(rightAn == false) {
			if (attackTimer >= 0 && attackTimer < 10) {
				app.image(SA[0], posX, posY);
			}else if(attackTimer >= 10 && attackTimer < 20) {
				app.image(SA[1], posX, posY);
			}else if(attackTimer >= 20 && attackTimer < 30) {
				app.image(SA[2], posX, posY);
			}
		}
		
		if(rightAn == true) {
			if (attackTimer >= 0 && attackTimer < 10) {
				app.image(SAD[0], posX, posY);
			}else if(attackTimer >= 10 && attackTimer < 20) {
				app.image(SAD[1], posX, posY);
			}else if(attackTimer >= 20 && attackTimer < 30) {
				app.image(SAD[2], posX, posY);
			}
		}
		
		attackTimer++;
		
		if(attackTimer>30) {
			attackTimer = 0;
			action = DEFAULT;
		}
	}
	
//---------------------------------------------------------------------------------------------------------------//	
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
	
		public void setHealth(int health) {
			this.health = health;
		}
		
		public int getHealth() {
			return health;
		}
		
		public void setAction(String action) {
			this.action = action;
		}
		
		public Boolean getRightAn() {
			return rightAn;
		}
		
		public void setRightAn(Boolean rightAn) {
			this.rightAn = rightAn;
		}
		
		public int getPosY() {
			return posY;
		}
		
	public int getPosX() {
		return posX;
	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public String getAction() {
		return action;
	}

}
