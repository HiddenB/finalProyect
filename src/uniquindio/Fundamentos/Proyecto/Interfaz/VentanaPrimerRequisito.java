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
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaPrimerRequisito extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JLabel lblFechaDeIncio;
	private JTextField textFieldDia1;
	private JTextField textFieldMes1;
	private JTextField textFieldAnio1;
	private JLabel lblFechaDeFin;
	private JTextField textFieldDia2;
	private JTextField textFieldMes2;
	private JTextField textFieldAnio2;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private VentanaAdministradorGeneral miVentanaAdministradorGeneral;
	private VentanaPrincipal miVentanaPrincipal;

	/**
	 * Create the frame.
	 */
	public VentanaPrimerRequisito(VentanaAdministradorGeneral miVentanaAdministradorGeneral, VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaAdministradorGeneral = miVentanaAdministradorGeneral;
		this.miVentanaPrincipal = miVentanaPrincipal;
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombreDeGym = new JLabel("Nombre de Gym :");
		lblNombreDeGym.setBounds(32, 51, 92, 14);
		contentPane.add(lblNombreDeGym);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(134, 48, 86, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		lblFechaDeIncio = new JLabel("Fecha de incio :");
		lblFechaDeIncio.setBounds(32, 92, 92, 14);
		contentPane.add(lblFechaDeIncio);

		textFieldDia1 = new JTextField();
		textFieldDia1.setBounds(134, 89, 23, 20);
		contentPane.add(textFieldDia1);
		textFieldDia1.setColumns(10);

		textFieldMes1 = new JTextField();
		textFieldMes1.setBounds(169, 89, 23, 20);
		contentPane.add(textFieldMes1);
		textFieldMes1.setColumns(10);

		textFieldAnio1 = new JTextField();
		textFieldAnio1.setBounds(202, 89, 23, 20);
		contentPane.add(textFieldAnio1);
		textFieldAnio1.setColumns(10);

		lblFechaDeFin = new JLabel("Fecha de fin :");
		lblFechaDeFin.setBounds(32, 128, 92, 14);
		contentPane.add(lblFechaDeFin);

		textFieldDia2 = new JTextField();
		textFieldDia2.setBounds(134, 125, 23, 20);
		contentPane.add(textFieldDia2);
		textFieldDia2.setColumns(10);

		textFieldMes2 = new JTextField();
		textFieldMes2.setBounds(169, 125, 23, 20);
		contentPane.add(textFieldMes2);
		textFieldMes2.setColumns(10);

		textFieldAnio2 = new JTextField();
		textFieldAnio2.setBounds(202, 125, 23, 20);
		contentPane.add(textFieldAnio2);
		textFieldAnio2.setColumns(10);

		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBounds(169, 227, 89, 23);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);

		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(303, 227, 89, 23);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnAceptar)
		{
//			VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
			String nombreGym= textFieldNombre.getText();
			String fechaI=textFieldDia1.getText()+"/"+textFieldMes1.getText()+"/"+textFieldAnio1.getText();
			String fechaF=textFieldDia2.getText()+"/"+textFieldMes2.getText()+"/"+textFieldAnio2.getText();
			String dia=miVentanaPrincipal.calcularPrimerRequisito(nombreGym, fechaI, fechaF);
			JOptionPane.showMessageDialog(null, dia);
			miVentanaAdministradorGeneral.setVisible(true);
			this.dispose();
		}
		
	}
}
