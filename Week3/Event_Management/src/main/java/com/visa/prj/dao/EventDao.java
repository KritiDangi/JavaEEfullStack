package com.visa.prj.dao;

import java.util.List;

import com.visa.prj.Entity.Event;

public interface EventDao {

	void addEvent(Event event);
	List<Event> getOpenEvents();
	List<Event> getClosedEvents();
	Event getEventById(int parseInt);
}
