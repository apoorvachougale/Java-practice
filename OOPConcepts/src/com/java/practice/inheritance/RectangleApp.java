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

public class RectangleApp extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField width;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RectangleApp frame = new RectangleApp();
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
	public RectangleApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Find Area of Rectangle");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(74, 11, 297, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter length");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(37, 75, 109, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Width");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(37, 115, 109, 29);
		contentPane.add(lblNewLabel_2);
		
		length = new JTextField();
		length.setBounds(156, 75, 96, 29);
		contentPane.add(length);
		length.setColumns(10);
		
		width = new JTextField();
		width.setBounds(156, 121, 96, 29);
		contentPane.add(width);
		width.setColumns(10);
		
		JButton btnNewButton = new JButton("Find Area");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String slength = length.getText();
				String swidth = width.getText();
				AreaOfRectangle sq = new AreaOfRectangle(Integer.parseInt(slength), Integer.parseInt(swidth));
				int area = sq.calculateArea();
				result.setText("Area of Rectangle is: " +area);
			}
		});
		btnNewButton.setBounds(116, 161, 109, 23);
		contentPane.add(btnNewButton);
		
		result = new JTextField();
		result.setBounds(62, 203, 233, 38);
		contentPane.add(result);
		result.setColumns(10);
	}

}
