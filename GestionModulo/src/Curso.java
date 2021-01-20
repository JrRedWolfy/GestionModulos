import java.util.Arrays;

public class Curso {

	private String nombre;
	private String tutor;
	private Modulo vModulos[];
	
	
	
	
	public Curso(String nombre, String tutor) {
		this.nombre = nombre;
		this.tutor = tutor;
		this.vModulos = new Modulos[10];
	}




	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public Modulo[] getvModulos() {
		return vModulos;
	}

	public void setvModulos(Modulo[] vModulos) {
		this.vModulos = vModulos;
	}




	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", tutor=" + tutor + ", vModulos=" + Arrays.toString(vModulos) + "]";
	}
	
	
	
	
	
	
	
	
	
	//  "\n"   = Salto de linea.
	
	// Enemigos posibles en Morel: Engendros, Monstruos, Bestias o Humanos(Zurdos o miembros de la escuela del Lince)
	// Entre los humanos destacamos la posibilidad de Encantadores ya que podrían intentar reunir especimenes con quienes experimentar. 
	// Tambien saqueadores o Ladrones (Siendo la diferencia que los Ladrones son legales y jamas te asesinarian mientras que los Saqueadores no se rigen por las reglas de Ethica)
	// Entre los Engendros encontramos: La criatura del Puente(Una Vendedora a la cual intentaron asesinar lanzandola por el puente pero pero consiguio alcanzar un saliente antes de morir congelada en el agua. Quedó atrapada, su alma fue consumida y se transformó en una Dama del Camino)
	// Dama del camino: Se muestra como una mujer normal, pero si alguien trata de pasar el pue
	
	
}
