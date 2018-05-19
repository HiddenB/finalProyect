package uniquindio.Fundamentos.Proyecto.Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class VentanaCiudad extends JFrame implements ActionListener {

	private JPanel contentPane;
	private VentanaPrincipal miV;
	private VentanaAdministradorGeneral miAdminG;
	private VentanaGym miGym;
	private JButton btnAgenda, btnElegirLocalizacion, btnAdministrar;
	private JButton btnSiguiente;
	private VentanaJtable miJtable;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;

	public VentanaCiudad() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaCiudad.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/gimnasio.png")));
		setBounds(100, 100, 237, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaCiudad.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/cooltext286842321679651.png")));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(54, 8, 119, 32);
		contentPane.add(lblNewLabel);

		btnAgenda = new JButton("Agenda");
		btnAgenda.addActionListener(this);
		btnAgenda.setBounds(52, 129, 141, 23);
		contentPane.add(btnAgenda);

		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(54, 173, 139, 23);
		btnSiguiente.addActionListener(this);
		contentPane.add(btnSiguiente);

		btnElegirLocalizacion = new JButton("Elegir Localizacion");
		btnElegirLocalizacion.setBounds(54, 81, 141, 32);
		btnElegirLocalizacion.addActionListener(this);
		contentPane.add(btnElegirLocalizacion);

		btnAdministrar = new JButton("Administrar");
		btnAdministrar.setBounds(52, 220, 141, 23);
		btnAdministrar.addActionListener(this);
		contentPane.add(btnAdministrar);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VentanaCiudad.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/beber (2).png")));
		lblNewLabel_1.setBounds(42, 51, 179, 258);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(VentanaCiudad.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/pesa.png")));
		lblNewLabel_2.setBounds(10, 81, 34, 32);
		contentPane.add(lblNewLabel_2);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(VentanaCiudad.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/superior.png")));
		label.setBounds(10, 124, 34, 32);
		contentPane.add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(VentanaCiudad.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/botella.png")));
		label_1.setBounds(10, 167, 34, 32);
		contentPane.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(VentanaCiudad.class.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/corazon.png")));
		label_2.setBounds(10, 211, 34, 32);
		contentPane.add(label_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSiguiente) {
			VentanaPrincipal miV = new VentanaPrincipal();
			miV.setVisible(true);
			miV.setLocationRelativeTo(null);
			this.dispose();
		}
		if (e.getSource() == btnElegirLocalizacion) {
			VentanaGym miGym = new VentanaGym(this);
			miGym.setVisible(true);
			miGym.setLocationRelativeTo(null);
			this.dispose();
		}
		if (e.getSource() == btnAdministrar) {
			VentanaAdministradorGeneral miAdministradorGeneral = new VentanaAdministradorGeneral(miV);
			miAdministradorGeneral.setVisible(true);
			miAdministradorGeneral.setLocationRelativeTo(null);
		}
		if (e.getSource() == btnAgenda) {
			VentanaJtable miJtable = new VentanaJtable(this);
			miJtable.setVisible(true);
			miJtable.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}
}
