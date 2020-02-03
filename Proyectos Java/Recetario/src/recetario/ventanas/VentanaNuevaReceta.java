package recetario.ventanas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollBar;


public class VentanaNuevaReceta extends JFrame implements ActionListener{
	
	private JPanel panelDatos, panelIngredientes, panelPreparacion, panelMultimedia;
	private JTextField txtTitulo, txtDescripcion, txtPais, txtConsejos, txtAutor, txtIngPrincipal, txtPreparacion;
	private JComboBox<String> cboxTipo, cboxCategoria;
	private JSpinner spnDuracion;
	private JList listIngredientes;
	private JButton btnAddVideo, btnAddImagen, btnBorrar, btnGuardar;
	
	public VentanaNuevaReceta() {
		
		setTitle("KUKABUKA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dimPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(dimPantalla);
		getContentPane().setLayout(null);
		setResizable(true);
		
		datos();
		ingredientes();
		preparacion();
		multimedia();
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(1086, 580, 89, 23);
		getContentPane().add(btnBorrar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(1215, 580, 89, 23);
		getContentPane().add(btnGuardar);
		
		setVisible(true);
	}

	private void multimedia() {
		
		panelMultimedia = new JPanel();
		panelMultimedia.setLayout(null);
		panelMultimedia.setToolTipText("");
		panelMultimedia.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Multimedia", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelMultimedia.setBounds(1050, 21, 290, 466);
		getContentPane().add(panelMultimedia);
		
		btnAddVideo = new JButton("Agregar Video");
		btnAddVideo.setBounds(12, 430, 125, 23);
		panelMultimedia.add(btnAddVideo);
		
		btnAddImagen = new JButton("Agregar Imagen");
		btnAddImagen.setBounds(153, 430, 125, 23);
		panelMultimedia.add(btnAddImagen);
		btnAddImagen.addActionListener(this);
		
	}

	private void preparacion() {
		
		panelPreparacion = new JPanel();
		panelPreparacion.setLayout(null);
		panelPreparacion.setBorder(new TitledBorder(null, "Preparacion", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelPreparacion.setBounds(677, 21, 363, 658);
		getContentPane().add(panelPreparacion);
		
		JLabel lblModoPreparacion = new JLabel("Modo de preparacion:");
		lblModoPreparacion.setBounds(65, 71, 126, 14);
		panelPreparacion.add(lblModoPreparacion);
		
		/*JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(292, 93, 17, 527);
		panel_2.add(scrollBar_1);*/
		
		txtPreparacion = new JTextField();
		txtPreparacion.setBounds(65, 91, 221, 529);
		panelPreparacion.add(txtPreparacion);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(288, 91, 17, 529);
		panelPreparacion.add(scrollBar);
		
	}

	private void ingredientes() {
		
		panelIngredientes = new JPanel();
		panelIngredientes.setBorder(new TitledBorder(null, "Ingredientes", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelIngredientes.setBounds(310, 21, 357, 658);
		getContentPane().add(panelIngredientes);
		panelIngredientes.setLayout(null);
		
		txtIngPrincipal = new JTextField();
		txtIngPrincipal.setBounds(201, 69, 108, 20);
		txtIngPrincipal.setColumns(10);
		panelIngredientes.add(txtIngPrincipal);
		
		JLabel lblIngredientePrincipal = new JLabel("Ingrediente Principal:");
		lblIngredientePrincipal.setBounds(65, 71, 126, 17);
		panelIngredientes.add(lblIngredientePrincipal);
		
		JLabel lblListaDeIngredientes = new JLabel("Lista de ingredientes:");
		lblListaDeIngredientes.setBounds(65, 131, 126, 14);
		panelIngredientes.add(lblListaDeIngredientes);
		
		listIngredientes = new JList();
		listIngredientes.setBounds(65, 151, 221, 469);
		panelIngredientes.add(listIngredientes);
	}

	private void datos() {
		
		panelDatos = new JPanel();
		panelDatos.setBorder(new TitledBorder(null, "Datos principales", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelDatos.setBounds(10, 21, 290, 658);
		panelDatos.setLayout(null);
		getContentPane().add(panelDatos);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(33, 71, 46, 14);
		panelDatos.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(119, 68, 148, 20);
		panelDatos.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(33, 131, 58, 14);
		panelDatos.add(lblDescripcion);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(119, 361, 106, 20);
		panelDatos.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(33, 242, 46, 14);
		panelDatos.add(lblTipo);
		
		cboxTipo = new JComboBox<String>();
		cboxTipo.setModel(new DefaultComboBoxModel(new String[] {"Carne", "Pescado", "Pasta", "Verdura", "Fruta"}));
		cboxTipo.setBounds(119, 239, 106, 20);
		panelDatos.add(cboxTipo);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(33, 303, 58, 14);
		panelDatos.add(lblCategoria);
		
		cboxCategoria = new JComboBox<String>();
		cboxCategoria.setModel(new DefaultComboBoxModel(new String[] {"Entrante", "Primer plato", "Segundo plato", "Postre"}));
		cboxCategoria.setBounds(119, 300, 106, 20);
		panelDatos.add(cboxCategoria);
		
		JLabel lblPais = new JLabel("Pais:");
		lblPais.setBounds(33, 364, 46, 14);
		panelDatos.add(lblPais);
		
		txtPais = new JTextField();
		txtPais.setColumns(10);
		txtPais.setBounds(119, 131, 148, 68);
		panelDatos.add(txtPais);
		
		JLabel lblDuracion = new JLabel("Duracion:");
		lblDuracion.setBounds(33, 429, 46, 14);
		panelDatos.add(lblDuracion);
		
		spnDuracion = new JSpinner();
		spnDuracion.setBounds(119, 426, 50, 20);
		panelDatos.add(spnDuracion);
		
		JLabel lblMin = new JLabel("min");
		lblMin.setBounds(179, 429, 46, 14);
		panelDatos.add(lblMin);
		
		JLabel lblConsejos = new JLabel("Consejos:");
		lblConsejos.setBounds(33, 495, 58, 14);
		panelDatos.add(lblConsejos);
		
		txtConsejos = new JTextField();
		txtConsejos.setBounds(119, 598, 107, 20);
		panelDatos.add(txtConsejos);
		txtConsejos.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(33, 601, 46, 14);
		panelDatos.add(lblAutor);		
		
		txtAutor = new JTextField();
		txtAutor.setColumns(10);
		txtAutor.setBounds(119, 495, 148, 68);
		panelDatos.add(txtAutor);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
