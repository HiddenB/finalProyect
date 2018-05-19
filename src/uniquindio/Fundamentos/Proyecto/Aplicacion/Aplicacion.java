package uniquindio.Fundamentos.Proyecto.Aplicacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.ws.handler.MessageContext;

import uniquindio.Fundamentos.Proyecto.Interfaz.VentanaCiudad;
import uniquindio.Fundamentos.Proyecto.Interfaz.VentanaJtable;
import uniquindio.Fundamentos.Proyecto.Interfaz.VentanaPrincipal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Aplicacion extends JFrame implements ActionListener {

	private JPanel contentPane;
	private VentanaCiudad miC;
	private JLabel lblUsuario;
	private JLabel lblId;
	private JTextField textFieldUsuario;
	private JPasswordField passwordField;
	private JButton btnAceptar;
	private VentanaPrincipal miVentanaPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion frame = new Aplicacion();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Aplicacion() {

		miVentanaPrincipal = new VentanaPrincipal();
		setTitle("   FinalProyect\r\n");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Aplicacion.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/login.png")));
		setBounds(100, 100, 325, 152);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblUsuario = new JLabel("");
		lblUsuario.setIcon(new ImageIcon(
				Aplicacion.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/carnet-de-identidad.png")));
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsuario.setBounds(36, 39, 35, 26);
		contentPane.add(lblUsuario);

		lblId = new JLabel("");
		lblId.setIcon(new ImageIcon(
				Aplicacion.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/ojo-de-cerradura.png")));
		lblId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblId.setHorizontalAlignment(SwingConstants.LEFT);
		lblId.setBounds(36, 76, 35, 22);
		contentPane.add(lblId);

		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(110, 45, 113, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(110, 78, 113, 20);
		contentPane.add(passwordField);

		JLabel lblLogin = new JLabel("LOGIN GERENTE N.");
		lblLogin.setFont(new Font("Blue Highway D Type", Font.BOLD, 13));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(93, 11, 130, 23);
		contentPane.add(lblLogin);

		btnAceptar = new JButton("");
		btnAceptar.setIcon(new ImageIcon(
				Aplicacion.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/entrar (1).png")));
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(250, 48, 47, 41);
		contentPane.add(btnAceptar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			char[] l = passwordField.getPassword();
			String a = String.valueOf(l);
			String n = textFieldUsuario.getText();
			if (this.miVentanaPrincipal.crearUsuarioP(n, a) == true) {
				VentanaCiudad miVentanaCiudad = new VentanaCiudad();
				miVentanaCiudad.setVisible(true);
				miVentanaCiudad.setLocationRelativeTo(null);
				this.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "El gerente no existe", "Aviso", JOptionPane.ERROR_MESSAGE);
			}

		}
	}
}
