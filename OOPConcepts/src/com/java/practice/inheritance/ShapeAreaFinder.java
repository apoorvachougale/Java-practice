package com.java.practice.inheritance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShapeAreaFinder extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShapeAreaFinder frame = new ShapeAreaFinder();
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
	public ShapeAreaFinder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Shape Area App");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		l1.setBounds(89, 11, 214, 35);
		contentPane.add(l1);
		
		JButton btnNewButton = new JButton("Square Area");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new SquareApp().setVisible(true);
			}
		});
		btnNewButton.setBounds(33, 80, 132, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Circle Area");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Area of Circle
				new CircleApp().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(192, 80, 140, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Rectangle Area");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RectangleApp().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(100, 207, 132, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Triangle Area");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TriangleApp().setVisible(true);
			}
		});
		btnNewButton_3.setBounds(33, 147, 132, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cylinder Area");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CylinderApp().setVisible(true);
			}
		});
		btnNewButton_4.setBounds(192, 147, 140, 23);
		contentPane.add(btnNewButton_4);
	}
}


//triangle , cylinder, 
//circle, square, rectangle