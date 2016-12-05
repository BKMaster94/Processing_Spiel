package Game;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PFont;

public class haupt extends PApplet{
// Initialisierung //////////////
	public int animationchanger=0;
	public int rightmov = 0;
	public int downmov= 6;
	public int upmov=0;
	public int leftmov=0;
	public int bewegungseitlich = 50;
	public int bewegunghorizontal = 50;
	int testvar =0;
	///////////
	public String textAusgabe ="Hallo Welt";
	///////////
	public PFont font;
	public PImage[] pimg = new PImage[30];
	public PImage[] backgroundimg = new PImage[9];
	PImage test;
	///////////
	public hitCollisionUmgebung coll = new hitCollisionUmgebung();
	public ImageLoader imgloader = new ImageLoader();
	public BackagroundLoader backloader;
	CharMovment charmov = new CharMovment();
	TextBoxTalk tbox = new TextBoxTalk();
	///////////
	boolean movmenthaltlinks = true;
	boolean movmenthaltrunter = true;
	boolean movmenthalthoch = true;
	boolean movmenthaltrechts = true;
///////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Game.haupt"); // Proccesing main wird aufgerufen
	}

	
	public void setup(){
		frameRate(20);		 // Framerate wird auf 20 gehalten
	}
	
	public void settings(){
		size(800,800); // Unser spiel wird in einem Fenster mit 800x600 geöffnet
		System.out.println(sketchPath()); // Der SketchPath wird ausgegeben, ist unser arbeitspfad für Dateien.
		imgloader.LoadImageCharMov(pimg); // Der Hauptcharackter wird geladen.
		backloader = new BackagroundLoader(backgroundimg); // Alle Hintergründe werden geladen
		System.out.println(pimg[5]);
		
	}
	
	
	public void draw(){
		System.out.println(frameRate);
		 background(backgroundimg[backloader.backgroundid]);	// Hintergrund der geladen wird
		 //System.out.println(backloader.backgroundid); 
		 tbox.Textbox(textAusgabe,this,font);
		 //System.out.println(wert);
		 image(pimg[animationchanger] ,bewegungseitlich, bewegunghorizontal);
		// System.out.println(animationchanger);
		 // Das wird der hauptcharackter
		 //System.out.println(bewegungseitlich);
		if(bewegungseitlich >= 570){ // Wenn char auf der x Achse 570 erreicht:
			bewegungseitlich = backloader.backgroundchangerright(bewegungseitlich); // Wird der Hintergrund gewechselt nach rechts
		}
		if(bewegungseitlich <= 20 ){ // Wenn der Char auf der X Achse auf 20 ist:
			bewegungseitlich = backloader.backgroundchangerleft(bewegungseitlich); // wird der hintergrund nach links geändert
		}
		
		if(keyPressed == false){ // Hier befindet sich die Idle Animation
			//delay(400); // Delay von 200 mili sekunden
			if (animationchanger == 6){ // einfacher Switch für die Idle Animation
				animationchanger = 7;
			}else{
				animationchanger = 6;
			}
		}
		
	}
	
	public void keyPressed(){ // Alle funktionen für Key presses
		//test platzhalter = new test(this);
		if((key == 'd' || key == 'D')){ // Bei tastentdruck d Passiert:
			//System.out.println("w");
				
			rightmov = charmov.animationright(rightmov);// Ruft funktion aus imageLoader aus für animation
				animationchanger = rightmov;
				bewegungseitlich = charmov.charbewegungrechts(bewegungseitlich); // der char bewegt sich in folgende richtung	
		}
		if((key == 'a' || key == 'A')){ // Bei Tastendruck a Passiert :
			
			if (bewegungseitlich < 0){ // Wenn der Charackter bei der x Achse kleiner als 0 ist:
				movmenthaltlinks = false;	// Darf char sich nicht in die richtung bewegen:
			}else{
				movmenthaltlinks = true; // Darf char sich in die richtung bewegen
			}

			if(backloader.backgroundid == 0){// Wenn der Backgroundid 0 ist also erstes bild:
				
				if(movmenthaltlinks == true){ // und der bool wert true ist
					bewegungseitlich = charmov.charbewegunglinks(bewegungseitlich); // Charackter bewegung in die richtung
				}else{
					
				}
				
			}else{ // Bei anderen backgrounds darf char sich bewegen
				bewegungseitlich = charmov.charbewegunglinks(bewegungseitlich);	
			}
				
		}
		if((key == 'w' || key == 'W')){ // Bei tastendruck w Passiert:
			//textAusgabe = "das ist die taste w";
			bewegunghorizontal = charmov.charbewegunghoch(bewegunghorizontal);// Char bewegt sich in die richtung
		}
		if((key == 's' || key == 'S')){ // Bei tastendtuck s Passiert:
			//textAusgabe = "das ist die taste s";
			if(bewegunghorizontal >= 530){
				
				movmenthaltrunter = false;
			}else{
				movmenthaltrunter = true;
			}
			if(movmenthaltrunter == true){
				downmov = charmov.animtaiondown(downmov);
				animationchanger = downmov;
				bewegunghorizontal = charmov.charbewegungrunter(bewegunghorizontal); // Char bewegt sich in die richtung
			}
		}
	}

}