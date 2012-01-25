package com.example.demo;

public class HelloWorld {

	/**
	 * @param args
	 */
	private int variableA=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Kitty :-)");
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
