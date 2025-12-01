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

public class Factorial extends JFrame {

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
					Factorial frame = new Factorial();
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
	public Factorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Factorial App");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l1.setBounds(333, 37, 276, 51);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Enter a number");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l2.setBounds(225, 159, 148, 43);
		contentPane.add(l2);
		
		num = new JTextField();
		num.setFont(new Font("Times New Roman", Font.BOLD, 20));
		num.setBounds(402, 157, 189, 51);
		contentPane.add(num);
		num.setColumns(10);
		
		JButton btnNewButton = new JButton("Find");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = num.getText();
				int n = Integer.parseInt(input);
				int fact= 1;
				for (int i=1; i<=n;i++) {
					fact *= i;
				}
				res.setText("Factorial of " +n+ " is: " +fact);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(449, 243, 99, 43);
		contentPane.add(btnNewButton);
		
		res = new JTextField();
		res.setFont(new Font("Times New Roman", Font.BOLD, 20));
		res.setBounds(378, 324, 276, 57);
		contentPane.add(res);
		res.setColumns(10);
	}

}
