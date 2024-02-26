package vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import baseDatos.pojos.Cine;
import baseDatos.pojos.Pelicula;
import gestor.GestorCine;
import gestor.GestorPelicula;
import gestor.GestorTablas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.event.ActionEvent;

//Antes en en el class PanelCines tambien ponia:  extends JFrame 
public class PanelCines {

	// private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tablaCines;
	private JTable tablaPelis;
	private JTable tablaHoras;
	private JTable tablaFechas;
	private JTable tablaSesiones;
	private DefaultTableModel modelCines;
	private DefaultTableModel modelPelis;
	public static String nombreCineSeleccionado;
	public static String nombrePeliculaSeleccionado;
	public static String fechaSeleccionada;
	public static String horaSeleccionada;
	private GestorTablas gestorTablas = new GestorTablas();
	
	private ArrayList<Cine> listaCines = new ArrayList<>();

	private ArrayList<Pelicula> listaPelis = new ArrayList<>();

	/**
	 * Create the frame.
	 */

	public PanelCines(ArrayList<JPanel> paneles) {

		contentPane = new JPanel();
		contentPane.setBounds(0, -40, 700, 700);
		contentPane.setLayout(null);

		/*
		 * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setBounds(500, 200, 550,
		 * 700); contentPane = new JPanel(); contentPane.setBorder(new EmptyBorder(5, 5,
		 * 5, 5));
		 */

		// setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 130, 280, 150);
		contentPane.add(scrollPane);

		tablaCines = new JTable();
		modelCines = new DefaultTableModel();
		tablaCines.setModel(modelCines);

		// Asignar columnas al modelo
		modelCines.addColumn("Nombre");
		// modelCines.addColumn("Direccion");

		// Scroll Panel para mostrar los cines
		scrollPane.setViewportView(tablaCines);

		JLabel lblNewLabel = new JLabel("Selecciona un cine:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(46, 108, 131, 17);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Selecciona una pelicula:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(366, 108, 200, 17);
		contentPane.add(lblNewLabel_1);

		
		// Asignar filas al modelo
		GestorCine gestorCine = new GestorCine();
		gestorCine.pedirCines();
		for (Cine cine : gestor.GestorCine.listaCines) {
			Object[] fila = { cine.getNombre() };
			modelCines.addRow(fila);
		}

		// Al hacer click en un cine

		tablaCines.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//
				// Obtener la fila seleccionada
				int filaSeleccionada = tablaCines.getSelectedRow();

				gestorTablas.modelFecha.setRowCount(0);
				gestorTablas.modelHora.setRowCount(0);
				gestorTablas.modelSesion.setRowCount(0);
				
				// Obtener los datos de la fila seleccionada
				nombreCineSeleccionado = tablaCines.getValueAt(filaSeleccionada, 0).toString();
				// String direccion = tablaCines.getValueAt(filaSeleccionada, 2).toString();

				// Imprimir los datos de la fila seleccionada
				System.out.println("Fila seleccionada: " + nombreCineSeleccionado);

				// Depende de que peli selecciona, se muestra unas pelis u otras
				// por lo que deberia llamar a la BBDD es func
				if (filaSeleccionada == 0) {
					mostrarPelisEnTabla();
				} else {
					mostrarPelisEnTabla();
				}
				
				//Mostrar pelis
				//mostrarPelisEnTabla();	//por esto mostraba 2 veces la peli
			}
		});

		// PARTE DE LAS PELICULAS
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(366, 130, 280, 150);
		contentPane.add(scrollPane_1);

		tablaPelis = new JTable();
		modelPelis = new DefaultTableModel();
		tablaPelis.setModel(modelPelis);

		// Asignar columnas al modelo
		modelPelis.addColumn("Nombre");

		// Scroll Panel para mostrar las películas
		scrollPane_1.setViewportView(tablaPelis);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(163, 315, 483, 290);
		contentPane.add(scrollPane_2);
		
		tablaSesiones = new JTable();
		
		tablaSesiones.setModel(gestorTablas.modelSesion);
		
		scrollPane_2.setViewportView(tablaSesiones);

		JButton btnNewButton = new JButton("Seleccionar sesion");
		btnNewButton.setBounds(522, 630, 150, 35);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Finalizar Compra");
		btnNewButton_1.setBounds(354, 630, 150, 35);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(21, 630, 150, 35);
		contentPane.add(btnNewButton_2);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(42, 314, 89, 130);
		contentPane.add(scrollPane_3);
		
		tablaFechas = new JTable();
		tablaFechas.setModel(gestorTablas.modelFecha);
		
		scrollPane_3.setViewportView(tablaFechas);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(42, 475, 89, 130);
		contentPane.add(scrollPane_4);
		
		tablaHoras = new JTable();
		tablaHoras.setModel(gestorTablas.modelHora);
		
		scrollPane_4.setViewportView(tablaHoras);

		JLabel lblNewLabel_2 = new JLabel("(3) Fecha:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(46, 289, 89, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("(4) Hora: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(42, 455, 89, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("(5) Sesiones:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(163, 287, 117, 17);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_3 = new JButton("Atras");
		btnNewButton_3.setBounds(190, 630, 150, 35);
		contentPane.add(btnNewButton_3);

		// Al hacer click en una peli
		tablaPelis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//
				// Obtener la fila seleccionada
				int filaSeleccionada = tablaPelis.getSelectedRow();
				
				gestorTablas.modelFecha.setRowCount(0);
				gestorTablas.modelHora.setRowCount(0);
				gestorTablas.modelSesion.setRowCount(0);

				// Obtener los datos de la fila seleccionada
				nombrePeliculaSeleccionado = tablaPelis.getValueAt(filaSeleccionada, 0).toString();
				// String direccion = tablaCines.getValueAt(filaSeleccionada, 2).toString();

				// Imprimir los datos de la fila seleccionada
				System.out.println("Peli seleccionada: " + nombrePeliculaSeleccionado);
				if(filaSeleccionada == 0) {
					gestorTablas.anadirFechas();
				}else {
					gestorTablas.anadirFechas();
				}

			}
		});
		
		tablaFechas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int filaSeleccionada = tablaFechas.getSelectedRow();
				fechaSeleccionada = tablaFechas.getValueAt(filaSeleccionada, 0).toString();
				
				if(filaSeleccionada == 0) {
					gestorTablas.anadirHoras();
				}else {
					gestorTablas.anadirHoras();
				}
			}
		});
		
		tablaHoras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int filaSeleccionada = tablaHoras.getSelectedRow();
				horaSeleccionada = tablaHoras.getValueAt(filaSeleccionada, 0).toString();
				
				if(filaSeleccionada == 0) {
					gestorTablas.anadirAllSesiones();
				}else{
					gestorTablas.anadirAllSesiones();
				}
			}
		});

		//

		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 450, 300);
		// panel = new JPanel();
		// panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		// setContentPane(panel);

		// Boton que lleva a la ventana de registrar usuario
		// Add event handler → action //Creamos un evento al hacer click sobre el boton
		/*
		 * JButton btnNewButton = new JButton("Volver");
		 * btnNewButton.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { // PanelBienvenida panel1 = new
		 * PanelRegistrarUsuario(); panel.setVisible(false);
		 * paneles.get(0).setVisible(false); paneles.get(1).setVisible(true);
		 * paneles.get(2).setVisible(false);
		 * 
		 * //Así no → panel2.setVisible(true); } }); btnNewButton.setBounds(10, 227, 89,
		 * 23); panel.add(btnNewButton);
		 */
		
		
		
		
		
	}


	public JPanel getPanel() {
		return contentPane;
	}
	
	// Asignar filas al modelo y borrar contenido anterior
		public void mostrarPelisEnTabla() {
			GestorPelicula gestorPeli = new GestorPelicula();
			gestorPeli.pedirPelis();
			
			String nombrePeli = null;
			int rowCount = modelPelis.getRowCount();
			System.out.println("antes de borrar: ");
			modelPelis.setRowCount(0);
			
			// Remove rows one by one from the end of the table
			/*
			for (int i = rowCount - 1; i >= 0; i--) {
				modelPelis.removeRow(i);
				
				System.out.println("por que no se borran las pelis: ");
			}
			*/
			//System.out.println("SIZE" + gestor.GestorPelicula.listaPelis.size());
			
			for (Pelicula peli : gestor.GestorPelicula.listaPelis) {
				Object[] fila = { peli.getNombrePeli() };
				modelPelis.addRow(fila);
				nombrePeli = peli.getNombrePeli();
			}
			System.out.println("mostrarPelis se Ejecuta: " + nombrePeli );
		}
}
