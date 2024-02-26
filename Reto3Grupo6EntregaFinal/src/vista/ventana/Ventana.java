//11/02/2024
//PROYECTO 3
//VENTANA PRINCIPAL

//AQUÍ SE HARÁN COMENTARIOS CON RESPETO A QUE SE ESTÁ HACIENDO EN ESTE MOMENTO O OTRA INFORMACIÓN INPORTANTE



//VAMOS A CERRAR EL PROYETO, CREAR LA TABLA Y MOSTRAR LOS DATOS EN ELLA




package vista.ventana;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import vista.PanelBienvenida;
import vista.PanelRegistrarUsuario;
import vista.PanelCines;
import vista.PanelPelis;
import vista.PanelSesiones;

public class Ventana {

	private JFrame frame;
	private ArrayList<JPanel> paneles = null;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Ventana().frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.na
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// Lista que contiene los paneles
		paneles = new ArrayList<JPanel>();

		// PANEL 1 - Panel Bienvenida
		// Creamos los gestores y los paneles. Pasamos la lista por el constructor
		PanelBienvenida panelBienvenida = new PanelBienvenida(paneles);
		JPanel panel1 = panelBienvenida.getPanel();
		panel1.setVisible(true);

		// Lo metemos en la lista y en la ventana
		paneles.add(panel1);
		frame.getContentPane().add(panel1);

		//PANEL 2 - Panel Registrar Usuario
		// Creamos los gestores y los paneles. Pasamos la lista por el constructor
		PanelRegistrarUsuario panelRegistrarUsuario = new PanelRegistrarUsuario(paneles);
		JPanel panel2 = panelRegistrarUsuario.getPanel();
		panel2.setVisible(false);

		
		// Lo metemos en la lista y en la ventana
		paneles.add(panel2);
		frame.getContentPane().add(panel2);
		
		// PANEL 3 - Panel Cines - Seleccionar Sesion
		// Creamos los gestores y los paneles. Pasamos la lista por el constructor
		PanelCines panelCines = new PanelCines(paneles);
		JPanel panel3 = panelCines.getPanel();
		panel3.setVisible(false);

		// Lo metemos en la lista y en la ventana
		paneles.add(panel3);
		frame.getContentPane().add(panel3);
		/*
		// PANEL 4 - Panel Usuario
		// Creamos los gestores y los paneles. Pasamos la lista por el constructor
		PanelCliente gestorPanel3 = new PanelCliente(paneles);
		JPanel panel3 = panelUsuario.getPanel();
		panel3.setVisible(false);
		*/
		
		// Lo metemos en la lista y en la ventana
	//	paneles.add(panel3);
		//frame.getContentPane().add(panel3);
	}
}
