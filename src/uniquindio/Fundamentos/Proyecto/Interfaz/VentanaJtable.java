package uniquindio.Fundamentos.Proyecto.Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;

public class VentanaJtable extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private JButton btnAtras;
	private VentanaCiudad miC;

	public VentanaJtable(VentanaCiudad miC) {
		this.miC = miC;
		setBounds(100, 100, 480, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { "       Dia", "                                        Actividad(hora)" },
						{ "     Lunes", "Fit Combat (19)" },
						{ "     Martes", "Rumba(10), spinning (19,20), rumba (19)" }, { "    Miercoles", "Rumba(19)" },
						{ "     Jueves", "Superabdomen(19), spinning (10)" }, { "      Viernes", "Cardiohit(10)" },
						{ "Sabado", "Bombonex (10,12), twerking(10), spinning(10), fitCombat(11)" }, },
				new String[] { "Dia", "Actividad (hora)" }));
		table.getColumnModel().getColumn(1).setPreferredWidth(335);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(table);

		btnAtras = new JButton("Atras");
		btnAtras.addActionListener(this);
		contentPane.add(btnAtras, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAtras) {
			miC.setVisible(true);
			this.setVisible(false);

		}
	}
}
