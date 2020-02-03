import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;


public class Delincuentes extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public Delincuentes() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(215, 25, 225, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(215, 11, 46, 14);
		add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(215, 57, 46, 14);
		add(lblEdad);
		
		textField_1 = new JTextField();
		textField_1.setBounds(215, 82, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(327, 81, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(327, 56, 46, 14);
		add(lblSexo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(215, 130, 225, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setBounds(215, 113, 86, 14);
		add(lblNacionalidad);
		
		JLabel lblNewLabel = new JLabel("Direcci\u00F3n:");
		lblNewLabel.setBounds(215, 161, 86, 14);
		add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(215, 186, 225, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPoblacin = new JLabel("Poblaci\u00F3n:");
		lblPoblacin.setBounds(215, 217, 86, 14);
		add(lblPoblacin);
		
		textField_5 = new JTextField();
		textField_5.setBounds(215, 242, 225, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnAntecedentes = new JButton("Antecedentes >>");
		btnAntecedentes.setBounds(265, 273, 135, 23);
		add(btnAntecedentes);
		
		JList list = new JList();
		list.setBounds(10, 273, 193, -262);
		//list.addElement("delincuente 1","delincuente 2","delincuente 3","delincuente 4","delincuente 5","delincuente 6","delincuente 7","delincuente 8","delincuente 9","delincuente 10");
		add(list);
		

	}
}
