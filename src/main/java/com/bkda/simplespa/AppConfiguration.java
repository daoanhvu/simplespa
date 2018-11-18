package com.bkda.simplespa;

public final class AppConfiguration {
	private static AppConfiguration INSTANCE;
    
	public static void initialize() {
		INSTANCE = new AppConfiguration();
	}
	
	public static AppConfiguration getInstance() {
		return INSTANCE;
	}
}