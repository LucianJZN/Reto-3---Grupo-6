package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBienvenida {

	private JPanel panel = null;
	private JButton jButtonPanel = null;

	public PanelBienvenida(ArrayList<JPanel> paneles) {

		panel = new JPanel();
		panel.setBounds(0, 0, 700, 700);

		jButtonPanel = new JButton("Bienvenido");
		jButtonPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("GoTO -> Panel 2");
				panel.setVisible(false);

				// Me falta la referencia panel2
				paneles.get(0).setVisible(false);	//panel bienvenida
				paneles.get(1).setVisible(true);	//panel registrar usuario
				paneles.get(2).setVisible(false);	//panel cines donde se selecciona las sesiones
				//paneles.get(3).setVisible(true);
				/*
				 * paneles.get(2).setVisible(false); paneles.get(3).setVisible(false);
				 * paneles.get(4).setVisible(false); paneles.get(5).setVisible(false);
				 */
			}
		});
		jButtonPanel.setBounds(275, 323, 150, 25);
		panel.add(jButtonPanel);

		/*
		JLabel lblNewLabel_2 = new JLabel("Si tienes cuenta, puedes hacer click en el botón Ver Cines");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(262, 243, 367, 35);
		panel.add(lblNewLabel_2);
		*/
		panel.setLayout(null);
	}

	public JPanel getPanel() {
		return panel;
	}
}
