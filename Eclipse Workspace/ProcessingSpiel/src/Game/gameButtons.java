package Game;

import controlP5.*;
import processing.core.PApplet;

public class gameButtons {
	public ControlP5 buttonForAll;
	
	public void buttonsetup(PApplet haupt){
		buttonForAll = new ControlP5(haupt);
	buttonForAll.addButton("test")
	.setValue(0)
	.setPosition(200,700)
	.setSize(100,50);
	buttonForAll.hide();
	
	buttonForAll.addButton("Antwort")
	.setValue(0)
	.setPosition(50,700)
	.setSize(100,50);
	buttonForAll.hide();
	}
	
	
	
	
}