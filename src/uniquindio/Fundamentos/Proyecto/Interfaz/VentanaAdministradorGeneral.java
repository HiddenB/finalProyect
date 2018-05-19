package uniquindio.Fundamentos.Proyecto.Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAdministradorGeneral extends JFrame implements ActionListener {

	private JPanel contentPane;
	private VentanaPrincipal miVentanaPrincipal;
	private JButton btnRequisito1, btnRequisito2, btnRequisito3, btnRequisito4, btnRequisito5, btnRequisito6,
			btnRequisito7, btnCancelar;
	private VentanaPrimerRequisito miPrimer;

	public VentanaAdministradorGeneral(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(
				new TitledBorder(null, "Administrar", TitledBorder.CENTER, TitledBorder.TOP, null, Color.DARK_GRAY));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnRequisito1 = new JButton("Requisito1");
		btnRequisito1.setBounds(44, 50, 89, 23);
		btnRequisito1.addActionListener(this);
		contentPane.add(btnRequisito1);

		btnRequisito2 = new JButton("Requisito2");
		btnRequisito2.setBounds(44, 84, 89, 23);
		btnRequisito2.addActionListener(this);
		contentPane.add(btnRequisito2);

		btnRequisito3 = new JButton("Requisito3");
		btnRequisito3.setBounds(44, 118, 89, 23);
		btnRequisito3.addActionListener(this);
		contentPane.add(btnRequisito3);

		btnRequisito4 = new JButton("Requisito4");
		btnRequisito4.setBounds(44, 152, 89, 23);
		btnRequisito4.addActionListener(this);
		contentPane.add(btnRequisito4);

		btnRequisito5 = new JButton("Requisito5");
		btnRequisito5.setBounds(44, 186, 89, 23);
		btnRequisito5.addActionListener(this);
		contentPane.add(btnRequisito5);

		btnRequisito6 = new JButton("Requisito6");
		btnRequisito6.setBounds(154, 152, 89, 23);
		btnRequisito6.addActionListener(this);
		contentPane.add(btnRequisito6);

		btnRequisito7 = new JButton("Requisito7");
		btnRequisito7.setBounds(154, 186, 89, 23);
		btnRequisito7.addActionListener(this);
		contentPane.add(btnRequisito7);

		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(335, 227, 89, 23);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRequisito1) {
			VentanaPrimerRequisito miPrimer = new VentanaPrimerRequisito(this, miVentanaPrincipal);
			miPrimer.setVisible(true);
			this.setVisible(false);
		}

	}
}
