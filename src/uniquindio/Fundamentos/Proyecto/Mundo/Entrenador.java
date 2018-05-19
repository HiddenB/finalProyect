package uniquindio.Fundamentos.Proyecto.Mundo;

import java.util.ArrayList;

public class Entrenador {
	private ArrayList<Actividades> miActividad;
	private String nombre, direccion, correo, estudios, preferencias;
	private int id, fechaNacimiento;

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public String getEstudios() {
		return estudios;
	}

	public String getPreferencias() {
		return preferencias;
	}

	public int getId() {
		return id;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Entrenador(String nombre, String direccion, String correo, String estudios, String preferencias, int id,
			int fechaNacimiento) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
		this.estudios = estudios;
		this.preferencias = preferencias;
		this.id = id;
		this.fechaNacimiento = fechaNacimiento;
	}

}
