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

public class NthTermSeries extends JFrame {

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
					NthTermSeries frame = new NthTermSeries();
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
	public NthTermSeries() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 996, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Nth Term of Series");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l1.setBounds(309, 58, 292, 56);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Enter a number");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l2.setBounds(199, 166, 161, 42);
		contentPane.add(l2);
		
		num = new JTextField();
		num.setFont(new Font("Times New Roman", Font.BOLD, 20));
		num.setBounds(352, 166, 173, 42);
		contentPane.add(num);
		num.setColumns(10);
		
		JButton btnNewButton = new JButton("Find");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = num.getText();
				int n = Integer.parseInt(input);
				int sum= 0;
				for (int i=1; i<=n;i++) {
					sum += i;
				}
				res.setText(+n+ "th term of series is: " +sum);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(393, 242, 103, 42);
		contentPane.add(btnNewButton);
		
		res = new JTextField();
		res.setFont(new Font("Times New Roman", Font.BOLD, 20));
		res.setBounds(277, 309, 377, 56);
		contentPane.add(res);
		res.setColumns(10);
	}

}
