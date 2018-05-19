package uniquindio.Fundamentos.Proyecto.Mundo;

public class Cliente {

	private String nombre, direccion, correo, categoria;
	private int id, edad, pago;

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getId() {
		return id;
	}

	public int getEdad() {
		return edad;
	}

	public int getPago() {
		return pago;
	}

	public Cliente(String nombre, String direccion, String correo, String categoria, int id, int edad, int pago) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
		this.categoria = categoria;
		this.id = id;
		this.edad = edad;
		this.pago = pago;
	}
}
