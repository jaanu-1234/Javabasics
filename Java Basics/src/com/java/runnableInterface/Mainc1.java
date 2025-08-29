package com.java.runnableInterface;

public class Mainc1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mytask task=new Mytask();
		Thread t1=new Thread(task);
		t1.start();

	}

}
