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

public class PrimeNumber extends JFrame {

	private JPanel contentPane;
	private JTextField num;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeNumber frame = new PrimeNumber();
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
	public PrimeNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel(" Prime Number App");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l1.setBounds(312, 54, 268, 35);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Enter a number");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l2.setBounds(138, 177, 164, 37);
		contentPane.add(l2);
		
		num = new JTextField();
		num.setFont(new Font("Times New Roman", Font.BOLD, 20));
		num.setBounds(342, 173, 171, 45);
		contentPane.add(num);
		num.setColumns(10);
		
		result = new JTextField();
		result.setFont(new Font("Times New Roman", Font.BOLD, 20));
		result.setBounds(269, 346, 329, 66);
		contentPane.add(result);
		result.setColumns(10);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = num.getText();
				int n = Integer.parseInt(number);
				if (n <= 1) {
					result.setText(n +" is not Prime.");
					return;
				}
				for (int i =2; i<=n/2;i++) {
					if (n%i==0) {
						result.setText(n +" is not Prime.");
						return;
					}
				}
				result.setText(n + " is Prime.");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(374, 270, 108, 35);
		contentPane.add(btnNewButton);
	}
}
