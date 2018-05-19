package uniquindio.Fundamentos.Proyecto.Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class VentanaAdministradorLocal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private VentanaPrincipal miV;
	private JButton btnDiaMasAsistido;
	private JButton btnCrearNuevoEntrenador;

	public VentanaAdministradorLocal(VentanaPrincipal miV) {
		this.miV = miV;
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnDiaMasAsistido = new JButton("Dia mas asistido");
		btnDiaMasAsistido.setBounds(140, 80, 148, 23);
		btnDiaMasAsistido.addActionListener(this);
		contentPane.add(btnDiaMasAsistido);
		
		btnCrearNuevoEntrenador = new JButton("Ingresar Nuevo Entrenador");
		btnCrearNuevoEntrenador.addActionListener(this);
		btnCrearNuevoEntrenador.setBounds(188, 147, 89, 23);
		contentPane.add(btnCrearNuevoEntrenador);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
     if(e.getSource()== btnDiaMasAsistido)
     {
    	 
     }
     if (e.getSource() == btnCrearNuevoEntrenador) {
			VentanaEntrenador miVentanaEntrenador = new VentanaEntrenador(miV);
			miVentanaEntrenador.setVisible(true);
			this.dispose();
		}
	}

}
