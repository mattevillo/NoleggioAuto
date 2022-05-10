package it.polito.tdp.noleggio.model;

import java.time.LocalTime;
import java.util.Objects;

public class Event implements Comparable<Event>{
	
	public enum EventType{
		NUOVO_CLIENTE, 
		AUTO_RESTITUITA
	}
	
	private LocalTime time;
	private EventType type;
	
	
	public Event(LocalTime time, EventType type) {
		super();
		this.time = time;
		this.type = type;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public EventType getType() {
		return type;
	}
	public void setType(EventType type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		return Objects.hash(time, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		return Objects.equals(time, other.time) && type == other.type;
	}
	@Override
	public int compareTo(Event other) {
		return this.time.compareTo(other.time);
	}
	
	

}
