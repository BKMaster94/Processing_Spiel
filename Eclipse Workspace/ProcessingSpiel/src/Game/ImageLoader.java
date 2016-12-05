package Game;

import processing.core.PImage;

import java.io.File;

import processing.core.PApplet;

public class ImageLoader extends PApplet{
	/// *****Initialisieren
	String[] char1 = new String[30];
	//////	
	
	void LoadImageCharMov(PImage[] haupt){
		
		int i=0;
		File verzeichnis = new File("Images/CharMov/right");  // Verzeichniss wird aufgerufen
		File[] files = verzeichnis.listFiles(); // Anzahl an dateien werden gesucht
		for(File file :files){
		    if(file.isFile()){ // Alle Dateien Werden gelesen
		       i++;
		   }
		}
		System.out.println(i);
		
			for (int y = 0 ;  y < char1.length;y++){
				sketchPath();
				char1[y] = "Images/CharMov/right/Char"+y+".png";
				haupt[y] = loadImage(char1[y]); // Hier werden die Strings als PImage gegeben und vorgeladen
				System.out.println("erfolg");// Wenn alles erfolg eine Kontroll ausgabe
			}
			
	}
			
}
