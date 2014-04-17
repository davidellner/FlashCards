import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;


public class creation {

	private JFrame frmCreation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					creation window = new creation();
					window.frmCreation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public creation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCreation = new JFrame();
		frmCreation.setBounds(100, 100, 550, 400);
		frmCreation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCreation.getContentPane().setLayout(null);
		
		JLabel lblCreate = new JLabel("What type of question would you like to create:");
		lblCreate.setBounds(78, 36, 275, 14);
		frmCreation.getContentPane().add(lblCreate);
		
		JComboBox cboQuestion = new JComboBox();
		cboQuestion.setBounds(384, 33, 98, 20);
		frmCreation.getContentPane().add(cboQuestion);
		
		JTextArea txtQuestion = new JTextArea();
		txtQuestion.setBounds(78, 84, 404, 90);
		frmCreation.getContentPane().add(txtQuestion);
		
		JLabel lblEnter = new JLabel("Enter your question here");
		lblEnter.setBounds(78, 61, 171, 14);
		frmCreation.getContentPane().add(lblEnter);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(78, 217, 404, 90);
		frmCreation.getContentPane().add(textArea);
		
		JLabel lblAnswer = new JLabel("Enter your answer here");
		lblAnswer.setBounds(78, 192, 171, 14);
		frmCreation.getContentPane().add(lblAnswer);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(344, 328, 89, 23);
		frmCreation.getContentPane().add(btnCreate);
	}
}
