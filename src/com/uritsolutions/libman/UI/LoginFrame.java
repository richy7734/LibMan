package com.uritsolutions.libman.UI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.uritsolutions.libman.pojos.Book;

public class LoginFrame extends JFrame implements ActionListener {

	JButton loginButton;
	JTextField usernameTF;
	JPasswordField passwordTF;
	
	public LoginFrame() {
		setTitle("Login");
		JLabel head = new JLabel("Authentication..>!!");
		head.setBounds(50, 30, 100, 30);
		JLabel usernaemLabel = new JLabel("Username : ");
		usernaemLabel.setBounds(30, 60, 100, 30);
		JLabel passwordLabel = new JLabel("Password : ");
		passwordLabel.setBounds(30, 90, 100, 30);
		usernameTF = new JTextField();
		usernameTF.setEditable(true);
		usernameTF.setBounds(130, 60, 100, 30);
		passwordTF = new JPasswordField();
		passwordTF.setEditable(true);
		passwordTF.setBounds(130, 90, 100, 30);
		loginButton = new JButton("Login");
		loginButton.setBounds(130, 120, 80, 20);
		loginButton.addActionListener(this);
		add(head);
		add(usernaemLabel);
		add(passwordLabel);
		add(usernameTF);
		add(passwordTF);
		add(loginButton);

		setSize(400, 280);
		setLayout(null);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		setVisible(false);
		
		String username = new String();
		String password = new String();

		System.out.println("------------------ Welcome to LibMan v1.0.0 --------------------");
		System.out.println("Authentication : ");
		
		username = usernameTF.getText();
		password = passwordTF.getPassword().toString();

		System.out.println("You entered Username : "+username+" and Password : "+password);
		
		if (username.equals("admin") && password.equals("password")) {
			List<Book> books = new ArrayList<>();
			ShowBooksFrame showBooksFrame = new ShowBooksFrame(books);
		} else {
			
			JLabel label = new JLabel("Sorry... Username or password was incorrect...!");
			
			JDialog errorDialog = new JDialog(this, "Oops", true);
			errorDialog.setLayout(new FlowLayout());
			
			JButton button = new JButton("Ok");
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					errorDialog.setVisible(false);
					setVisible(true);
				}
			});
			
			errorDialog.setSize(300, 120);
			errorDialog.add(label);
			errorDialog.add(button);
			errorDialog.setVisible(true);
		}
		
	}

}

