import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaInicio extends JFrame implements ActionListener{

	private JPanel contentPane;
	Principal principal = new Principal();
	Delincuentes delincuentes = new Delincuentes();
	JButton bt1;
	JButton bt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio frame = new VentanaInicio();
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
	public VentanaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
	    bt1 = new JButton("Principal");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				delincuentes.setVisible(false);
				principal.setVisible(true);
				contentPane.add(principal);
			}
		});
		
		menuBar.add(bt1);
		
		bt2 = new JButton("Delincuentes");
		
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal.setVisible(false);
				delincuentes.setVisible(true);
				contentPane.add(delincuentes);
			}
		});
		menuBar.add(bt2);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(principal);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
