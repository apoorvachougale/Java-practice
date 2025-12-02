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

public class CylinderApp extends JFrame {

	private JPanel contentPane;
	private JTextField radius;
	private JTextField height;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CylinderApp frame = new CylinderApp();
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
	public CylinderApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Find Area Of Cylinder");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(71, 11, 259, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Radius");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(40, 66, 96, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter height");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(40, 114, 96, 37);
		contentPane.add(lblNewLabel_2);
		
		radius = new JTextField();
		radius.setBounds(150, 83, 96, 20);
		contentPane.add(radius);
		radius.setColumns(10);
		
		height = new JTextField();
		height.setBounds(150, 124, 96, 20);
		contentPane.add(height);
		height.setColumns(10);
		
		JButton btnNewButton = new JButton("Find Area");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sradius = radius.getText();
				String sheight = height.getText();
				AreaOfCylinder sq = new AreaOfCylinder(Integer.parseInt(sheight), Integer.parseInt(sradius));
				double area = sq.calculateArea();
				result.setText("Area of Cylinder is: " +area);
			}
		});
		btnNewButton.setBounds(101, 161, 122, 23);
		contentPane.add(btnNewButton);
		
		result = new JTextField();
		result.setBounds(40, 195, 331, 57);
		contentPane.add(result);
		result.setColumns(10);
	}
}
