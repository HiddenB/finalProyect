package uniquindio.Fundamentos.Proyecto.Mundo;

import java.util.ArrayList;

public class Actividades {

	private Gimnasio fitCombat;
	private Gimnasio rumba;
	private Gimnasio spinning;
	private Gimnasio superAbdomen;
	private Gimnasio cardioHit;
	private Gimnasio bombonex;
	private Gimnasio twerking;

	public Actividades(Gimnasio fitCombat, Gimnasio rumba, Gimnasio spinning, Gimnasio superAbdomen, Gimnasio cardioHit,
			Gimnasio bombonex, Gimnasio twerking) {
		this.fitCombat = fitCombat;
		this.rumba = rumba;
		this.spinning = spinning;
		this.superAbdomen = superAbdomen;
		this.cardioHit = cardioHit;
		this.bombonex = bombonex;
		this.twerking = twerking;
	}

	public Gimnasio getFitCombat() {
		return fitCombat;
	}

	public Gimnasio getRumba() {
		return rumba;
	}

	public Gimnasio getSpinning() {
		return spinning;
	}

	public Gimnasio getSuperAbdomen() {
		return superAbdomen;
	}

	public Gimnasio getCardioHit() {
		return cardioHit;
	}

	public Gimnasio getBombonex() {
		return bombonex;
	}

	public Gimnasio getTwerking() {
		return twerking;
	}

}
