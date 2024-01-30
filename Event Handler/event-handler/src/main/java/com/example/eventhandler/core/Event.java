package com.example.eventhandler.core;

import com.example.eventhandler.enums.EventType;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

public class Event {

	private Long id;
	private EventType EventType;
	private OffsetDateTime date;
	private Map<String, Object> data;

	public EventType getEventType() {
		return EventType;
	}

	public Event setEventType(EventType eventType) {
		EventType = eventType;
		return this;
	}

	public OffsetDateTime getDate() {
		return date;
	}

	public Event setDate(OffsetDateTime date) {
		this.date = date;
		return this;
	}

	public Event putDate(String key, Object value) {
		if (data == null)
			data = new HashMap<>();

		this.data.put(key, value);
		return this;
	}

	public Long getId() {
		return id;
	}

	public Event setId(Long id) {
		this.id = id;
		return this;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public Event setData(Map<String, Object> data) {
		this.data = data;
		return this;
	}
}
