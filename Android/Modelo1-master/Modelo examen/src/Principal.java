import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;


public class Principal extends JPanel {
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Principal() {
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 23, 153, 20);		
		add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 80, 153, 20);
		add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(10, 129, 89, 23);
		add(btnLogin);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(10, 195, 89, 23);
		add(btnLogout);

	}
}
