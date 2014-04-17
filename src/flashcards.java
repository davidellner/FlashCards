import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;


public class flashcards {

	private JFrame frmCards;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flashcards window = new flashcards();
					window.frmCards.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public flashcards() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCards = new JFrame();
		frmCards.setBounds(100, 100, 450, 300);
		frmCards.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCards.getContentPane().setLayout(null);
		
		JLabel lblQuestionNumber = new JLabel("Question #");
		lblQuestionNumber.setBounds(51, 57, 66, 14);
		frmCards.getContentPane().add(lblQuestionNumber);
		
		JLabel lblQuestion = new JLabel("What is the proper way to declare an integer variable in Java?");
		lblQuestion.setBounds(51, 82, 323, 14);
		frmCards.getContentPane().add(lblQuestion);
		
		JRadioButton radAnswerOne = new JRadioButton("x int = 2");
		radAnswerOne.setBounds(51, 103, 109, 23);
		frmCards.getContentPane().add(radAnswerOne);
		
		JRadioButton radAnswerTwo = new JRadioButton("int x = 2;");
		radAnswerTwo.setBounds(51, 129, 109, 23);
		frmCards.getContentPane().add(radAnswerTwo);
		
		JRadioButton radAnswerThree = new JRadioButton("2 = x;");
		radAnswerThree.setBounds(51, 155, 109, 23);
		frmCards.getContentPane().add(radAnswerThree);
		
		JRadioButton radAnswerFour = new JRadioButton("int x: 2;");
		radAnswerFour.setBounds(51, 181, 109, 23);
		frmCards.getContentPane().add(radAnswerFour);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(51, 211, 89, 23);
		frmCards.getContentPane().add(btnPrevious);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(310, 211, 89, 23);
		frmCards.getContentPane().add(btnNext);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(182, 211, 89, 23);
		frmCards.getContentPane().add(btnSubmit);
		
		JLabel lblScore = new JLabel("Score:");
		lblScore.setBounds(353, 57, 46, 14);
		frmCards.getContentPane().add(lblScore);
		
		JLabel lblPercentageCorrect = new JLabel("Percentage Correct:");
		lblPercentageCorrect.setBounds(182, 57, 149, 14);
		frmCards.getContentPane().add(lblPercentageCorrect);
	}
}
