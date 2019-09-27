package Opdracht4;

import javax.swing.*;

public class MainWindow extends JFrame{
	
	public MainWindow() {
		setSize(235, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Contact Lijst");
		setContentPane(new MainPanel());
		setVisible(true);
	}
}
