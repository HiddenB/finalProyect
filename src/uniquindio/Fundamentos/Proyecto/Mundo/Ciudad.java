package uniquindio.Fundamentos.Proyecto.Mundo;

import java.util.ArrayList;

public class Ciudad {

	private ArrayList<Entrenador>misEntrenadores;
	private Gimnasio ciudad;
	
	public Ciudad(Gimnasio ciudad) {
		this.ciudad = ciudad;
	}
	
	public Gimnasio getCiudad() {
		return ciudad;
	}
		
}
