package com.example.lesson2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToDoManagerTest {

	ToDoManager tdmanager = new ToDoManagerImpl();
	
	@Test
	public void testCreateToDoList() {
		assertFalse(tdmanager.hasList("Umzug"));
		tdmanager.createList("Umzug");
		assertTrue(tdmanager.hasList("Umzug"));
	}
	@Test
	public void testCreateToDo(){
		tdmanager.createList("Umzug");
		tdmanager.addToDo("Umzug", "Kisten packen");
		assertEquals("Kisten packen", tdmanager.getToDosList("Umzug").get(0).getAufgabe());
	}
}
