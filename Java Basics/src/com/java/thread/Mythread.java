package com.java.thread;

public class Mythread extends Thread {
	public void run(){
		for( int i=1;i<=3;i++){
			System.out.println("Extended Thread:" + i);
			
		}
	}

}
