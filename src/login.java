import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;


public class login {

	private JFrame frmLogin;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("Please enter your user name:");
		lblUserName.setBounds(66, 105, 198, 14);
		frmLogin.getContentPane().add(lblUserName);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(291, 102, 116, 20);
		frmLogin.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(290, 133, 117, 20);
		frmLogin.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblPassword = new JLabel("Please enter your password:");
		lblPassword.setBounds(66, 136, 198, 14);
		frmLogin.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(318, 181, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
		
		JLabel lblComputerScienceFlash = new JLabel("Computer Science Flash Cards");
		lblComputerScienceFlash.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblComputerScienceFlash.setBounds(66, 42, 341, 38);
		frmLogin.getContentPane().add(lblComputerScienceFlash);
	}
}
