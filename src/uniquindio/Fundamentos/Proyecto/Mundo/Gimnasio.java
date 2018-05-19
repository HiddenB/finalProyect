package uniquindio.Fundamentos.Proyecto.Mundo;

import java.util.ArrayList;

public class Gimnasio {
	private ArrayList<Administrador> misAdmin;
	private ArrayList<Ciudad> misCiudades;
	private ArrayList<Actividades> misActividades;
	private ArrayList<Agenda> miAgenda;
	
	private String nombre;
	private String ciudad;
	
	public ArrayList<Administrador> getMisAdmin() {
		return misAdmin;
	}


	public ArrayList<Ciudad> getMisCiudades() {
		return misCiudades;
	}


	public ArrayList<Actividades> getMisActividades() {
		return misActividades;
	}


	public ArrayList<Agenda> getMiAgenda() {
		return miAgenda;
	}


	public String getNombre() {
		return nombre;
	}


	public String getCiudad() {
		return ciudad;
	}


	public Gimnasio(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	
	

}
