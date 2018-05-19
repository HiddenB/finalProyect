package uniquindio.Fundamentos.Proyecto.Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import uniquindio.Fundamentos.Proyecto.Mundo.BoxWork;
import uniquindio.Fundamentos.Proyecto.Mundo.Cliente;
import uniquindio.Fundamentos.Proyecto.Mundo.Fecha;
import uniquindio.Fundamentos.Proyecto.Mundo.Gimnasio;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private VentanaCiudad miC;
	private VentanaAdministradorLocal miAdministradorLocal;
	private VentanaGym miVentanaGym;
	private Icon icono = new ImageIcon(
			getClass().getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/IconoDespedida.png"));
	private BoxWork miBoxWork;
	private JButton btnCrearNuevoCliente;
	private JButton btnSalir;
	private JButton btnAdministrar;
	private VentanaAdministradorLocal miAdmin;
	private JButton btnActividad;
	private VentanaActividad miVentanaActividad;
	private JLabel lblNewLabel_1;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				VentanaPrincipal.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/gimnasio.png")));
		miBoxWork = new BoxWork();
		setBounds(100, 100, 362, 262);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class
				.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/cooltext286842321679651.png")));
		lblNewLabel.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 141, 50);
		contentPane.add(lblNewLabel);

		btnCrearNuevoCliente = new JButton("Ingresar nuevo cliente");
		btnCrearNuevoCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCrearNuevoCliente.setBounds(74, 72, 175, 23);
		btnCrearNuevoCliente.addActionListener(this);
		contentPane.add(btnCrearNuevoCliente);

		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(
				VentanaPrincipal.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/boton-atras (1).png")));
		btnSalir.addActionListener(this);
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnSalir.setBounds(0, 190, 70, 23);
		contentPane.add(btnSalir);

		btnAdministrar = new JButton("Administrar");
		btnAdministrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdministrar.setBounds(74, 135, 175, 23);
		btnAdministrar.addActionListener(this);
		contentPane.add(btnAdministrar);

		btnActividad = new JButton("Realizar actividad");
		btnActividad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnActividad.addActionListener(this);
		btnActividad.setBounds(74, 102, 175, 23);
		contentPane.add(btnActividad);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(
				VentanaPrincipal.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/aptitud (3).png")));
		lblNewLabel_1.setBounds(115, 11, 213, 193);
		contentPane.add(lblNewLabel_1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCrearNuevoCliente) {
			VentanaCliente miVentanaCliente = new VentanaCliente(miAdministradorLocal, this, miVentanaGym);
			miVentanaCliente.setVisible(true);
			this.dispose();
		}
		if (e.getSource() == btnSalir) {
			this.dispose();
			VentanaCiudad miVentanaCiudad = new VentanaCiudad();
			miVentanaCiudad.setVisible(true);
		}
		if (e.getSource() == btnAdministrar) {
			VentanaAdministradorLocal miAdmin = new VentanaAdministradorLocal(this);
			miAdmin.setVisible(true);
			this.dispose();
		}
		if (e.getSource() == btnActividad) {
			miVentanaActividad= new VentanaActividad(this);
			miVentanaActividad.setVisible(true);
			this.dispose();
		}

	}

	public void agregarCliente(String nombre, String direccion, String correo, String categoria, int id, int edad,
			int pago) {
		miBoxWork.agregarCliente(nombre, direccion, correo, categoria, id, edad, pago);
	}

	public void agregarEntrenador(String nombre, String direccion, String correo, String estudios, String preferencias,
			int id, int fechaNacimiento) {
		miBoxWork.agregarEntrenador(nombre, direccion, correo, estudios, preferencias, id, fechaNacimiento);
	}

	public int calcularEdad(int dia, int mes, int anio) {
		return miBoxWork.calcularEdad(dia, mes, anio);
	}

	public String calcularCiudad(int n) {
		return miBoxWork.calcularCiudad(n);
	}

	public void guardarRegistro(Cliente miCliente, Fecha miFecha, Gimnasio miGym, String miActividad) {
		miBoxWork.guardarRegistro(miCliente, miFecha, miGym, miActividad);
	}

	public String calcularPrimerRequisito(String miGimnasio, String fechaI, String fechaF) {
		return miBoxWork.calcularPrimerRequisito(miGimnasio, fechaI, fechaF);
	}

	public boolean crearUsuarioP(String n, String k) {
		return miBoxWork.crearUsuarioP(n, k);
	}
}
