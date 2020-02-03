package dam.psp.ExempleThreads;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;


/** Panell amb labels i botons per a controlar l'execució del cronòmetre. Cada panell tindrà 3 botons
 * pause: Pausa el cronòmetre
 * stop: atura el cronòmetre
 * play: inicia el cronòmetre
 * 
 * @author mviel
 * @version 1.0 - 30 Juliol 2016
 */
public class UnCronometre extends JPanel {
	private Cronometre c;
	private boolean pausat=false;
	private JButton btnPausar,btnPlay,btnStop;
	/**
	 * Create the panel.
	 */
	public UnCronometre() {
		setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnPausar = new JButton("Pausar");
		btnPausar.setEnabled(false);
		btnPausar.setFocusPainted(false);
		panel.add(btnPausar);
		
		btnPlay = new JButton("Play");
		panel.add(btnPlay);
		
		btnStop = new JButton("Stop");
		btnStop.setEnabled(false);
		panel.add(btnStop);
		
		JLabel lblTemps = new JLabel("Temps");
		lblTemps.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblTemps.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemps, BorderLayout.NORTH);
		
		JLabel label = new JLabel("0");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.CENTER);

		// Creem el thread
		c = new Cronometre(label);
		
		btnPlay.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// Iniciem el thread
				btnPlay.setEnabled(false);  // desactivem el botó Play
				btnPausar.setEnabled(true);
				btnStop.setEnabled(true);
				c.start();
			}
		});

		btnPausar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Pausem thread, si no esta ja pausat
				if(!pausat){
					pausat=true;
					btnPausar.setText("Reanudar");
					c.pausar();
					
				}else{ 
					//reanudem el thread
					pausat=false;
					btnPausar.setText("Pausar");
					c.reanudar();
				}
			}
		});
		
		btnStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Aturem el thread
				btnStop.setEnabled(false);
				btnPausar.setEnabled(false);
				c.interrupt();
			}
		});
	}

}
