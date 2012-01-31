package com.example.demo;

public class HelloWorld {

	private int variableA=0;
	
	public static void main(String[] args) {
		System.out.println("Hello from Sammi & Pippa :-)");
		HelloWorld hw = new HelloWorld();
		hw.setVariable(10);
		System.out.println(hw.getVariable());

	}
	
	private void setVariable(int a){
		variableA=a;
	}
	
	private int getVariable(){
		return variableA;
	}

}
