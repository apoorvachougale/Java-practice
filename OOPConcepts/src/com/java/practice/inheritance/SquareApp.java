package com.java.practice.inheritance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SquareApp extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SquareApp frame = new SquareApp();
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
	public SquareApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Find Area of Square");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(75, 28, 248, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the length");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(53, 94, 110, 28);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setFont(new Font("Tahoma", Font.PLAIN, 16));
		length.setBounds(185, 100, 96, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btnNewButton = new JButton("Find Area");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String slength = length.getText();
				AreaOfSquare sq = new AreaOfSquare(Integer.parseInt(slength));
				int area = sq.calculateArea();
				res.setText("Area of Square is: " +area);
				
			}
		});
		btnNewButton.setBounds(130, 143, 129, 23);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(239, 193, -128, 22);
		contentPane.add(textArea);
		
		res = new JTextField();
		res.setBounds(49, 177, 289, 75);
		contentPane.add(res);
		res.setColumns(10);
	}
}
