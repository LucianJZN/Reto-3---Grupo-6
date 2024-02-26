package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import baseDatos.pojos.Cliente;
import gestor.GestorCliente;

public class PanelRegistrarUsuario {

	private JPanel panel = null;
	// private JButton jButtonPanel = null;

	protected String genero;

	public PanelRegistrarUsuario(ArrayList<JPanel> paneles) {

		panel = new JPanel();
		panel.setBounds(-10, -50, 700, 700);

		/*
		 * IMAGEN JLabel lblNewLabel = new JLabel("New label"); lblNewLabel.setIcon(new
		 * ImageIcon(PanelRegistrarUsuario.class.getResource("/img/shnaider.jpg")));
		 * lblNewLabel.setBounds(53, 11, 80, 80); panel.add(lblNewLabel);
		 */

		JLabel lblNewLabel_2 = new JLabel("Si tienes cuenta, puedes hacer click en el botón Ver Cines");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(282, 573, 367, 35);
		panel.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Finalizar Sesión");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Método para finalizar sesión

			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(521, 641, 150, 35);
		panel.add(btnNewButton);

		// TEXT FIELDS
		JTextField DNICampo = new JTextField();
		DNICampo.setBounds(321, 410, 182, 25);
		panel.add(DNICampo);
		DNICampo.setColumns(10);

		JTextField nombreCampo = new JTextField();
		nombreCampo.setBounds(44, 312, 182, 25);
		panel.add(nombreCampo);
		nombreCampo.setColumns(10);

		JTextField apellidosCampo = new JTextField();
		apellidosCampo.setBounds(321, 312, 182, 25);
		panel.add(apellidosCampo);
		apellidosCampo.setColumns(10);

		JRadioButton hombreCampo = new JRadioButton("Hombre");
		hombreCampo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Al seleccionar hombre, se desmarca mujer y al revés.
				genero = ("Hombre");
			}
		});
		hombreCampo.setBounds(65, 511, 109, 25);
		panel.add(hombreCampo);

		JTextField contrasenaCampo = new JTextField();
		contrasenaCampo.setBounds(44, 410, 182, 25);
		panel.add(contrasenaCampo);
		contrasenaCampo.setColumns(10);

		//
		// Botón para registrar usuarios:
		//
		JButton btnNewButton_1 = new JButton("Registrar Usuario");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// GestorCliente.anadirCliente(null);
				//
				String dni = DNICampo.getText();
				String nombre = nombreCampo.getText();
				String apellidos = apellidosCampo.getText();
				String contrasena = contrasenaCampo.getText();

				Cliente cliente1 = new Cliente(dni, nombre, apellidos, genero, contrasena);
				GestorCliente.anadirCliente(cliente1);
			}
		});
		btnNewButton_1.setBounds(25, 641, 150, 35);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Ver Cines");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Mostrar panel de cines
				System.out.println("GoTO -> Panel 3");
				panel.setVisible(false);

				// Me falta la referencia panel2
				paneles.get(0).setVisible(false);	//panel bienvenida
				paneles.get(1).setVisible(false);	//panel registrar usuario
				paneles.get(2).setVisible(true);	//panel cines donde se selecciona las sesiones
				//paneles.get(3).setVisible(true);
				/*
				 * paneles.get(2).setVisible(false); paneles.get(3).setVisible(false);
				 * paneles.get(4).setVisible(false); paneles.get(5).setVisible(false);
				 */
			}
		});
		btnNewButton_2.setBounds(280, 641, 150, 35);
		panel.add(btnNewButton_2);

		JLabel lblNewLabel_3 = new JLabel("←☻ 6 Cines Elorrieta ☻→");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBounds(141, 109, 412, 46);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Usuario nuevo:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(44, 267, 182, 25);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Contraseña nueva:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(44, 370, 182, 25);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Rellena los datos para crear una cuenta nueva");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(282, 525, 295, 24);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_1 = new JLabel("DNI nuevo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(321, 370, 182, 25);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_7 = new JLabel("Genero:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(44, 471, 100, 25);
		panel.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Apellidos:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(321, 267, 182, 25);
		panel.add(lblNewLabel_8);

		/////////

		panel.setLayout(null);
	}

	public JPanel getPanel() {
		return panel;
	}
}
