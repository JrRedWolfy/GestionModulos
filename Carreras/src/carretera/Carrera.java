package carretera;

public class Carrera {

	public Carrera() {
		// TODO Auto-generated constructor stub
	}

	public void mostrarCarretera() {
		
		int distancia=1600;
		
		int distanciaRec = 220;
		
		String posicion = "...";
		
		String carril = "d";  // d, c , i
		
		
		for (int i = (distanciaRec-6); i <= (distanciaRec + 7); i++) {
			
			if (i == distanciaRec) {
				
				if (carril == "d") {
					posicion = "..O";
				} else {
					if (carril == "c") {
						posicion = ".O.";
					} else {
						posicion = "O..";
					}
				}
			}
			
				System.out.println("|" + posicion + "|");
				posicion = "...";
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
