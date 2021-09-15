package org.congnizant.java8tutorials_session2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaEventListers {
	public static void main(String[] args) {		
		JTextField tf = new JTextField();
		tf.setBounds(50,50,150,20);
		JButton button = new JButton("Click");
		button.setBounds(80,100,70,30);		
		//Lambda Expression implementing here		
		button.addActionListener(e -> {
			tf.setText("Good afternoon");
		});		
		JFrame frame = new JFrame();
		frame.add(tf); frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(300,200);
		frame.setVisible(true);

	}

}
