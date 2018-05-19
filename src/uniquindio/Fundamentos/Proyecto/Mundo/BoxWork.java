package uniquindio.Fundamentos.Proyecto.Mundo;

import java.util.Date;

import javax.lang.model.type.MirroredTypeException;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class BoxWork {

	private ArrayList<Cliente> misClientes;
	private ArrayList<Gimnasio> misGimnasios;
	private ArrayList<Registro> misRegistros;
	private ArrayList<Entrenador> misEntrenadores;
	private Administrador miAdmin;
	private String id = "123";
	private String password = "123";

	public BoxWork() {
		misClientes = new ArrayList<>();
		misRegistros = new ArrayList<>();
		misEntrenadores = new ArrayList<>();
	}

	public int calcularEdad(int dia, int mes, int anio) {
		Date fecha;
		String format = "dd/MM/yyyy";
		SimpleDateFormat formato = new SimpleDateFormat(format);
		fecha = new Date();
		String fecha1 = formato.format(fecha);
		String dato[] = fecha1.split("/");
		int dia1 = Integer.parseInt(dato[0]);
		int mes1 = Integer.parseInt(dato[1]);
		int year = Integer.parseInt(dato[2]);
		int edadA = 0;
		if (mes > mes1) {
			edadA = (year - anio) - 1;
		}
		if (mes < mes1) {
			edadA = (year - anio);
		}
		if (mes == mes1) {
			if (dia >= dia1) {
				edadA = year - anio;
			} else {
				edadA = (year - anio) - 1;
			}
		}
		return edadA;
	}

	public void agregarCliente(String nombre, String direccion, String correo, String categoria, int id, int edad,
			int pago) {
		Cliente miCliente = new Cliente(nombre, direccion, correo, categoria, id, edad, pago);
		misClientes.add(miCliente);
	}

	public void agregarEntrenador(String nombre, String direccion, String correo, String estudios, String preferencias,
			int id, int fechaNacimiento) {
		Entrenador miEntrenador = new Entrenador(nombre, direccion, correo, estudios, preferencias, fechaNacimiento,
				id);
		misEntrenadores.add(miEntrenador);
	}

	public String calcularCiudad(int n) {
		String ciudad = "";
		if (n == 0) {
			ciudad = "Armenia";
		}
		if (n == 1) {
			ciudad = "Pereira";
		}
		if (n == 2) {
			ciudad = "Medellín";
		}
		if (n == 3) {
			ciudad = "Bogotá";
		}
		if (n == 4) {
			ciudad = "Cartagena";
		}
		if (n == 5) {
			ciudad = "Cali";
		}
		return ciudad;
	}

	public void guardarRegistro(Cliente miCliente, Fecha miFecha, Gimnasio miGym, String miActividad) {
		Registro miR = new Registro(miCliente, miFecha, miGym, miActividad);
		misRegistros.add(miR);
	}

	public String calcularPrimerRequisito(String miGimnasio, String fechaI, String fechaF) {
		String nombre = miGimnasio;
		ArrayList<Fecha> misFechas = new ArrayList<>();
		Gimnasio miGym = null;
		Fecha miFecha = null;
		String[] fecha = fechaI.split("/");
		int diaI = Integer.parseInt(fecha[0]);
		int mesI = Integer.parseInt(fecha[1]);
		int yearI = Integer.parseInt(fecha[2]);
		String[] fecha2 = fechaF.split("/");
		int diaF = Integer.parseInt(fecha2[0]);
		int mesF = Integer.parseInt(fecha2[1]);
		int yearF = Integer.parseInt(fecha2[2]);
		for (int i = 0; i < misRegistros.size(); i++) {
			miGym = misRegistros.get(i).getMiGym();
			String nombre2 = miGym.getNombre();
			if (nombre.equals(nombre2)) {
				miFecha = misRegistros.get(i).getMiFecha();
				if (miFecha.getDia() >= diaI && miFecha.getDia() <= diaF && miFecha.getMes() >= mesI
						&& miFecha.getMes() <= mesF) {
					misFechas.add(miFecha);
				}
			}
		}
		String fechaR = "";
		int diaC = 0;
		int diaV = 0;
		for (int i = 0; i < misFechas.size(); i++) {
			diaC = misFechas.get(i).getDia();
			for (int j = 0; j < misFechas.size(); j++) {
				diaV = misFechas.get(j).getDia();
				if (diaC == diaV) {
					fechaR = diaC + "/" + misFechas.get(i).getMes() + "/" + misFechas.get(i).getAnio();
				}
			}
		}

		return fechaR;
	}

	public String calcularRequisito4(int interMenor, int interMayor) {
		ArrayList<String> misActividades1 = new ArrayList<>();
		for (int i = 0; i < misRegistros.size(); i++) {
			if (misRegistros.get(i).getMiCliente().getEdad() >= interMenor
					&& misRegistros.get(i).getMiCliente().getEdad() <= interMayor) {
				misActividades1.add(misRegistros.get(i).getMiActividad());
			}
		}
		String actividad1 = hallarMasRepetido(misActividades1);
		return actividad1;
	}

	public String hallarMasRepetido(ArrayList<String> misStrings) {
		String dos = "";
		String uno = "";
		String tres = "";
		int cont = 0;
		int contMayor = 0;
		for (int i = 0; i < misStrings.size(); i++) {
			uno = misStrings.get(i);
			for (int j = 0; j < misStrings.size(); j++) {
				dos = misStrings.get(j);
				if (uno.equals(2)) {
					cont++;
				}
				if (cont > contMayor) {
					contMayor = cont;
					tres = misStrings.get(j);
				}
			}
		}
		return tres;
	}

	public boolean crearUsuarioP(String n, String k) {

		boolean centinela = false;

		if (n.equalsIgnoreCase(id) && k.equalsIgnoreCase(password)) {
			centinela = true;
		}
		return centinela;
	}

	// public ArrayList<String> calcularGyms(String ciudad) {
	// ArrayList<String> ciudades = new ArrayList<>();
	//
	// if (ciudad.equals("Armenia")) {
	// ciudades.add("Alpha GYM");
	// ciudades.add("Omega GYM");
	// ciudades.add("Betha GYM");
	// } else if (ciudad.equals("Pereira")) {
	// ciudades.add("World GYM");
	// ciudades.add("Fit GYM");
	// ciudades.add("VIP GYM");
	// } else if (ciudad.equals("Medellin")) {
	// ciudades.add("Be GYM");
	// ciudades.add("Okay GYM");
	// ciudades.add("Y+ GYM");
	// } else if (ciudad.equals("Bogota")) {
	// ciudades.add("Power GYM");
	// ciudades.add("Fisic GYM");
	// ciudades.add("Gold GYM");
	// } else if (ciudad.equals("Cartagena")) {
	// ciudades.add("Heavy GYM");
	// ciudades.add("YKM GYM");
	// ciudades.add("Plate GYM");
	// }
	// if (ciudad.equals("Cali")) {
	// ciudades.add("Rare GYM");
	// ciudades.add("Sport GYM");
	// ciudades.add("Ralph GYM");
	// }
	// return ciudades;
	// }

}
