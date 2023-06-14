package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost(int rupees) {
		System.out.println("Salary is-"+ rupees);
		
	}

	@Override
	public void speed(int metre) {
		System.out.println("Speed is-"+ metre);
	
		
	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost(654321);
		k.speed(123);
	}

}
