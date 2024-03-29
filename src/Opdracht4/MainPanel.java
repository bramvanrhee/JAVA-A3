package Opdracht4;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import Swing.*;

public class MainPanel extends JPanel{
	
	JLabel v = new JLabel("Voornaam: ");
	JLabel a = new JLabel("Achternaam: ");
	
	JTextField voornaam = new JTextField(30);
	JTextField achternaam = new JTextField(30);
	
	DefaultListModel<String> model = new DefaultListModel<>();
	JList<String> contactList = new JList<>(model);
	JScrollPane listScrollPane = new JScrollPane(contactList);
	
	JButton delButton = new JButton("Reset");
	JButton okButton = new JButton("OK");
	
	public MainPanel() {
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addElement("Voornaam: " + voornaam.getText());
				model.addElement("Achternaam: " + achternaam.getText());
				model.addElement("");
			}
		});
		
		delButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				voornaam.setText("");
				achternaam.setText("");
				model.clear();
			}
			
		});
		setLayout(null);
		
		add(v);
		v.setBounds(10,10,100,30);
		add(voornaam);
		voornaam.setBounds(110, 10, 100, 30);
		
		add(a);
		a.setBounds(10,50,100,30);
		add(achternaam);
		achternaam.setBounds(110, 50, 100, 30);
		
	    add(delButton);
		delButton.setBounds(10, 100, 100, 30);
		    
		add(okButton);
	    okButton.setBounds(110, 100, 100, 30); 
	   
	    add(listScrollPane);
	    listScrollPane.setBounds(10, 150, 200, 200);
	}

}
