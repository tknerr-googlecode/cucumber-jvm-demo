package com.example.lesson2;

public class ToDo {
	private String aufgabe;
	private Status status;
	
	public ToDo(String aufgabe){
		this.aufgabe = aufgabe;
		status = Status.OFFEN;
	}

	public String getAufgabe(){
		return this.aufgabe;
	}
}
