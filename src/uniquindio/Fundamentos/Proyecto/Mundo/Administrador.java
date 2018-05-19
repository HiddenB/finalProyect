package uniquindio.Fundamentos.Proyecto.Mundo;

public class Administrador {

	private Gimnasio local;
	private Gimnasio general;

	public Administrador(Gimnasio loca, Gimnasio general) {
		this.local = loca;
		this.general = general;
	}

	public Gimnasio getLoca() {
		return local;
	}

	public Gimnasio getGeneral() {
		return general;
	}

}
