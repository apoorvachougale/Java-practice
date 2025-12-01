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

public class PrimeNumberRange extends JFrame {

	private JPanel contentPane;
	private JTextField start;
	private JTextField res;
	private JLabel l3;
	private JTextField end;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeNumberRange frame = new PrimeNumberRange();
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
	public PrimeNumberRange() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 937, 679);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Prime Numbers Range");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l1.setBounds(256, 60, 335, 49);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Enter start value");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l2.setBounds(164, 212, 142, 35);
		contentPane.add(l2);
		
		start = new JTextField();
		start.setFont(new Font("Times New Roman", Font.BOLD, 20));
		start.setBounds(331, 208, 199, 47);
		contentPane.add(start);
		start.setColumns(10);
		
		JButton btnNewButton = new JButton("Find");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String start_value = start.getText();
				int start_val = Integer.parseInt(start_value);
				String end_value = end.getText();
				int end_val = Integer.parseInt(end_value);
				
				StringBuilder sb = new StringBuilder("Prime numbers are: ");
				for (int i = start_val;i<=end_val;i++) {
					Prime pc = new Prime();
					boolean result  = pc.isPrime(i);
					if (result == true) {
						sb.append(i).append(" ");
					}
				}
				res.setText(sb.toString());
			}
		});
		
	
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(369, 399, 111, 35);
		contentPane.add(btnNewButton);
		
		res = new JTextField();
		res.setFont(new Font("Times New Roman", Font.BOLD, 20));
		res.setBounds(225, 467, 436, 87);
		contentPane.add(res);
		res.setColumns(10);
		
		l3 = new JLabel("Enter end value");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l3.setBounds(164, 282, 150, 41);
		contentPane.add(l3);
		
		end = new JTextField();
		end.setFont(new Font("Times New Roman", Font.BOLD, 20));
		end.setBounds(331, 281, 199, 47);
		contentPane.add(end);
		end.setColumns(10);
	}

}
