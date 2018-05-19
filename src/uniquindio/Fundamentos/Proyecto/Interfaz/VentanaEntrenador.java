package uniquindio.Fundamentos.Proyecto.Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class VentanaEntrenador extends JFrame implements ActionListener {

	private JPanel contentPane;
	private VentanaPrincipal miVentanaPrincipal;
	private JTextField textFieldId;
	private JTextField textFieldNombre;
	private JTextField textFieldDireccion;
	private JTextField textFieldFechaNacimiento;
	private JTextField textFieldCorreoElectronico;
	private JTextField textFieldEstudios;
	private JComboBox comboBoxPreferencias;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JButton btnAleatorio;
	

	/**
	 * Create the frame.
	 */
	public VentanaEntrenador(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblRegistroDeEntrenadores = new JLabel("Registro de entrenadores");
		lblRegistroDeEntrenadores.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblRegistroDeEntrenadores.setBounds(126, 11, 194, 19);
		contentPane.add(lblRegistroDeEntrenadores);

		JLabel lblIngreseId = new JLabel("Ingrese id                             :");
		lblIngreseId.setBounds(10, 44, 182, 14);
		contentPane.add(lblIngreseId);

		textFieldId = new JTextField();
		textFieldId.setBounds(202, 41, 144, 20);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);

		JLabel lblIngreseNombre = new JLabel("Ingrese nombre               :");
		lblIngreseNombre.setBounds(10, 69, 182, 14);
		contentPane.add(lblIngreseNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(202, 66, 144, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		JLabel lblIngreseDireccion = new JLabel("Ingrese direccion           :");
		lblIngreseDireccion.setBounds(10, 94, 182, 14);
		contentPane.add(lblIngreseDireccion);

		textFieldDireccion = new JTextField();
		textFieldDireccion.setBounds(202, 91, 144, 20);
		contentPane.add(textFieldDireccion);
		textFieldDireccion.setColumns(10);

		JLabel lblIngreseCorreoElectronico = new JLabel("Ingrese correo electronico");
		lblIngreseCorreoElectronico.setBounds(10, 131, 182, 14);
		contentPane.add(lblIngreseCorreoElectronico);

		JLabel lblIngreseFechaDeNacimiento = new JLabel("Ingrese fecha de nacimiento");
		lblIngreseFechaDeNacimiento.setBounds(10, 156, 182, 14);
		contentPane.add(lblIngreseFechaDeNacimiento);

		textFieldFechaNacimiento = new JTextField();
		textFieldFechaNacimiento.setBounds(202, 153, 144, 20);
		contentPane.add(textFieldFechaNacimiento);
		textFieldFechaNacimiento.setColumns(10);

		textFieldCorreoElectronico = new JTextField();
		textFieldCorreoElectronico.setBounds(202, 122, 144, 20);
		contentPane.add(textFieldCorreoElectronico);
		textFieldCorreoElectronico.setColumns(10);

		JLabel lblIngreseEstudiosRealizados = new JLabel("Ingrese estudios realizados");
		lblIngreseEstudiosRealizados.setBounds(10, 181, 182, 14);
		contentPane.add(lblIngreseEstudiosRealizados);

		textFieldEstudios = new JTextField();
		textFieldEstudios.setBounds(202, 178, 144, 20);
		contentPane.add(textFieldEstudios);
		textFieldEstudios.setColumns(10);

		JLabel lblPreferencias = new JLabel("Preferencias");
		lblPreferencias.setBounds(10, 206, 182, 14);
		contentPane.add(lblPreferencias);

		comboBoxPreferencias = new JComboBox();
		comboBoxPreferencias.addItem("Crossfit");
		comboBoxPreferencias.addItem("Fit Combat");
		comboBoxPreferencias.addItem("Rumba");
		comboBoxPreferencias.addItem("Spining");
		comboBoxPreferencias.addItem("Super Abdomen");
		comboBoxPreferencias.addItem("Cardio Hit");
		comboBoxPreferencias.addItem("Bombonex");
		comboBoxPreferencias.addItem("Twerking");
		comboBoxPreferencias.setBounds(202, 203, 144, 20);
		contentPane.add(comboBoxPreferencias);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(10, 231, 89, 23);
		contentPane.add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(109, 231, 89, 23);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);

		btnAleatorio = new JButton("ADD");
		btnAleatorio.addActionListener(this);
		btnAleatorio.setBounds(349, 202, 57, 23);
		contentPane.add(btnAleatorio);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			this.setVisible(false);
			miVentanaPrincipal.setVisible(true);

		}
		if (e.getSource() == btnAleatorio) {
			// Aleatorio para pref.
			int aleatorio = (int) (Math.random() * 7) + 1;
			comboBoxPreferencias.setSelectedIndex(aleatorio);
		}
		if (e.getSource() == btnAceptar) {
			this.dispose();
			VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
			int id = Integer.parseInt(textFieldId.getText());
			String nombre = textFieldNombre.getText();
			String direccion = textFieldDireccion.getText();
			String correo = textFieldCorreoElectronico.getText();
			String estudios = textFieldEstudios.getText();
			int fecha = Integer.parseInt(textFieldFechaNacimiento.getText());
			String preferencia =comboBoxPreferencias.getSelectedItem().toString();
			miVentanaPrincipal.agregarEntrenador(nombre, direccion, correo, estudios, preferencia, id, fecha);
			JOptionPane.showMessageDialog(null, "Entrenador registrado con exito");
			miVentanaPrincipal.setVisible(true);

		}

	}
}