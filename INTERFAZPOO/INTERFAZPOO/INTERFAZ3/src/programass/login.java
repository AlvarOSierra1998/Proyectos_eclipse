package programass;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel login;
	private JTextField usuario;
	private JPasswordField contraseña;
	static login ventana2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					ventana2 = new login();
					ventana2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 852);
		login = new JPanel();
		login.setBackground(Color.BLACK);
		login.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(login);
		login.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBounds(64, 195, 130, 30);
		login.add(lblNewLabel_1);

		JLabel lblLogin = new JLabel("LOG-IN");
		lblLogin.setForeground(Color.ORANGE);
		lblLogin.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 30));
		lblLogin.setBounds(235, 44, 327, 69);
		login.add(lblLogin);

		usuario = new JTextField();
		usuario.setBounds(161, 201, 253, 20);
		login.add(usuario);
		usuario.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setForeground(Color.ORANGE);
		lblNewLabel_1_1.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(64, 251, 130, 30);
		login.add(lblNewLabel_1_1);

		contraseña = new JPasswordField();
		contraseña.setBounds(161, 257, 253, 20);
		login.add(contraseña);

		JButton btnNewButton = new JButton("SING IN");
		btnNewButton.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!contraseña.getText().isEmpty()&& (!usuario.getText().isEmpty())) {
					JFrame welcome = new bienvenido();
					welcome.setVisible(true);
					dispose();
				}else if(contraseña.getText().isEmpty() && (usuario.getText().isEmpty())) {
					JOptionPane.showMessageDialog(login, "PASSWORD AND USER FIELDS ARE EMPTY", "ERROR!!",
							JOptionPane.WARNING_MESSAGE);
					contraseña.setBackground(Color.RED);
					usuario.setBackground(Color.RED);
			}else if(contraseña.getText().isEmpty()) {
				JOptionPane.showMessageDialog(login, "PASSWORD FIELD IS EMPTY", "ERROR!!",
						JOptionPane.WARNING_MESSAGE);
				contraseña.setBackground(Color.RED);
			}else if(usuario.getText().isEmpty()) {
				JOptionPane.showMessageDialog(login, "USER FIELD IS EMPTY", "ERROR!!",
						JOptionPane.WARNING_MESSAGE);
				usuario.setBackground(Color.RED);
			}
		}});
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(220, 327, 194, 69);
		login.add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(157, 461, 278, 210);
		login.add(lblNewLabel_2);
	}
}
