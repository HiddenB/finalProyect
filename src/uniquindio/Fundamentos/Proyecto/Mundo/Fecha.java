package uniquindio.Fundamentos.Proyecto.Mundo;

public class Fecha {

	private int dia, mes, anio;
	private int horas;
	
	public Fecha(int dia, int mes, int anio, int horas) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.horas = horas;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	public int getHoras() {
		return horas;
	}

}
