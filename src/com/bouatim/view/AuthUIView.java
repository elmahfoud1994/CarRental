package com.bouatim.view;
import java.awt.Color;
import javax.swing.JPanel;


public class AuthUIView {
	private JPanel authPanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	private JPanel welcomePanel;
	public AuthUIView() {
		
		rightPanel.setBounds(600,0,600,700);
		rightPanel.setBackground(Color.red);
		authPanel.setSize(1200,700);
		
		this.welcomePanel = new AuthLeftSideWelcomeView().getWelcomePanel();
		authPanel.add(welcomePanel);
		authPanel.add(rightPanel);
		
	}

	public JPanel getAuthPanel() {
		return authPanel;
	}
	
	
}
