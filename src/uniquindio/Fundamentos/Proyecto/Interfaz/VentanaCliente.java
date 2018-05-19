package uniquindio.Fundamentos.Proyecto.Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;

import uniquindio.Fundamentos.Proyecto.Mundo.Cliente;
import uniquindio.Fundamentos.Proyecto.Mundo.Fecha;
import uniquindio.Fundamentos.Proyecto.Mundo.Gimnasio;

import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class VentanaCliente extends JFrame implements ActionListener {

	private JPanel contentPane;
	private VentanaAdministradorLocal miVentanaAdminL;
	private VentanaActividad miVentanaActividad;
	private VentanaCiudad miVentanaCiudad;
	private VentanaPrincipal miVentanaPrincipal;
	private VentanaGym miVentanaGym;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField textFieldId;
	private JTextField textFieldNombre;
	private JTextField textFieldDireccion;
	private JTextField textFieldCorreoElectronico;
	private JTextField textFieldDia;
	private JLabel lblIngreseCategoria;
	private JComboBox comboBoxCategoria;
	private JTextField textFieldMes;
	private JTextField textFieldAnio;
	private JPanel panel;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	/**
	 * Create the frame.
	 */
	public VentanaCliente(VentanaAdministradorLocal miVentanaAdminL,VentanaPrincipal miVentanaPrincipal,VentanaGym miVentanaGym) {
		this.miVentanaAdminL = miVentanaAdminL;
		this.miVentanaPrincipal= miVentanaPrincipal;
		setBounds(100, 100, 415, 331);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblRegistroDeClientes = new JLabel("");
		lblRegistroDeClientes.setIcon(new ImageIcon(VentanaCliente.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/cooltext286850222196246.png")));
		lblRegistroDeClientes.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblRegistroDeClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroDeClientes.setBounds(68, 11, 246, 19);
		contentPane.add(lblRegistroDeClientes);

		JLabel lblIngreseId = new JLabel("Ingrese id                                       :");
		lblIngreseId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIngreseId.setBounds(10, 47, 207, 14);
		contentPane.add(lblIngreseId);

		JLabel lblIngreseNombre = new JLabel("Ingrese nombre                            :");
		lblIngreseNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIngreseNombre.setBounds(10, 72, 207, 14);
		contentPane.add(lblIngreseNombre);

		JLabel lblNewLabel = new JLabel("Ingrese direccion                          :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 97, 207, 14);
		contentPane.add(lblNewLabel);

		JLabel lblIngrese = new JLabel("Ingrese correo electronico         : ");
		lblIngrese.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIngrese.setBounds(10, 122, 207, 14);
		contentPane.add(lblIngrese);

		JLabel lblNewLabel_1 = new JLabel("Ingrese fecha de nacimiento     :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 193, 184, 14);
		contentPane.add(lblNewLabel_1);

		textFieldId = new JTextField();
		textFieldId.setBounds(227, 44, 126, 20);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(227, 69, 126, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldDireccion = new JTextField();
		textFieldDireccion.setBounds(227, 94, 126, 20);
		contentPane.add(textFieldDireccion);
		textFieldDireccion.setColumns(10);

		textFieldCorreoElectronico = new JTextField();
		textFieldCorreoElectronico.setBounds(227, 119, 126, 20);
		contentPane.add(textFieldCorreoElectronico);
		textFieldCorreoElectronico.setColumns(10);

		textFieldDia = new JTextField();
		textFieldDia.setBounds(227, 190, 21, 20);
		contentPane.add(textFieldDia);
		textFieldDia.setColumns(10);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(105, 259, 89, 23);
		contentPane.add(btnCancelar);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(10, 259, 89, 23);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);

		lblIngreseCategoria = new JLabel("Ingrese categoria                         :");
		lblIngreseCategoria.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIngreseCategoria.setBounds(10, 153, 207, 14);
		contentPane.add(lblIngreseCategoria);

		comboBoxCategoria = new JComboBox();
		comboBoxCategoria.setBounds(227, 150, 127, 20);
		comboBoxCategoria.addItem("Estudiante");
		comboBoxCategoria.addItem("Otro");
		contentPane.add(comboBoxCategoria);

		textFieldMes = new JTextField();
		textFieldMes.setBounds(271, 190, 21, 20);
		contentPane.add(textFieldMes);
		textFieldMes.setColumns(10);

		textFieldAnio = new JTextField();
		textFieldAnio.setBounds(315, 190, 38, 20);
		contentPane.add(textFieldAnio);
		textFieldAnio.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("/");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(246, 193, 27, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("/");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(295, 193, 19, 14);
		contentPane.add(lblNewLabel_3);
		
		panel = new JPanel();
		panel.setToolTipText("\"Orden de fecha: DD/MM/AAAA\"");
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "ANEXO", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(197, 236, 207, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_4 = new JLabel("\"Orden de fecha: DD/MM/AAAA\"");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 11, 187, 33);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(VentanaCliente.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/usuario (2).png")));
		lblNewLabel_5.setBounds(143, 27, 246, 205);
		contentPane.add(lblNewLabel_5);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			this.dispose();
			miVentanaAdminL.setVisible(true);
		}
		if (e.getSource() == btnAceptar) {
			this.dispose();
			int anio = 0;
			int mes = 0;
			int dia = 0;
			int id = 0;
			String nombre = "";
			String direccion = "";
			String correo = "";

			if (textFieldNombre.getText().equals("") && textFieldDireccion.getText().equals("")
					&& textFieldDireccion.getText().equals("") && textFieldCorreoElectronico.getText().equals("")
					&& textFieldId.getText().equals("") && textFieldDia.getText().equals("")
					&& textFieldMes.getText().equals("") && textFieldAnio.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Debe llenar todos los campos requeridos");
			} else {
				nombre = textFieldNombre.getText();
				direccion = textFieldDireccion.getText();
				correo = textFieldCorreoElectronico.getText();
				String categoria = comboBoxCategoria.getSelectedItem().toString();
				id = Integer.parseInt(textFieldId.getText());
				dia = Integer.parseInt(textFieldDia.getText());
				mes = Integer.parseInt(textFieldMes.getText());
				anio = Integer.parseInt(textFieldAnio.getText());
				int pago = 80000;
				if (categoria.equals("Estudiante")) {
					pago = 80000;
				}
				if (categoria.equals("Otro")) {
					categoria = "otro";
					pago = 110000;
				}

				int edad = miVentanaPrincipal.calcularEdad(dia, mes, anio);
				miVentanaPrincipal.agregarCliente(nombre, direccion, correo, categoria, id, edad, pago);
				Cliente miCliente = new Cliente(nombre, direccion, correo, categoria, id, edad, pago);
				VentanaActividad miVentanaActividad = new VentanaActividad(miVentanaPrincipal);
				int horaA = miVentanaActividad.getHoras();
				Date fecha;
				String format = "dd/MM/yyyy";
				SimpleDateFormat formato = new SimpleDateFormat(format);
				fecha = new Date();
				String fecha1 = formato.format(fecha);
				String dato[] = fecha1.split("/");
				int diaA = Integer.parseInt(dato[0]);
				int mesA = Integer.parseInt(dato[1]);
				int yearA = Integer.parseInt(dato[2]);
				Fecha miFecha = new Fecha(diaA, mesA, yearA, horaA);
				VentanaGym miVentanaGym = new VentanaGym(miVentanaCiudad);
				String miGym1 = miVentanaGym.getGimnasio();
				String ciudad = miVentanaGym.getCiudad();
				Gimnasio miGym = new Gimnasio(miGym1, ciudad);
				String actividad = miVentanaActividad.getActividad();
				miVentanaPrincipal.guardarRegistro(miCliente, miFecha, miGym, actividad);
				JOptionPane.showMessageDialog(null, "Cliente registrado con exito");
				miVentanaPrincipal.setVisible(true);
			}

		}
	}
}
