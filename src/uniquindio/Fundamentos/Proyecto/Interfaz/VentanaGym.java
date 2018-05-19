package uniquindio.Fundamentos.Proyecto.Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class VentanaGym extends JFrame implements ActionListener {

	private JPanel contentPane;
	private VentanaCiudad miVentanaCiudad;
	private VentanaJtable miJtable;
	private VentanaPrincipal miV;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private JRadioButton radioButtonArmenia, radioButtonPereira, radioButtonBogota, radioButtonMedellin,
			radioButtonCartagena, radioButtonCali;
	private JComboBox<String> comboBoxArmenia, comboBoxPereira, comboBoxBogota, comboBoxMedellin, comboBoxCartagena,
			comboBoxCali;
	private static String ciudad, gimnasio;

	/**
	 * Create the frame.
	 */
	public VentanaGym(VentanaCiudad miVentanaCiudad) {
		setTitle("BOXWORK");
		this.miVentanaCiudad = miVentanaCiudad;
		setBounds(100, 100, 518, 396);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblArmenia = new JLabel(" Armenia");
		lblArmenia.setBounds(10, 11, 74, 14);
		contentPane.add(lblArmenia);

		JLabel lblNewLabel = new JLabel("Pereira");
		lblNewLabel.setBounds(10, 67, 34, 14);
		contentPane.add(lblNewLabel);

		JLabel lblBogota = new JLabel("Bogota");
		lblBogota.setBounds(189, 11, 73, 14);
		contentPane.add(lblBogota);

		JLabel lblMedellin = new JLabel("Medellin");
		lblMedellin.setBounds(10, 179, 38, 14);
		contentPane.add(lblMedellin);

		JLabel lblNewLabel_1 = new JLabel("Cartagena");
		lblNewLabel_1.setBounds(10, 235, 51, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Cali");
		lblNewLabel_2.setBounds(10, 291, 17, 14);
		contentPane.add(lblNewLabel_2);

		comboBoxArmenia = new JComboBox();
		comboBoxArmenia.setBounds(10, 36, 87, 20);
		comboBoxArmenia.addItem("Alpha GYM");
		comboBoxArmenia.addItem("Omega GYM");
		comboBoxArmenia.addItem("Betha GYM");
		contentPane.add(comboBoxArmenia);

		comboBoxPereira = new JComboBox();
		comboBoxPereira.setBounds(10, 92, 87, 20);
		comboBoxPereira.addItem("World GYM");
		comboBoxPereira.addItem("Fit GYM");
		comboBoxPereira.addItem("VIP GYM");
		contentPane.add(comboBoxPereira);

		comboBoxBogota = new JComboBox();
		comboBoxBogota.setBounds(189, 36, 87, 20);
		comboBoxBogota.addItem("Power GYM");
		comboBoxBogota.addItem("Fisic GYM");
		comboBoxBogota.addItem("Gold GYM");
		contentPane.add(comboBoxBogota);

		comboBoxMedellin = new JComboBox();
		comboBoxMedellin.setBounds(10, 204, 87, 20);
		comboBoxMedellin.addItem("Be GYM");
		comboBoxMedellin.addItem("Okay GYM");
		comboBoxMedellin.addItem("Y+ GYM");
		contentPane.add(comboBoxMedellin);

		comboBoxCartagena = new JComboBox();
		comboBoxCartagena.setBounds(10, 260, 87, 20);
		comboBoxCartagena.addItem("Heavy GYM");
		comboBoxCartagena.addItem("YKM GYM");
		comboBoxCartagena.addItem("Plate GYM");
		contentPane.add(comboBoxCartagena);

		comboBoxCali = new JComboBox();
		comboBoxCali.setBounds(10, 316, 87, 20);
		comboBoxCali.addItem("Rare GYM");
		comboBoxCali.addItem("Sport GYM");
		comboBoxCali.addItem("Ralph GYM");
		contentPane.add(comboBoxCali);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(220, 315, 89, 23);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(330, 315, 89, 23);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);

		radioButtonArmenia = new JRadioButton("");
		radioButtonArmenia.setBounds(86, 7, 21, 23);
		radioButtonArmenia.addActionListener(this);
		contentPane.add(radioButtonArmenia);

		radioButtonPereira = new JRadioButton("");
		radioButtonPereira.setBounds(58, 63, 109, 23);
		radioButtonPereira.addActionListener(this);
		contentPane.add(radioButtonPereira);

		radioButtonBogota = new JRadioButton("");
		radioButtonBogota.setBounds(266, 11, 21, 23);
		radioButtonBogota.addActionListener(this);
		contentPane.add(radioButtonBogota);

		radioButtonMedellin = new JRadioButton("");
		radioButtonMedellin.setBounds(58, 175, 109, 23);
		radioButtonMedellin.addActionListener(this);
		contentPane.add(radioButtonMedellin);

		radioButtonCartagena = new JRadioButton("");
		radioButtonCartagena.setBounds(67, 231, 109, 23);
		radioButtonCartagena.addActionListener(this);
		contentPane.add(radioButtonCartagena);

		radioButtonCali = new JRadioButton("");
		radioButtonCali.setBounds(58, 287, 109, 23);
		radioButtonCali.addActionListener(this);
		contentPane.add(radioButtonCali);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (radioButtonArmenia.isSelected()) {
			ciudad = "Armenia";
			gimnasio = comboBoxArmenia.getSelectedItem().toString();
		}
		if (radioButtonBogota.isSelected()) {
			ciudad = "Bogota";
			gimnasio = comboBoxBogota.getSelectedItem().toString();
		}
		if (radioButtonCali.isSelected()) {
			ciudad = "Cali";
			gimnasio = comboBoxCali.getSelectedItem().toString();
		}
		if (radioButtonCartagena.isSelected()) {
			ciudad = "Cartagena";
			gimnasio = comboBoxCartagena.getSelectedItem().toString();
		}
		if (radioButtonMedellin.isSelected()) {
			ciudad = "Medellin";
			gimnasio = comboBoxMedellin.getSelectedItem().toString();
		}
		if (radioButtonPereira.isSelected()) {
			ciudad = "Pereira";
			gimnasio = comboBoxPereira.getSelectedItem().toString();
		}
		if (e.getSource() == btnAceptar) {
			miVentanaCiudad.setVisible(true);
			this.setVisible(false);

		}
		if (e.getSource() == btnCancelar) {
			this.setVisible(false);
			miVentanaCiudad.setVisible(true);
		}
		if (e.getSource() == radioButtonArmenia) {
			radioButtonBogota.setSelected(false);
			radioButtonCali.setSelected(false);
			radioButtonCartagena.setSelected(false);
			radioButtonMedellin.setSelected(false);
			radioButtonPereira.setSelected(false);
		}
		if (e.getSource() == radioButtonBogota) {
			radioButtonArmenia.setSelected(false);
			radioButtonCali.setSelected(false);
			radioButtonCartagena.setSelected(false);
			radioButtonMedellin.setSelected(false);
			radioButtonPereira.setSelected(false);
		}
		if (e.getSource() == radioButtonCali) {
			radioButtonBogota.setSelected(false);
			radioButtonArmenia.setSelected(false);
			radioButtonCartagena.setSelected(false);
			radioButtonMedellin.setSelected(false);
			radioButtonPereira.setSelected(false);
		}
		if (e.getSource() == radioButtonCartagena) {
			radioButtonBogota.setSelected(false);
			radioButtonCali.setSelected(false);
			radioButtonArmenia.setSelected(false);
			radioButtonMedellin.setSelected(false);
			radioButtonPereira.setSelected(false);
		}
		if (e.getSource() == radioButtonMedellin) {
			radioButtonBogota.setSelected(false);
			radioButtonCali.setSelected(false);
			radioButtonCartagena.setSelected(false);
			radioButtonArmenia.setSelected(false);
			radioButtonPereira.setSelected(false);
		}
		if (e.getSource() == radioButtonPereira) {
			radioButtonBogota.setSelected(false);
			radioButtonCali.setSelected(false);
			radioButtonCartagena.setSelected(false);
			radioButtonMedellin.setSelected(false);
			radioButtonArmenia.setSelected(false);
		}

	}

	public String getCiudad() {
		return ciudad;
	}

	public String getGimnasio() {
		return gimnasio;
	}
}