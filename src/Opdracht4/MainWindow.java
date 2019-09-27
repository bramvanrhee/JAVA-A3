package Opdracht4;

import javax.swing.*;

public class MainWindow extends JFrame{
	
	public MainWindow() {
		setSize(235, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Hello World");
		setContentPane(new MainPanel());
		setVisible(true);
	}
}
