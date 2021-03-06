package recetario.ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VentanaBuscar extends JFrame{
	private JTextField textField;
	private JTextField textField_1;

	public VentanaBuscar() {
		setTitle("KUKABUKA");
		setBackground(new Color(240, 240, 240));
		this.setBounds(getWidth(),getHeight(),getWidth(),getHeight());
		getContentPane().setLayout(null);
		Dimension dimPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(dimPantalla);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Men\u00FA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 11, 312, 740);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Buscar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(332, 11, 573, 740);
		getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(28, 42, 46, 14);
		panel_5.add(label_1);
		
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