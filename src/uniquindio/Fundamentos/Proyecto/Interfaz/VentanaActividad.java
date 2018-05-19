package uniquindio.Fundamentos.Proyecto.Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import uniquindio.Fundamentos.Proyecto.Mundo.Cliente;
import uniquindio.Fundamentos.Proyecto.Mundo.Fecha;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class VentanaActividad extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private JButton button;
	private VentanaPrincipal miVentanaPrincipal;
	private static int horas = 0;
	private static String actividad = "";
	private JRadioButton radioButtonFitCombatLunes, radioButtonRumbaMartes10, radioButtonSpinningMartes,
			radioButtonRumba19Martes, radioButtonRmbaMiercoles, radioButtonSuperJueves;
	private JRadioButton radioButtonSpinningJueves, radioButtonCardioViernes, radioButtonBomSabado,
			radioButtonTwerkSabado, radioButtonSpinningSabado, radioButtonFitSabado;
	private JLabel lblActividad;
	private JLabel lblHorarios;

	public VentanaActividad(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
		setBounds(100, 100, 319, 314);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 39, 248, 192);
		table.setModel(new DefaultTableModel(
				new Object[][] { { "Fit Combat ", "Lunes (19-21)" }, { "Rumba", "Martes (10-12)" },
						{ "Spinning", "Martes (19,20)" }, { "Rumba ", "Martes (19-21)" },
						{ "Rumba ", "Miercoles (19-21)" }, { "Superabdomen", "Jueves (19-21)" },
						{ "Spinning ", "Jueves (10-11)" }, { "Cardiohit", "Viernes (10-11)" },
						{ "Bombonex ", "S\u00E1bado (10,12)" }, { "Twerking", "S\u00E1bado (10-11)" },
						{ "Spinning", "S\u00E1bado (10-11)" }, { "FitCombat", "S\u00E1bado (11)" }, },
				new String[] { "", "" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(96);
		table.getColumnModel().getColumn(0).setMinWidth(93);
		table.getColumnModel().getColumn(1).setPreferredWidth(89);
		contentPane.setLayout(null);
		contentPane.add(table);

		button = new JButton("");
		button.setIcon(new ImageIcon(VentanaActividad.class
				.getResource("/uniquindio/Fundamentos/Proyecto/Imagenes/marca-de-verificacion (1).png")));
		button.setBounds(66, 235, 156, 41);
		button.addActionListener(this);
		contentPane.add(button);

		radioButtonFitCombatLunes = new JRadioButton("");
		radioButtonFitCombatLunes.setBounds(264, 39, 21, 13);
		radioButtonFitCombatLunes.addActionListener(this);
		contentPane.add(radioButtonFitCombatLunes);

		radioButtonRumbaMartes10 = new JRadioButton("");
		radioButtonRumbaMartes10.setBounds(264, 56, 21, 13);
		radioButtonRumbaMartes10.addActionListener(this);
		contentPane.add(radioButtonRumbaMartes10);

		radioButtonSpinningMartes = new JRadioButton("");
		radioButtonSpinningMartes.setBounds(264, 72, 21, 13);
		radioButtonSpinningMartes.addActionListener(this);
		contentPane.add(radioButtonSpinningMartes);

		radioButtonRumba19Martes = new JRadioButton("");
		radioButtonRumba19Martes.setBounds(264, 88, 21, 13);
		radioButtonRumba19Martes.addActionListener(this);
		contentPane.add(radioButtonRumba19Martes);

		radioButtonRmbaMiercoles = new JRadioButton("");
		radioButtonRmbaMiercoles.setBounds(264, 104, 21, 13);
		radioButtonRmbaMiercoles.addActionListener(this);
		contentPane.add(radioButtonRmbaMiercoles);

		radioButtonSuperJueves = new JRadioButton("");
		radioButtonSuperJueves.setBounds(264, 120, 21, 13);
		radioButtonSuperJueves.addActionListener(this);
		contentPane.add(radioButtonSuperJueves);

		radioButtonSpinningJueves = new JRadioButton("");
		radioButtonSpinningJueves.setBounds(264, 136, 21, 13);
		radioButtonSpinningJueves.addActionListener(this);
		contentPane.add(radioButtonSpinningJueves);

		radioButtonCardioViernes = new JRadioButton("");
		radioButtonCardioViernes.setBounds(264, 152, 21, 13);
		radioButtonCardioViernes.addActionListener(this);
		contentPane.add(radioButtonCardioViernes);

		radioButtonBomSabado = new JRadioButton("");
		radioButtonBomSabado.setBounds(264, 168, 21, 13);
		radioButtonBomSabado.addActionListener(this);
		contentPane.add(radioButtonBomSabado);

		radioButtonTwerkSabado = new JRadioButton("");
		radioButtonTwerkSabado.setBounds(264, 184, 21, 13);
		radioButtonFitSabado.addActionListener(this);
		contentPane.add(radioButtonTwerkSabado);

		radioButtonSpinningSabado = new JRadioButton("");
		radioButtonSpinningSabado.setBounds(264, 200, 21, 13);
		radioButtonSpinningSabado.addActionListener(this);
		contentPane.add(radioButtonSpinningSabado);

		radioButtonFitSabado = new JRadioButton("");
		radioButtonFitSabado.setBounds(264, 218, 21, 13);
		radioButtonFitSabado.addActionListener(this);
		contentPane.add(radioButtonFitSabado);

		lblActividad = new JLabel("ACTIVIDAD");
		lblActividad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActividad.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividad.setForeground(new Color(128, 0, 0));
		lblActividad.setBackground(new Color(255, 255, 255));
		lblActividad.setBounds(10, 24, 127, 14);
		contentPane.add(lblActividad);

		lblHorarios = new JLabel("HORARIOS");
		lblHorarios.setForeground(new Color(128, 0, 0));
		lblHorarios.setBackground(new Color(255, 255, 255));
		lblHorarios.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHorarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorarios.setBounds(137, 24, 121, 14);
		contentPane.add(lblHorarios);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (radioButtonFitCombatLunes.isSelected()) {
			horas = 2;
			actividad = "fitcombat";
		}
		if (radioButtonRumbaMartes10.isSelected()) {
			horas = 2;
			actividad = "rumba";
		}
		if (radioButtonSpinningMartes.isSelected()) {
			horas = 1;
			actividad = "spinning";
		}
		if (radioButtonFitCombatLunes.isSelected()) {
			horas = 2;
			actividad = "fitcombat";
		}
		if (radioButtonRumba19Martes.isSelected()) {
			horas = 2;
			actividad = "rumba";
		}
		if (radioButtonRmbaMiercoles.isSelected()) {
			horas = 2;
			actividad = "rumba";
		}
		if (radioButtonSuperJueves.isSelected()) {
			horas = 2;
			actividad = "superabdomen";
		}
		if (radioButtonSpinningJueves.isSelected()) {
			horas = 1;
			actividad = "spinning";
		}
		if (radioButtonCardioViernes.isSelected()) {
			horas = 1;
			actividad = "cardio";
		}
		if (radioButtonBomSabado.isSelected()) {
			horas = 2;
			actividad = "bombonex";
		}
		if (radioButtonTwerkSabado.isSelected()) {
			horas = 1;
			actividad = "twerking";
		}
		if (radioButtonSpinningSabado.isSelected()) {
			horas = 1;
			actividad = "spinning";
		}
		if (radioButtonFitSabado.isSelected()) {
			horas = 2;
			actividad = "fitcombat";
		}
		if (e.getSource() == button) {
			miVentanaPrincipal.setVisible(true);
			this.setVisible(false);
		}
		if (e.getSource() == radioButtonBomSabado) {
			radioButtonCardioViernes.setSelected(false);
			radioButtonFitCombatLunes.setSelected(false);
			radioButtonFitSabado.setSelected(false);
			radioButtonRmbaMiercoles.setSelected(false);
			radioButtonRumba19Martes.setSelected(false);
			radioButtonRumbaMartes10.setSelected(false);
			radioButtonSpinningJueves.setSelected(false);
			radioButtonSpinningMartes.setSelected(false);
			radioButtonSpinningSabado.setSelected(false);
			radioButtonSuperJueves.setSelected(false);
			radioButtonTwerkSabado.setSelected(false);
		}
		if (e.getSource() == radioButtonCardioViernes) {
			radioButtonBomSabado.setSelected(false);
			radioButtonFitCombatLunes.setSelected(false);
			radioButtonFitSabado.setSelected(false);
			radioButtonRmbaMiercoles.setSelected(false);
			radioButtonRumba19Martes.setSelected(false);
			radioButtonRumbaMartes10.setSelected(false);
			radioButtonSpinningJueves.setSelected(false);
			radioButtonSpinningMartes.setSelected(false);
			radioButtonSpinningSabado.setSelected(false);
			radioButtonSuperJueves.setSelected(false);
			radioButtonTwerkSabado.setSelected(false);
		}
		if (e.getSource() == radioButtonFitCombatLunes) {
			radioButtonCardioViernes.setSelected(false);
			radioButtonBomSabado.setSelected(false);
			radioButtonFitSabado.setSelected(false);
			radioButtonRmbaMiercoles.setSelected(false);
			radioButtonRumba19Martes.setSelected(false);
			radioButtonRumbaMartes10.setSelected(false);
			radioButtonSpinningJueves.setSelected(false);
			radioButtonSpinningMartes.setSelected(false);
			radioButtonSpinningSabado.setSelected(false);
			radioButtonSuperJueves.setSelected(false);
			radioButtonTwerkSabado.setSelected(false);
		}
		if (e.getSource() == radioButtonFitSabado) {
			radioButtonCardioViernes.setSelected(false);
			radioButtonFitCombatLunes.setSelected(false);
			radioButtonBomSabado.setSelected(false);
			radioButtonRmbaMiercoles.setSelected(false);
			radioButtonRumba19Martes.setSelected(false);
			radioButtonRumbaMartes10.setSelected(false);
			radioButtonSpinningJueves.setSelected(false);
			radioButtonSpinningMartes.setSelected(false);
			radioButtonSpinningSabado.setSelected(false);
			radioButtonSuperJueves.setSelected(false);
			radioButtonTwerkSabado.setSelected(false);
		}
		if (e.getSource() == radioButtonRmbaMiercoles) {
			radioButtonCardioViernes.setSelected(false);
			radioButtonFitCombatLunes.setSelected(false);
			radioButtonFitSabado.setSelected(false);
			radioButtonBomSabado.setSelected(false);
			radioButtonRumba19Martes.setSelected(false);
			radioButtonRumbaMartes10.setSelected(false);
			radioButtonSpinningJueves.setSelected(false);
			radioButtonSpinningMartes.setSelected(false);
			radioButtonSpinningSabado.setSelected(false);
			radioButtonSuperJueves.setSelected(false);
			radioButtonTwerkSabado.setSelected(false);
		}
		if (e.getSource() == radioButtonRumba19Martes) {
			radioButtonCardioViernes.setSelected(false);
			radioButtonFitCombatLunes.setSelected(false);
			radioButtonFitSabado.setSelected(false);
			radioButtonRmbaMiercoles.setSelected(false);
			radioButtonBomSabado.setSelected(false);
			radioButtonRumbaMartes10.setSelected(false);
			radioButtonSpinningJueves.setSelected(false);
			radioButtonSpinningMartes.setSelected(false);
			radioButtonSpinningSabado.setSelected(false);
			radioButtonSuperJueves.setSelected(false);
			radioButtonTwerkSabado.setSelected(false);
		}
		if (e.getSource() == radioButtonRumbaMartes10) {
			radioButtonCardioViernes.setSelected(false);
			radioButtonFitCombatLunes.setSelected(false);
			radioButtonFitSabado.setSelected(false);
			radioButtonRmbaMiercoles.setSelected(false);
			radioButtonRumba19Martes.setSelected(false);
			radioButtonBomSabado.setSelected(false);
			radioButtonSpinningJueves.setSelected(false);
			radioButtonSpinningMartes.setSelected(false);
			radioButtonSpinningSabado.setSelected(false);
			radioButtonSuperJueves.setSelected(false);
			radioButtonTwerkSabado.setSelected(false);
		}
		if (e.getSource() == radioButtonSpinningJueves) {
			radioButtonCardioViernes.setSelected(false);
			radioButtonFitCombatLunes.setSelected(false);
			radioButtonFitSabado.setSelected(false);
			radioButtonRmbaMiercoles.setSelected(false);
			radioButtonRumba19Martes.setSelected(false);
			radioButtonRumbaMartes10.setSelected(false);
			radioButtonBomSabado.setSelected(false);
			radioButtonSpinningMartes.setSelected(false);
			radioButtonSpinningSabado.setSelected(false);
			radioButtonSuperJueves.setSelected(false);
			radioButtonTwerkSabado.setSelected(false);
		}
		if (e.getSource() == radioButtonSpinningMartes) {
			radioButtonCardioViernes.setSelected(false);
			radioButtonFitCombatLunes.setSelected(false);
			radioButtonFitSabado.setSelected(false);
			radioButtonRmbaMiercoles.setSelected(false);
			radioButtonRumba19Martes.setSelected(false);
			radioButtonRumbaMartes10.setSelected(false);
			radioButtonSpinningJueves.setSelected(false);
			radioButtonBomSabado.setSelected(false);
			radioButtonSpinningSabado.setSelected(false);
			radioButtonSuperJueves.setSelected(false);
			radioButtonTwerkSabado.setSelected(false);
		}
		if (e.getSource() == radioButtonSpinningSabado) {
			radioButtonCardioViernes.setSelected(false);
			radioButtonFitCombatLunes.setSelected(false);
			radioButtonFitSabado.setSelected(false);
			radioButtonRmbaMiercoles.setSelected(false);
			radioButtonRumba19Martes.setSelected(false);
			radioButtonRumbaMartes10.setSelected(false);
			radioButtonSpinningJueves.setSelected(false);
			radioButtonSpinningMartes.setSelected(false);
			radioButtonBomSabado.setSelected(false);
			radioButtonSuperJueves.setSelected(false);
			radioButtonTwerkSabado.setSelected(false);
		}
		if (e.getSource() == radioButtonSuperJueves) {
			radioButtonCardioViernes.setSelected(false);
			radioButtonFitCombatLunes.setSelected(false);
			radioButtonFitSabado.setSelected(false);
			radioButtonRmbaMiercoles.setSelected(false);
			radioButtonRumba19Martes.setSelected(false);
			radioButtonRumbaMartes10.setSelected(false);
			radioButtonSpinningJueves.setSelected(false);
			radioButtonSpinningMartes.setSelected(false);
			radioButtonSpinningSabado.setSelected(false);
			radioButtonBomSabado.setSelected(false);
			radioButtonTwerkSabado.setSelected(false);
		}
		if (e.getSource() == radioButtonTwerkSabado) {
			radioButtonCardioViernes.setSelected(false);
			radioButtonFitCombatLunes.setSelected(false);
			radioButtonFitSabado.setSelected(false);
			radioButtonRmbaMiercoles.setSelected(false);
			radioButtonRumba19Martes.setSelected(false);
			radioButtonRumbaMartes10.setSelected(false);
			radioButtonSpinningJueves.setSelected(false);
			radioButtonSpinningMartes.setSelected(false);
			radioButtonSpinningSabado.setSelected(false);
			radioButtonSuperJueves.setSelected(false);
			radioButtonBomSabado.setSelected(false);
		}
	}

	public int getHoras() {
		return horas;
	}

	public String getActividad() {
		return actividad;
	}
}
