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

public class TriangleApp extends JFrame {

	private JPanel contentPane;
	private JTextField len;
	private JTextField height;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TriangleApp frame = new TriangleApp();
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
	public TriangleApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Find Area Of Triangle");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(66, 11, 301, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter length");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(29, 67, 100, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Height");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(29, 108, 100, 30);
		contentPane.add(lblNewLabel_2);
		
		len = new JTextField();
		len.setBounds(139, 77, 96, 20);
		contentPane.add(len);
		len.setColumns(10);
		
		height = new JTextField();
		height.setBounds(139, 115, 96, 20);
		contentPane.add(height);
		height.setColumns(10);
		
		JButton btnNewButton = new JButton("Find Area");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String slength = len.getText();
				String swidth = height.getText();
				AreaOfTriangle sq = new AreaOfTriangle(Integer.parseInt(slength), Integer.parseInt(swidth));
				double area = sq.calculateArea();
				result.setText("Area of Triangle is: " +area);
			}
		});
		btnNewButton.setBounds(101, 159, 117, 23);
		contentPane.add(btnNewButton);
		
		result = new JTextField();
		result.setBounds(55, 197, 301, 55);
		contentPane.add(result);
		result.setColumns(10);
	}

}
