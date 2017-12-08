package com.uritsolutions.libman.UI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JToolBar.Separator;

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("LibMan");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JToolBar mainToolBar = new JToolBar();
		/*mainToolBar.setAutoscrolls(true);*/
		mainToolBar.add(new JButton("Home"));
		mainToolBar.addSeparator();
		mainToolBar.add(new JButton("Book"));
		mainToolBar.addSeparator();
		mainToolBar.add(new JButton("User"));
		Container container = getContentPane();
		container.add(mainToolBar, BorderLayout.NORTH);
		
		
		
		
		
	}
}
