package com.java.practice.inheritance;

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

public class CircleApp extends JFrame {

	private JPanel contentPane;
	private JTextField radius;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircleApp frame = new CircleApp();
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
	public CircleApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Find Area of Circle");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(67, 11, 281, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Radius");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(30, 89, 124, 32);
		contentPane.add(lblNewLabel_1);
		
		radius = new JTextField();
		radius.setBounds(164, 79, 161, 42);
		contentPane.add(radius);
		radius.setColumns(10);
		
		JButton btnNewButton = new JButton("Find Area");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sradius = radius.getText();
				AreaOfCircle ac = new AreaOfCircle(Double.parseDouble(sradius));
				double area = ac.calculateArea();
				result.setText("Area of Circle is: " +area);
			}
		});
		btnNewButton.setBounds(123, 150, 96, 32);
		contentPane.add(btnNewButton);
		
		result = new JTextField();
		result.setBounds(67, 193, 269, 59);
		contentPane.add(result);
		result.setColumns(10);
	}
}
