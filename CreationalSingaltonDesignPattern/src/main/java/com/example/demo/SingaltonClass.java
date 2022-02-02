package com.example.demo;

public class SingaltonClass {

	private static SingaltonClass singaltonclass = null;

	private SingaltonClass() {
		System.out.println("this is a singalton constroctor...");
	}

	public static SingaltonClass getInstance() {
		if (singaltonclass == null) {
			synchronized (SingaltonClass.class) {
				
				if(singaltonclass==null) {
				singaltonclass = new SingaltonClass();
			}
				}
		}
		return singaltonclass;
	}

}
