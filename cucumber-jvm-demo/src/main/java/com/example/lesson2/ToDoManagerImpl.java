package com.example.lesson2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToDoManagerImpl implements ToDoManager {

	private Map<String, List<ToDo>> todolists = new HashMap<String, List<ToDo>>();
	
	public void createList(String name) {
		todolists.put(name, new ArrayList<ToDo>());
	}

	public boolean hasList(String name) {
		if (todolists.containsKey(name)){
			return true;
		}
		return false;
	}

	public void addToDo(String name, String aufgabe) {
		if (hasList(name)){
			ToDo todo = new ToDo(aufgabe);	
			todolists.get(name).add(todo);
		}
		else {
			throw new RuntimeException("Diese Todo-Liste gibt es nicht.");
		}	
		
	}
	
	public List<ToDo> getToDosList(String name){
		if (todolists.containsKey(name)){
			return todolists.get(name);
		}
		else {
			throw new RuntimeException("Diese Todo-Liste gibt es nicht.");
		}	
	}
	

}
