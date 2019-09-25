package Eindopdracht1;

import javax.swing.*;

public class MainWindow extends JFrame {
	
	public MainWindow() {
		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Eindopdracht 1");
		setContentPane(new MainPanel());
		setVisible(true);
	}

}
