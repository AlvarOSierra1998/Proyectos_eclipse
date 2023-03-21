package programass;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class bienvenido extends JFrame {

	private JPanel bienvenido;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bienvenido frame = new bienvenido();
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
	public bienvenido() {
		setTitle("BIENVENIDO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 846);
		bienvenido = new JPanel();
		bienvenido.setBackground(Color.BLACK);
		bienvenido.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(bienvenido);
		bienvenido.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(bienvenido.class.getResource("/IMAGENES/loading.gif")));
		lblNewLabel.setBounds(55, 38, 842, 706);
		bienvenido.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BIENVENIDO VIAJERO!");
		lblNewLabel_1.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 28));
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBounds(253, 61, 337, 155);
		bienvenido.add(lblNewLabel_1);
	}
}
