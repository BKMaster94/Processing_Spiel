package Game;

public class CharMovment {
	//BackagroundLoader backloader = new BackagroundLoader();
	haupt bla;
	public int animationright(int movment){ // Animationbewegung für Rechtsbewegung
		if(movment <= 4){ // Solagen die animation im rahmen ist wird diese ausgeführt
			movment++;
		}if (movment == 5){ // Wenn die animation außerhalb ist wird diese zurück gesetzt
			movment = 0;
		}
			return movment;
	}
	public int animtaiondown(int movment){// Animationsbewegung für die Bewegung nach unten Der rest ist wie vorher
		if(movment <= 10){
			movment++;
		}if (movment == 11){
			movment = 7;
		}
		return movment;
	}
	
	public int animationup(int movment){// Animationsbewegung für die Bewegung nach oben Der rest ist wie vorher
		if(movment <= 12){
			movment++;
		}if (movment == 17){
			movment = 12;
		}		
		return movment;
	}
	
	public int animationleft(int movment){// Animationsbewegung für die Bewegung nach links Der rest ist wie vorher
		if(movment <= 18){
			movment++;
		}if (movment == 23){
			movment = 18;
		}
		return movment;
	}
	////////////////////////////////////////////////////
	
	
	
	// Hier findet die gesamte bewegung stadt
	public int charbewegungrechts(int bewegung){
		
		bewegung = bewegung + 3; // 3 pixel pro bild für später
		return bewegung;
	}
	
	public int charbewegungstop(int bewegung){
		return bewegung;
	}
	
	public int charbewegunglinks(int bewegung){
		bewegung = bewegung - 3;
		return bewegung;
	}
	
	public int charbewegunghoch(int bewegung){
		bewegung = bewegung - 3;
		return bewegung;
	}
	
	public int charbewegungrunter(int bewegung){
		bewegung = bewegung + 3;
		return bewegung;
	}
}
