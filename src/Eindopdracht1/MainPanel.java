package Eindopdracht1;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class MainPanel extends JPanel {
	
	int i = 0;
	GameBoard gameBoard;
	
	public MainPanel() {
		gameBoard = new GameBoard();
		setLayout(new GridLayout(4, 4));
		ArrayList<Card> list = gameBoard.getList();
		for (Card card : list) {
			add(card);
		}
		
		
		
		
		
	}

}
