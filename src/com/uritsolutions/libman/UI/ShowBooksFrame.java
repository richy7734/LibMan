package com.uritsolutions.libman.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.uritsolutions.libman.pojos.Book;

public class ShowBooksFrame extends JFrame implements ActionListener {

	JButton okButton;
	JButton cancelButton;
	
	public ShowBooksFrame(List<Book> books) {
		
		okButton = new JButton("OK");
		cancelButton = new JButton("Cancel"); 
		
		okButton.setBounds(40, 75, 50, 30);
		cancelButton.setBounds(90, 75, 100, 30);
		okButton.addActionListener(this);
		
		add(okButton);
		add(cancelButton);
		
		setSize(400, 280);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent okAction) {
		
		setVisible(false);
	}
	
}
