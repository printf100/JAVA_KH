package com.test02;

public class Dog extends Animal {

	@Override
	public void start() {
		System.out.println("댕댕이 걷는다.");
	}

	@Override
	public void stop() {
		System.out.println("댕댕이 멈췄다.");
	}

}
