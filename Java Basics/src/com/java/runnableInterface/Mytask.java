package com.java.runnableInterface;

public class Mytask implements Runnable {
	public void run(){
		for(int i=1;i<=3;i++){
			System.out.println("Implemented Runnable:"+i);
		}
		
	}

}
