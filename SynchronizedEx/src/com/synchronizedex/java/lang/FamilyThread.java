package com.synchronizedex.java.lang;

public class FamilyThread extends Thread {
	
	private BathRoom br;
	private String who;
	
	public FamilyThread(String name, BathRoom bathRoom) {
		who = name;
		br = bathRoom;
	}
		
	public void run() {
		br.openDoor(who);
	}
}
