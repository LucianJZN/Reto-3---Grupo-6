package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelBienvenida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelBienvenida frame = new PanelBienvenida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PanelBienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Boton que lleva a la venta cines
		JButton btnNewButton = new JButton("Siguiente ventana");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent mostrarPanelCines) {
				PanelCines panel2 = new PanelCines();
				panel2.setVisible(true);
				dispose(); //Esto es si queremos cerrar el panel actual, osea, el panelBienvenida
				//frame.setVisible(false);	//La idea era que se escondiese, no que se cerrase pero no se hacerlo
				
			}
		});
		btnNewButton.setBounds(286, 216, 119, 23);
		contentPane.add(btnNewButton);
	}

}
