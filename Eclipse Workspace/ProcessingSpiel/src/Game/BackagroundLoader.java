package Game;

import java.io.File;

import processing.core.PApplet;
import processing.core.PImage;

public class BackagroundLoader extends PApplet{
	//////
	/// *****Initialisieren
	String[] char1 = new String[5];
	public int backgroundid = 0;
	haupt test = new haupt();
	//////	
	
	public BackagroundLoader() {
	}
	
	public  BackagroundLoader(PImage[] haupt){
		
		// Algorithmus für das auslesen der Dateien die im ordner Images/Background sind!
		int i=0;
		File verzeichnis = new File("Images/Background");  // Verzeichniss wird aufgerufen
		File[] files = verzeichnis.listFiles(); // Anzahl an dateien werden gesucht
		for(File file :files){
		    if(file.isFile()){ // Alle Dateien Werden gelesen
		       i++;
		   }
		}	
		System.out.println(i);
	
		// Laden der Bilder in das PImage Array Um Hintergründe zu laden
			for (int y = 0 ;  y < char1.length;++y){
				sketchPath();
				char1[y] = "Images/Background/background"+y+".jpg";
				haupt[y] = loadImage(char1[y]);
				System.out.println("erfolg");
			}
		
	}
	// Background Changer nach rechts
	public int backgroundchangerright(int bewegung){
		if (backgroundid == 0){
			backgroundid = backgroundid+1;
			bewegung = 50;
		}
		return bewegung;
	}
	
	// Background Changer nach links
	public int backgroundchangerleft(int bewegung){
		if (backgroundid == 1){
			backgroundid = backgroundid-1;
			bewegung = 500;
		}
		return bewegung;
		
	}
	
	

}
