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

public class Fibonacci extends JFrame {

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
					Fibonacci frame = new Fibonacci();
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
	public Fibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Fibonacci Series");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l1.setBounds(334, 54, 234, 48);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Enter a number");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l2.setBounds(221, 162, 145, 40);
		contentPane.add(l2);
		
		num = new JTextField();
		num.setFont(new Font("Times New Roman", Font.BOLD, 20));
		num.setBounds(376, 162, 192, 48);
		contentPane.add(num);
		num.setColumns(10);
		
		JButton btnNewButton = new JButton("Find");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fib1 = 0;
				int fib2 = 1;
				String input = num.getText();
				int n = Integer.parseInt(input);
				StringBuilder sb = new StringBuilder("Fibonacci series: ");
				for (int i=1; i<=n;i++) {
						sb.append(fib1).append(" ");
						int next_number = fib1+fib2;
						fib1 = fib2;
						fib2 = next_number;
				}
				res.setText(sb.toString());
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(428, 251, 94, 40);
		contentPane.add(btnNewButton);
		
		res = new JTextField();
		res.setFont(new Font("Times New Roman", Font.BOLD, 20));
		res.setBounds(293, 339, 389, 54);
		contentPane.add(res);
		res.setColumns(10);
	}

}
