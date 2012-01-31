package com.example.lesson2;

import java.util.ArrayList;
import java.util.List;

public class ToDoManagerImpl implements ToDoManager {

	List<String> tdlist = new ArrayList<String>();
	
	public void createList(String name) {
		tdlist.add(name);
	}

	public boolean hasList(String name) {
		if (tdlist.contains(name)){
			return true;
		}
		return false;
	}

	

}
