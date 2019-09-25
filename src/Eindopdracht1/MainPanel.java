package Eindopdracht1;

import java.awt.*;

import javax.swing.*;

public class MainPanel extends JPanel {
	
	int i = 0;
	
	public MainPanel() {
		setLayout(new GridLayout(4, 4));
		
		for (int i = 0; i < 16; i++) {
		add(new memoryButton().buttons[i] = new JButton("Card" + i));
		}
		
		
	}

}
