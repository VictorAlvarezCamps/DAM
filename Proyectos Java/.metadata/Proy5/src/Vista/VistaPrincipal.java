package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class VistaPrincipal extends JPanel {
	public VistaPrincipal() {
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\dai\\Desktop\\usuario.png"));
		lblNewLabel_1.setBounds(10, 11, 145, 150);
		add(lblNewLabel_1);
		
		JButton btnJuegos_1 = new JButton("Juegos");
		btnJuegos_1.setBounds(182, 11, 89, 23);
		add(btnJuegos_1);
		
		JButton btnPerfil_1 = new JButton("Perfil");
		btnPerfil_1.setBounds(182, 52, 89, 23);
		add(btnPerfil_1);
		
		JLabel lblUsuario_1 = new JLabel("Usuario:");
		lblUsuario_1.setBounds(109, 172, 46, 14);
		add(lblUsuario_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(80, 197, 98, 20);
		add(comboBox);
		
		JLabel lblContrasea_1 = new JLabel("Contrase\u00F1a:");
		lblContrasea_1.setBounds(90, 226, 82, 14);
		add(lblContrasea_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(80, 251, 98, 20);
		add(passwordField_1);
	}
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Create the panel.
	 */

	public void VistaPrincipal() {
		setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dai\\Desktop\\usuario.png"));
		lblNewLabel.setBounds(10, 11, 149, 177);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 224, 134, 20);
		add(comboBox);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(10, 199, 46, 14);
		add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(176, 199, 98, 14);
		add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(176, 224, 98, 20);
		add(passwordField);
		
		JButton btnJuegos = new JButton("Juegos");
		btnJuegos.setBounds(173, 11, 89, 23);
		add(btnJuegos);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setBounds(173, 45, 89, 23);
		add(btnPerfil);
		
		
	}
}
