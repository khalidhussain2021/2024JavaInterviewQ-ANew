package com.hussainIT.java8.funcationalInterface;

interface Vehicle{
	String getBrand();
	String speedUp();
	String slowDown();
	default String turnAlarmOn() {
		return "turning alarm on";
	}
	default String turnAlarmOff() {
		return "Turuning alarm is off";
	}
}
class Car implements Vehicle {

	@Override
	public String getBrand() {
		return "Maruti Brand car";
	}

	@Override
	public String speedUp() {
		return "Speed is between 100 to 20 Km";
	}

	@Override
	public String slowDown() {
		return "speed 10 km to 20 km";
	}
}
public class DefaultMethodDemo {
  public static void main(String[] args) {
	Vehicle car = new Car();
	System.out.println(car.getBrand());
	System.out.println(car.speedUp());
	System.out.println(car.slowDown());
	System.out.println(car.turnAlarmOff());
	System.out.println(car.turnAlarmOn());
 }
}
