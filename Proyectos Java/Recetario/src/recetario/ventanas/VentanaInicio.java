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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;


public class VentanaInicio extends JFrame implements ActionListener{
	private JPanel panelFondo,panelMenu,panelInicio,panelPerfil,panelSugerencias,panelBuscar,panelFavoritos;
	private JToggleButton tglbtnBuscar,tglbtnFavoritos;
	private JButton btnNuevaReceta,btnAtras;
	
	public VentanaInicio() {
		setTitle("KUKABUKA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dimPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(dimPantalla);
		getContentPane().setLayout(null);
		setResizable(true);
		
		menu();
		inicio();
		perfil();
		sugerencias();
		favoritos();
		buscar();
		
		setVisible(true);
	}
	
	private void favoritos(){
		
		panelFavoritos = new JPanel();
		panelFavoritos.setBorder(new TitledBorder(null,"Favoritos", TitledBorder.CENTER,TitledBorder.TOP, null,null));
		panelFavoritos.setBounds(50+(this.getWidth()/5)+10, 60, this.getWidth()/2, (int) (this.getHeight()/1.3));
		getContentPane().add(panelFavoritos);
		panelFavoritos.hide();
	}
	
	private void buscar(){
		
		panelBuscar = new JPanel();
		panelBuscar.setBorder(new TitledBorder(null,"Buscador", TitledBorder.CENTER,TitledBorder.TOP, null,null));
		panelBuscar.setBounds(50+(this.getWidth()/5)+10, 60, this.getWidth()/2, (int) (this.getHeight()/1.3));
		getContentPane().add(panelBuscar);
		panelBuscar.hide();
	}

	private void sugerencias() {
		
		panelSugerencias = new JPanel();
		panelSugerencias.setBorder(new TitledBorder(null, "Sugerencias", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelSugerencias.setBounds(50+(this.getWidth()/5)+10+(this.getWidth()/2)+10, (int) (60+((this.getHeight()/1.3)/2)+5), this.getWidth()/5, (int) ((this.getHeight()/1.3)/2)-5);
		getContentPane().add(panelSugerencias);
		panelSugerencias.show();
		
	}

	private void perfil() {
		
		panelPerfil = new JPanel();
		panelPerfil.setBorder(new TitledBorder(null, "Perfil", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelPerfil.setBounds(50+(this.getWidth()/5)+10+(this.getWidth()/2)+10, 60, this.getWidth()/5, (int) (this.getHeight()/1.3)/2);
		getContentPane().add(panelPerfil);
		panelPerfil.show();
		
	}

	private void inicio() {
		
		panelInicio = new JPanel();
		panelInicio.setBorder(new TitledBorder(null, "Inicio", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelInicio.setBounds(50+(this.getWidth()/5)+10, 60, this.getWidth()/2, (int) (this.getHeight()/1.3));
		getContentPane().add(panelInicio);
		panelInicio.show();
		
	}

	private void menu() {
		
		this.panelMenu = new JPanel();
		this.panelMenu.setBorder(new TitledBorder(null, "Menu", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		this.panelMenu.setBounds(50, 60, this.getWidth()/5, (int) (this.getHeight()/1.3));
		this.panelMenu.setLayout(null);
		getContentPane().add(this.panelMenu);
		panelMenu.show();
		
		this.tglbtnBuscar = new JToggleButton("Buscar");
		this.tglbtnBuscar.setBounds((panelMenu.getWidth()/2)-95, (int)(panelMenu.getHeight()/3), 190, 40);
		this.panelMenu.add(this.tglbtnBuscar);
		this.tglbtnBuscar.addActionListener(this);
		
		this.tglbtnFavoritos = new JToggleButton("Favoritos");
		this.tglbtnFavoritos.setBounds((panelMenu.getWidth()/2)-95, (int)(panelMenu.getHeight()/3)+50, 190, 40);
		this.panelMenu.add(this.tglbtnFavoritos);
		this.tglbtnFavoritos.addActionListener(this);
		
		this.btnNuevaReceta = new JButton("Nueva receta");
		this.btnNuevaReceta.setBounds((panelMenu.getWidth()/2)-95, (int)(panelMenu.getHeight()/3)+100, 190, 40);
		this.panelMenu.add(this.btnNuevaReceta);
		this.btnNuevaReceta.addActionListener(this);
		
		this.btnAtras = new JButton("Atras");
		this.btnAtras.setEnabled(false);
		this.btnAtras.setBounds((panelMenu.getWidth()/2)-95, (int)(panelMenu.getHeight())-140, 190, 40);
		this.panelMenu.add(this.btnAtras);
		this.btnAtras.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Accion boton buscar Menu
		if(e.getSource() == this.tglbtnBuscar){
			if (this.tglbtnBuscar.isSelected()) {
				if (this.tglbtnFavoritos.isSelected()) {
					panelFavoritos.hide();
					this.tglbtnFavoritos.setSelected(false);
				}
				this.panelInicio.hide();
				this.panelBuscar.show();
				this.btnAtras.setEnabled(true);
			}
			if (!this.tglbtnBuscar.isSelected()) {
				this.panelBuscar.hide();
				this.panelInicio.show();
				this.btnAtras.setEnabled(false);
			}
			if(e.getSource() == this.tglbtnBuscar){
				JLabel lblBuscar = new JLabel("Buscar: ");
				lblBuscar.setBounds(28, 42, 46, 14);
				panel_5.add(lblBuscar);
				
				textField_1 = new JTextField();
				textField_1.setBounds(77, 39, 353, 20);
				panel_5.add(textField_1);
				textField_1.setColumns(10);
				
				JButton btnBuscar_1 = new JButton("Buscar");
				btnBuscar_1.setBounds(454, 38, 89, 23);
				panel_5.add(btnBuscar_1);
				
				JComboBox comboBox_3 = new JComboBox();
				comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Entrantes", "Primer plato", "Segundo plato", "Postre"}));
				comboBox_3.setBounds(28, 85, 170, 20);
				panel_5.add(comboBox_3);
				
				JComboBox comboBox_4 = new JComboBox();
				comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Desayuno", "Almuerzo", "Comida", "Cena"}));
				comboBox_4.setBounds(244, 85, 123, 20);
				panel_5.add(comboBox_4);
				
				JComboBox comboBox_5 = new JComboBox();
				comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"F\u00E1cil", "Medio", "Dif\u00EDcil"}));
				comboBox_5.setBounds(393, 85, 150, 20);
				panel_5.add(comboBox_5);
				
				JPanel panel_6 = new JPanel();
				panel_6.setBorder(new TitledBorder(null, "Perfil", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_6.setBounds(915, 11, 339, 370);
				getContentPane().add(panel_6);
				panel_6.setLayout(null);
				
				JPanel panel_7 = new JPanel();
				panel_7.setBorder(new TitledBorder(null, "Sugerencias", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_7.setBounds(914, 392, 340, 359);
				getContentPane().add(panel_7);
				panel_7.setLayout(null);
				setVisible(true);
			}
		}
		//Accion boton Favoritos Menu
		if(e.getSource() == this.tglbtnFavoritos){
			if (this.tglbtnFavoritos.isSelected()) {
				if (this.tglbtnBuscar.isSelected()) {
					panelBuscar.hide();
					this.tglbtnBuscar.setSelected(false);
				}
				this.panelInicio.hide();
				this.panelFavoritos.show();
				this.btnAtras.setEnabled(true);
			}
			if (!this.tglbtnFavoritos.isSelected()) {
				panelFavoritos.hide();
				panelInicio.show();
				this.btnAtras.setEnabled(false);
			}
		}
		//Accion boton Nueva receta Menu
		if(e.getSource() == this.btnNuevaReceta){
			VentanaNuevaReceta vn = new VentanaNuevaReceta();
		}
		//Accion boton Atras Menu
		if(e.getSource() == this.btnAtras){
			if(this.tglbtnBuscar.isSelected()){
				this.panelBuscar.hide();
				this.panelInicio.show();
				this.tglbtnBuscar.setSelected(false);
			}
			if (this.tglbtnFavoritos.isSelected()) {
				panelFavoritos.hide();
				panelInicio.show();
				this.tglbtnFavoritos.setSelected(false);
			}
			this.btnAtras.setEnabled(false);
		}
	}
}
