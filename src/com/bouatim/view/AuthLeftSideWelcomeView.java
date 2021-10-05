package com.bouatim.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AuthLeftSideWelcomeView {
	private JPanel welcomePanel = new JPanel();
	private JLabel backgroundLabel = new JLabel();
    private JLabel welcomeMessage;

	public AuthLeftSideWelcomeView() {
		
		// setting up the background 
	    ImageIcon imageIcon = new ImageIcon("backgroundImage.jpg");
		Image backgroundImage = imageIcon.getImage();
	    Image newimg = backgroundImage.getScaledInstance(600, 700,  java.awt.Image.SCALE_SMOOTH); 
	    imageIcon = new ImageIcon(newimg);
	    backgroundLabel.setSize(600,700);
	    backgroundLabel.setIcon(imageIcon);
	    
	    // setting the welcome message
	    welcomeMessage= new JLabel("Hello, Welcome to the Car rental Service");
	    welcomeMessage.setFont(new Font(Font.SERIF,Font.BOLD,20));
	    welcomeMessage.setForeground(Color.white);
	    welcomeMessage.setBounds(100,330,400,40);	  
	    
	    // adding all the elements to the background image
	    welcomePanel.add(welcomeMessage);
	    welcomePanel.add(backgroundLabel);
		welcomePanel.setSize(600,700);
	}

	public JPanel getWelcomePanel() {
		return welcomePanel;
	}

	
}
