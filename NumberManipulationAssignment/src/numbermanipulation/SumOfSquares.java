package numbermanipulation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SumOfSquares extends JFrame {

	private JPanel contentPane;
	private JTextField num;
	private JTextField res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SumOfSquares frame = new SumOfSquares();
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
	public SumOfSquares() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1023, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Sum of Squares");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l1.setBounds(381, 54, 342, 68);
		contentPane.add(l1);
		
		JLabel lblNewLabel = new JLabel("Enter a number");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(275, 189, 151, 39);
		contentPane.add(lblNewLabel);
		
		num = new JTextField();
		num.setFont(new Font("Times New Roman", Font.BOLD, 20));
		num.setBounds(424, 185, 178, 51);
		contentPane.add(num);
		num.setColumns(10);
		
		JButton btnNewButton = new JButton("Find");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = num.getText();
				int n = Integer.parseInt(input);
				int sum_of_squares = 0;
				for (int i = 1; i <= n; i++) {
					sum_of_squares += (i*i);
				}
				res.setText("Sum of squares is: " +sum_of_squares);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(469, 275, 90, 39);
		contentPane.add(btnNewButton);
		
		res = new JTextField();
		res.setFont(new Font("Times New Roman", Font.BOLD, 20));
		res.setBounds(369, 371, 277, 57);
		contentPane.add(res);
		res.setColumns(10);
	}

}
