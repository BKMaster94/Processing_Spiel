package Game;



public class hitCollisionUmgebung {
	//////////// Initialisierung
	BackagroundLoader test;
	
	
	
	
	////////////
	
	
	public boolean collisionright(boolean darflaufen, int bewegungseitlich,int bewegunghorizontal){
		test = new BackagroundLoader();
		if (test.backgroundid == 0){
			System.out.println("tests");
			if(bewegungseitlich >= 20 && bewegungseitlich <= 50 ){
				darflaufen = false;
		}else{
			darflaufen = true;
		}

		
	}
		return darflaufen;
	}
}
