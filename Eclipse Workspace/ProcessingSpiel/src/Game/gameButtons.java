package Game;

import controlP5.*;
import processing.core.PApplet;

public class gameButtons {
	public ControlP5 buttonBoss1;
	public ControlP5 buttonBoss2;
	public ControlP5 buttonBoss3;
	public ControlP5 buttonBoss4;
	
	public void buttonsetup(PApplet haupt){
		buttonBoss1 = new ControlP5(haupt);
		buttonBoss2 = new ControlP5(haupt);
		buttonBoss3 = new ControlP5(haupt);
		buttonBoss4 = new ControlP5(haupt);
		
		buttonBoss1.addButton("WildLands")
	.setLabel("Wastelands")
	.setValue(0)
	.setPosition(50,700)
	.setSize(100,50);
		buttonBoss1.hide();
	
		buttonBoss1.addButton("Fallout")
	.setLabel("Fallout")
	.setValue(0)
	.setPosition(200,700)
	.setSize(100,50);
		buttonBoss1.hide();
	
		buttonBoss1.addButton("MadMax")
	.setLabel("Mad Max")
	.setValue(0)
	.setPosition(350,700)
	.setSize(100,50);
		buttonBoss1.hide();
	
		buttonBoss1.addButton("DarkSouls")
	.setLabel("Dark Souls")
	.setValue(0)
	.setPosition(500,700)
	.setSize(100,50);
		buttonBoss1.hide();
		
		buttonBoss2.addButton("DOOM")
		.setValue(0)
		.setPosition(50,700)
		.setSize(100,50);
		buttonBoss2.hide();
		
		buttonBoss2.addButton("TombRaider")
		.setLabel("Tomb Raider")
		.setValue(0)
		.setPosition(200,700)
		.setSize(100,50);
		buttonBoss2.hide();
		
		buttonBoss2.addButton("FinalFantasy")
		.setLabel("Final Fantasy")
		.setValue(0)
		.setPosition(350,700)
		.setSize(100,50);
		buttonBoss2.hide();
		
		buttonBoss2.addButton("ChronoTrigger")
		.setLabel("Chrono Trigger")
		.setValue(0)
		.setPosition(500,700)
		.setSize(100,50);
		buttonBoss2.hide();
		
		buttonBoss3.addButton("megami")
		.setLabel("Megami Tensei")
		.setValue(0)
		.setPosition(50,700)
		.setSize(100,50);
		buttonBoss3.hide();
		
		buttonBoss3.addButton("persona")
		.setLabel("Persona")
		.setValue(0)
		.setPosition(200,700)
		.setSize(100,50);
		buttonBoss3.hide();

		buttonBoss3.addButton("lostbible")
		.setLabel("Lost Bible")
		.setValue(0)
		.setPosition(350,700)
		.setSize(100,50);
		buttonBoss3.hide();
		
		buttonBoss3.addButton("soulhackers")
		.setLabel("Soul Hackers")
		.setValue(0)
		.setPosition(500,700)
		.setSize(100,50);
		buttonBoss3.hide();
		
		buttonBoss4.addButton("jesus")
		.setLabel("Jesus")
		.setValue(0)
		.setPosition(50,700)
		.setSize(100,50);
		buttonBoss4.hide();
		
		buttonBoss4.addButton("cuthulu")
		.setLabel("Cthulu")
		.setValue(0)
		.setPosition(200,700)
		.setSize(100,50);
		buttonBoss4.hide();
		
		buttonBoss4.addButton("Diablo")
		.setLabel("Diablo")
		.setValue(0)
		.setPosition(350,700)
		.setSize(100,50);
		buttonBoss4.hide();
		
		buttonBoss4.addButton("anubis")
		.setLabel("Anubis")
		.setValue(0)
		.setPosition(500,700)
		.setSize(100,50);
		buttonBoss4.hide();
		
	}
	
	
	
	
	
}
