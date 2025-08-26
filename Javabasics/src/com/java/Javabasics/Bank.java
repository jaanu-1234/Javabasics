/**
 * 
 */
package com.java.Javabasics;

/**
 * @author Dell 5470
 *
 */
public class Bank extends Customer {

	/**
	 * @param args
	 */
	public class SavingsAccount {
        void msg() {
            System.out.println("I am savings account");
        }
    }
	public class RecurringAccount {
        void msg() {
            System.out.println("I am recurring account");
        }
    }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Bank bank = new Bank(); // outer class object

        // inherited method from Customer
        bank.customerDetails();

        // inner class objects
        Bank.SavingsAccount obj1 = bank.new SavingsAccount();
        obj1.msg();

        Bank.RecurringAccount obj2 = bank.new RecurringAccount();
        obj2.msg();
		

	}

}
