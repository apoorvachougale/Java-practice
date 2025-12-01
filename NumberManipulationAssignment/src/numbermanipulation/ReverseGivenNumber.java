package numbermanipulation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class ReverseGivenNumber extends JFrame {

	private JPanel contentPane;
	private JTextField n;
	private JTextField rev;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseGivenNumber frame = new ReverseGivenNumber();
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
	public ReverseGivenNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Reverse Number App");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l1.setBounds(268, 34, 289, 38);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Enter a Number");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l2.setBounds(65, 146, 163, 32);
		contentPane.add(l2);
		
		n = new JTextField();
		n.setFont(new Font("Times New Roman", Font.BOLD, 20));
		n.setBounds(269, 137, 229, 54);
		contentPane.add(n);
		n.setColumns(10);
		
		rev = new JTextField();
		rev.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rev.setBounds(256, 309, 301, 54);
		contentPane.add(rev);
		rev.setColumns(10);
		
		JButton btnNewButton = new JButton("Reverse It");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = n.getText();
				int num = Integer.parseInt(number);
				int reverse = 0;
				while (num >0) {
					int rem = num % 10;
					reverse = reverse * 10 + rem;
					num = num / 10;
				}
				rev.setText("Reversed number is: " +reverse);
			}
		});
		btnNewButton.setBounds(317, 245, 133, 32);
		contentPane.add(btnNewButton);
	}
}
