package Game;

import java.io.File;

import processing.core.PApplet;
import processing.core.PImage;

public class BackagroundLoader extends PApplet{
	//////
	/// *****Initialisieren
	String[] char1 = new String[30];
	public int backgroundid = 0;
	haupt test = new haupt();
	public boolean testswitch = false;
	//////	

	public  BackagroundLoader(PImage[] haupt){
		//  für das auslesen der Dateien die im ordner Images/Background sind!
		int i=0;
		File verzeichnis = new File("Images/Background");  // Verzeichniss wird aufgerufen
		File[] files = verzeichnis.listFiles(); // Anzahl an dateien werden gesucht
		for(File file :files){
		    if(file.isFile()){ // Alle Dateien Werden gelesen
		       i++;
		   }
		}	
	
		// Laden der Bilder in das PImage Array Um Hintergründe zu laden
			for (int y = 0 ;  y < char1.length;++y){
				sketchPath();
				char1[y] = "Images/Background/background"+y+".png";
				haupt[y] = loadImage(char1[y]);
				System.out.println("erfolg");
			}
	}
	// Background changer nach oben
	public void backgroundchangerup(){
		if(backgroundid == 1){
			backgroundid = 5;
		}
		if(backgroundid == 2){
			backgroundid = 7;
		}
		if(backgroundid == 3){
			backgroundid = 8;
		}
		if(backgroundid == 4){
			backgroundid = 9;
		}
	}
	
	public void backgroundchangerudown(){
		if(backgroundid == 5){
			backgroundid = 1;
		}
		if(backgroundid == 7){
			backgroundid = 2;
		}
		if(backgroundid == 8){
			backgroundid = 3;
		}
		if(backgroundid == 9){
			backgroundid= 4;
		}
	}
	
	// Background Changer nach rechts
	public void backgroundchangerright(){
		if(backgroundid == 3){
			backgroundid = backgroundid+1;
		}
		if(backgroundid == 2){
			backgroundid = backgroundid+1;
		}
			if(backgroundid == 1){
				backgroundid = backgroundid+1;
			}
			if (backgroundid == 0){
		backgroundid = backgroundid+1;
		test.bewegunghorizontal = 500;
		}		
	}
	
	// Background Changer nach links
	public void backgroundchangerleft(){
		if (backgroundid == 1){
			backgroundid = backgroundid-1;			
		}
		if(backgroundid == 2){
			backgroundid = backgroundid -1;
		}
		if(backgroundid == 3){
			backgroundid = backgroundid -1;
			
		}
		if(backgroundid == 4){
			backgroundid = backgroundid -1;
		}
		
	}
}