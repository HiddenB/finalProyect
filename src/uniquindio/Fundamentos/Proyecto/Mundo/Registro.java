package uniquindio.Fundamentos.Proyecto.Mundo;

public class Registro {

	private Cliente miCliente;
	private Fecha miFecha;
	private Gimnasio miGym;
	private String miActividad;
	
	public Registro(Cliente miCliente, Fecha miFecha, Gimnasio miGym,String miActividad) {
		this.miActividad=miActividad;
		this.miCliente = miCliente;
		this.miFecha = miFecha;
		this.miGym = miGym;
	}

	public String getMiActividad() {
		return miActividad;
	}

	public Cliente getMiCliente() {
		return miCliente;
	}

	public Fecha getMiFecha() {
		return miFecha;
	}

	public Gimnasio getMiGym() {
		return miGym;
	}
	
}
