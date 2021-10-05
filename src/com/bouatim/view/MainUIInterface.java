package com.bouatim.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainUIInterface {
	private JFrame frame = new JFrame();
	
	public MainUIInterface() {
		frame.setResizable(false);
		frame.setSize(1200,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void appendPanelToFrame(JPanel panel) {
		this.frame.add(panel);
		this.frame.repaint();
	}
}
