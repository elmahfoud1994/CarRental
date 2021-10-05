package com.bouatim.controller;

import com.bouatim.view.AuthUIView;
import com.bouatim.view.MainUIInterface;

public class AuthController {
	private AuthUIView authView = new AuthUIView();
	
	public AuthController(MainUIInterface mainInterface) {
		mainInterface.appendPanelToFrame(authView.getAuthPanel());
	}
}
