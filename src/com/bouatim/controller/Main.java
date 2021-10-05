package com.bouatim.controller;

import com.bouatim.view.MainUIInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainUIInterface mainInterface = new MainUIInterface();
		AuthController authController = new AuthController(mainInterface);
	}

}
