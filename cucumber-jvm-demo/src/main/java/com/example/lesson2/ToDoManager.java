package com.example.lesson2;

import java.util.List;

public interface ToDoManager {

	void createList(String name);
	
	boolean hasList(String name);
	
	void addToDo(String name, String aufgabe);
	
	List<ToDo> getToDosList(String name);

}
