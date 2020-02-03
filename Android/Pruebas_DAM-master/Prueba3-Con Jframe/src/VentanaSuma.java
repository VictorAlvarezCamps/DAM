import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class VentanaSuma extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField valor1;
	private JTextField valor2;
	private JTextField resultado;
	String ResultadoFinal;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSuma frame = new VentanaSuma();
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
	public VentanaSuma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNmero = new JLabel("1\u00BA N\u00FAmero:");
		lblNmero.setBounds(10, 11, 87, 14);
		contentPane.add(lblNmero);
		
		valor1 = new JTextField();
		valor1.setBounds(10, 41, 86, 20);
		contentPane.add(valor1);
		valor1.setColumns(10);
		
		JLabel lblNmero_1 = new JLabel("2\u00BA N\u00FAmero:");
		lblNmero_1.setBounds(10, 72, 87, 14);
		contentPane.add(lblNmero_1);
		
		valor2 = new JTextField();
		valor2.setBounds(10, 108, 86, 20);
		contentPane.add(valor2);
		valor2.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(10, 139, 87, 14);
		contentPane.add(lblResultado);
		
		resultado = new JTextField();
		resultado.setBounds(110, 136, 86, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		resultado.setText(ResultadoFinal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(107, 68, 89, 23);
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnCalcular) {
        	
        	int numero1;
        	int numero2;
        	int Resultado;
        	
            String num1=valor1.getText();
            String num2=valor2.getText();
            String ValorResultado=resultado.getText();
            
            numero1=Integer.parseInt(num1);
            numero2=Integer.parseInt(num2);
            Resultado=Integer.parseInt(ValorResultado);
            
            Resultado=numero1+numero2;
            ResultadoFinal=String.valueOf(Resultado);
            
        }
    }


}
