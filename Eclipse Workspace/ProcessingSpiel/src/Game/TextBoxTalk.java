package Game;

import processing.core.PApplet;
import processing.core.PFont;


public class TextBoxTalk{


	
	
	public void Textbox(String text , PApplet haupt){
		
	
		haupt.strokeWeight(10);
		haupt.rect(0,600,800,200,7);
		haupt.fill(50);
		//font = haupt.createFont("Blackadder ITC Standard", 24 , true);
		//haupt.textFont(font,24);
		haupt.text(text, 15, 620, 700, 800);
		haupt.textSize(24);
		haupt.fill(255);
	}
	
}
