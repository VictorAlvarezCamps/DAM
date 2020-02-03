package dam.psp.ExempleThreads;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

/** Finestra que em mostra un o més comptadors de segons. És un JFrame amb un borderLayout i 
 * un o més panells on cada panell conté cronómetre.
 * @author mviel
 * @version 1.0 - 30 Juliol 2016
 */
public class PanellControl extends JFrame {

	private JPanel contentPane;
	private UnCronometre c1,c2,c3;  // Panells que contenen un cronómetre cadascun

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanellControl frame = new PanellControl();
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
	public PanellControl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		 c1 = new UnCronometre();
		 contentPane.add(c1);
		 c2 = new UnCronometre();
		 contentPane.add(c2);
		 c3 = new UnCronometre();
		 contentPane.add(c3);
		 setContentPane(contentPane);
	}

}
