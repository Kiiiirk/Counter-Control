package oop.sectiong;

import javax.swing.*;
import java.awt.event.*;

class IncrementDcmt {
	public static int count = 0;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300,400);
		frame.setVisible(true);
		frame.setLayout(null);
		
		final JLabel countLbl = new JLabel("0");
		countLbl.setBounds(50,50,100,50);
		frame.add(countLbl);

		JButton increment = new JButton("Increment");
		increment.setBounds(5,105,80,30);
		increment.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){ 
				countLbl.setText("" + ++count);
			}
		});
		frame.add(increment);
		
		JButton decrement = new JButton("Decrement");
		decrement.setBounds(100,105,80,30);
		decrement.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){ 
				countLbl.setText("" + --count);
			}
		});
		frame.add(decrement);
		
		JButton reset = new JButton("Reset");
		reset.setBounds(200,105,80,30);
		reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){ 
				count = 0;
				countLbl.setText("" + count);
			}
		});
		frame.add(reset);
		
		

	}
}