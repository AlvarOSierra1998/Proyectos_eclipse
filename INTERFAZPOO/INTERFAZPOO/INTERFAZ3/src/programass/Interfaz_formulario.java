package programass;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLayeredPane;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Label;
import java.awt.Canvas;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz_formulario extends JFrame {

	private JPanel contentPane;
	private final JLabel lblHola = new JLabel("FORM");
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField Comprobar_contraseña;
	private JTextField emaill;
	private JPlaceholderTextField textField_2;
	private JPlaceholderTextField textField_3;
	private JPlaceholderTextField textField_4;
	private JPlaceholderTextField textField_5;
	private JPlaceholderTextField textField_6;
	private ArrayList<String> User = new ArrayList<String>();
	private ArrayList<String> password = new ArrayList<String>();
	private ArrayList<String> EMAIL = new ArrayList<String>();
	private ArrayList<String> fechaN = new ArrayList<String>();
	private ArrayList<Integer> tlf = new ArrayList<Integer>();
	static Interfaz_formulario ventana1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					ventana1 = new Interfaz_formulario();
					ventana1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz_formulario() {
		setTitle("REGISTER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 846);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setToolTipText("");
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel Ventana_principal = new JPanel();
		Ventana_principal.setBackground(Color.BLACK);
		Ventana_principal.setBounds(0, 0, 2613, 1527);
		contentPane.add(Ventana_principal);
		Ventana_principal.setLayout(null);
		
				JLabel lblNewLabel_11 = new JLabel("");
				lblNewLabel_11.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_11.setIcon(new ImageIcon(Interfaz_formulario.class.getResource("/IMAGENES/loading.gif")));
				lblNewLabel_11.setForeground(Color.ORANGE);
				lblNewLabel_11.setBounds(331, 195, 400, 400);
				Ventana_principal.add(lblNewLabel_11);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(171, 11, 554, 86);
		lblNewLabel.setIcon(new ImageIcon(Interfaz_formulario.class.getResource("/IMAGENES/Elden_Ring_-_Title.png")));
		Ventana_principal.add(lblNewLabel);
		lblHola.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 35));
		lblHola.setBounds(379, 108, 364, 33);
		Ventana_principal.add(lblHola);
		lblHola.setForeground(Color.ORANGE);

		JLabel lblUsuario = new JLabel("User:");
		lblUsuario.setForeground(Color.ORANGE);
		lblUsuario.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblUsuario.setBounds(113, 179, 317, 51);
		Ventana_principal.add(lblUsuario);

		// textField = new JPlaceholderTextField("Select your username");
		textField = new JTextField();
		textField.setForeground(Color.ORANGE);
		textField.setBackground(Color.BLACK);
		textField.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 12));
		textField.setBounds(182, 195, 207, 20);
		Ventana_principal.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBounds(70, 241, 107, 25);
		Ventana_principal.add(lblNewLabel_1);

		passwordField = new JPasswordField();
		passwordField.setBackground(Color.BLACK);
		passwordField.setForeground(Color.ORANGE);
		passwordField.setBounds(192, 241, 197, 20);
		Ventana_principal.add(passwordField);

		JLabel lblNewLabel_2 = new JLabel("Confirm password");
		lblNewLabel_2.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setBounds(58, 290, 213, 14);
		Ventana_principal.add(lblNewLabel_2);

		Comprobar_contraseña = new JPasswordField();
		Comprobar_contraseña.setForeground(Color.ORANGE);
		Comprobar_contraseña.setBackground(Color.BLACK);
		Comprobar_contraseña.setBounds(216, 288, 173, 20);
		Ventana_principal.add(Comprobar_contraseña);

		JLabel lblNewLabel_3 = new JLabel("E-Mail:");
		lblNewLabel_3.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setBounds(58, 347, 80, 14);
		Ventana_principal.add(lblNewLabel_3);

		// emaill = new JPlaceholderTextField("write an avaliable e-mail adrees");
		emaill = new JTextField();
		emaill.setBackground(Color.BLACK);
		emaill.setForeground(Color.ORANGE);
		emaill.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 12));
		emaill.setBounds(130, 347, 259, 23);
		Ventana_principal.add(emaill);
		emaill.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Birthdate");
		lblNewLabel_4.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_4.setForeground(Color.ORANGE);
		lblNewLabel_4.setBounds(51, 392, 172, 14);
		Ventana_principal.add(lblNewLabel_4);

		JCheckBox chckbxNewCheckBox = new JCheckBox("YES");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="GLORIA A LA ORDEN DORADA!";
				String titulo="BRAVO!";
				JOptionPane.showMessageDialog(contentPane,"GLORIA A LA ORDEN DORADA!","BRAVO!", JOptionPane.DEFAULT_OPTION );
			}
		});
		chckbxNewCheckBox.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 11));
		chckbxNewCheckBox.setForeground(Color.ORANGE);
		chckbxNewCheckBox.setBackground(Color.BLACK);
		chckbxNewCheckBox.setBounds(182, 699, 97, 23);
		Ventana_principal.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Not yet");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = "A QUE ESTAS ESPERANDO";
				String titulo = "MUY MAL!!";
				JOptionPane.showMessageDialog(contentPane, "A QUE ESTAS ESPERANDO?", "MUY MAL!!",
						JOptionPane.WARNING_MESSAGE);
			}
		});

		chckbxNewCheckBox_1.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 11));
		chckbxNewCheckBox_1.setForeground(Color.ORANGE);
		chckbxNewCheckBox_1.setBackground(Color.BLACK);
		chckbxNewCheckBox_1.setBounds(182, 725, 97, 23);
		Ventana_principal.add(chckbxNewCheckBox_1);

		JLabel lblNewLabel_5 = new JLabel("Have you played this title before?");
		lblNewLabel_5.setForeground(Color.ORANGE);
		lblNewLabel_5.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(110, 667, 292, 25);
		Ventana_principal.add(lblNewLabel_5);

		textField_2 = new JPlaceholderTextField("Write an avaliable date");
		textField_2.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 12));
		textField_2.setBackground(Color.BLACK);
		textField_2.setForeground(Color.ORANGE);
		textField_2.setBounds(140, 390, 259, 20);
		Ventana_principal.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Sex:");
		lblNewLabel_6.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_6.setForeground(Color.ORANGE);
		lblNewLabel_6.setBounds(58, 442, 57, 14);
		Ventana_principal.add(lblNewLabel_6);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Man");
		rdbtnNewRadioButton.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 13));
		rdbtnNewRadioButton.setForeground(Color.ORANGE);
		rdbtnNewRadioButton.setBackground(Color.BLACK);
		rdbtnNewRadioButton.setBounds(84, 463, 109, 23);
		Ventana_principal.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Woman");
		rdbtnNewRadioButton_1.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setForeground(Color.ORANGE);
		rdbtnNewRadioButton_1.setBackground(Color.BLACK);
		rdbtnNewRadioButton_1.setBounds(204, 463, 109, 23);
		Ventana_principal.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
		rdbtnNewRadioButton_2.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setForeground(Color.ORANGE);
		rdbtnNewRadioButton_2.setBackground(Color.BLACK);
		rdbtnNewRadioButton_2.setBounds(321, 463, 109, 23);
		Ventana_principal.add(rdbtnNewRadioButton_2);

		JLabel lblNewLabel_7 = new JLabel("Tlf:");
		lblNewLabel_7.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_7.setForeground(Color.ORANGE);
		lblNewLabel_7.setBounds(51, 512, 74, 14);
		Ventana_principal.add(lblNewLabel_7);

		textField_3 = new JPlaceholderTextField("put your phone");
		/*textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_3) != null && tlf.get(0) <0 ) {
					JOptionPane.showMessageDialog(Ventana_principal, "INVALID PHONE", "ERROR!!",
							//JOptionPane.ERROR_MESSAGE);
				}
			}
		});*/
		textField_3.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 11));
		textField_3.setForeground(Color.ORANGE);
		textField_3.setBackground(Color.BLACK);
		textField_3.setBounds(86, 510, 185, 20);
		Ventana_principal.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Adress");
		lblNewLabel_8.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_8.setForeground(Color.ORANGE);
		lblNewLabel_8.setBounds(51, 553, 97, 14);
		Ventana_principal.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Country");
		lblNewLabel_9.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_9.setForeground(Color.ORANGE);
		lblNewLabel_9.setBounds(70, 577, 78, 23);
		Ventana_principal.add(lblNewLabel_9);

		textField_4 = new JPlaceholderTextField("Write your country");
		textField_4.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 12));
		textField_4.setBackground(Color.BLACK);
		textField_4.setForeground(Color.ORANGE);
		textField_4.setBounds(160, 579, 185, 20);
		Ventana_principal.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("Name");
		lblNewLabel_10.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_10.setForeground(Color.ORANGE);
		lblNewLabel_10.setBounds(113, 611, 90, 14);
		Ventana_principal.add(lblNewLabel_10);

		textField_5 = new JPlaceholderTextField("write your name");
		textField_5.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 12));
		textField_5.setBackground(Color.BLACK);
		textField_5.setForeground(Color.ORANGE);
		textField_5.setBounds(204, 609, 141, 20);
		Ventana_principal.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("Surname");
		lblNewLabel_12.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		lblNewLabel_12.setForeground(Color.ORANGE);
		lblNewLabel_12.setBounds(113, 636, 90, 14);
		Ventana_principal.add(lblNewLabel_12);

		textField_6 = new JPlaceholderTextField("Write your surname");
		textField_6.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 12));
		textField_6.setBackground(Color.BLACK);
		textField_6.setForeground(Color.ORANGE);
		textField_6.setBounds(204, 634, 141, 20);
		Ventana_principal.add(textField_6);
		textField_6.setColumns(10);

		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (passwordField.getText().equals(Comprobar_contraseña.getText()) && !emaill.getText().isEmpty()
						&& !Comprobar_contraseña.getText().isEmpty() && !passwordField.getText().isEmpty()
						&& !textField.getText().isEmpty()) {
					JFrame interfazlogin = new login();
					interfazlogin.setVisible(true);
					ventana1.setVisible(false);
					User.add(textField.getText());
					password.add(Comprobar_contraseña.getText());
					EMAIL.add(emaill.getText());

				} else {
					if (textField.getText().isEmpty() && passwordField.getText().isEmpty()
							&& emaill.getText().isEmpty()) {
						JOptionPane.showMessageDialog(Ventana_principal, "PLEASE COMPLETE THE FIELDS ", "WARNING",
								JOptionPane.WARNING_MESSAGE);
					} else if (textField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(Ventana_principal, "USERS FIELD IS EMPTY", "ERROR!!",
								JOptionPane.ERROR_MESSAGE);
						textField.setBackground(Color.RED);
					} else if (!passwordField.getText().equals(Comprobar_contraseña.getText())) {
						JOptionPane.showMessageDialog(Ventana_principal, "PASSWORD FAIL", "ERROR!!",
								JOptionPane.ERROR_MESSAGE);
						passwordField.setBackground(Color.RED);
						Comprobar_contraseña.setBackground(Color.RED);
					} else if (passwordField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(Ventana_principal, "PASSWORD FIELD IS EMPTY", "ERROR!!",
								JOptionPane.ERROR_MESSAGE);
						passwordField.setBackground(Color.RED);
						Comprobar_contraseña.setBackground(Color.RED);
					} else if (emaill.getText().isEmpty()) {
						JOptionPane.showMessageDialog(Ventana_principal, "EMAIL FIELD IS EMPTY", "ERROR!!",
								JOptionPane.ERROR_MESSAGE);
						emaill.setBackground(Color.RED);
					} else {
						// JOptionPane.showMessageDialog(Ventana_principal, "NO CORRECT DATA",
						// "ERROR!!",
						// JOptionPane.ERROR_MESSAGE);
					}
				}

			}
		});
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setFont(new Font("OptimusPrincepsSemiBold", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(64, 64, 64));
		btnNewButton.setBounds(357, 749, 242, 46);
		Ventana_principal.add(btnNewButton);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
