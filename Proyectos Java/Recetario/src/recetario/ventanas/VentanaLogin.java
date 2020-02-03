package recetario.ventanas;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class VentanaLogin extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField_1;
	public VentanaLogin() {
		setTitle("KUKABUKA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(840, 420));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Sign In", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(64, 40, 350, 300);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nuevo Usuario");
		lblNewLabel.setBounds(40, 25, 109, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(40, 55, 276, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNuevaContrasea = new JLabel("Nueva Contrase\u00F1a");
		lblNuevaContrasea.setBounds(40, 100, 125, 14);
		panel.add(lblNuevaContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(40, 125, 276, 20);
		panel.add(passwordField);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(40, 165, 46, 14);
		panel.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(40, 190, 276, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(130, 250, 89, 23);
		panel.add(btnEnviar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(854, 29, 400, 711);
		getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Log In", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(424, 40, 350, 300);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(40, 25, 94, 14);
		panel_4.add(lblUsuario);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(40, 52, 276, 20);
		panel_4.add(textField_2);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(40, 100, 125, 14);
		panel_4.add(lblContrasea);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(40, 125, 276, 20);
		panel_4.add(passwordField_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Recordar contrase\u00F1a");
		chckbxNewCheckBox.setBounds(40, 165, 166, 23);
		panel_4.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1 = new JLabel("\u00BFHas olvidado tu contrase\u00F1a?");
		lblNewLabel_1.setBounds(90, 210, 202, 14);
		panel_4.add(lblNewLabel_1);
		
		JButton button = new JButton("Enviar");
		button.setBounds(130, 250, 89, 23);
		panel_4.add(button);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
	}
}
