package com.example.eventhandler.service;

import com.example.eventhandler.core.Event;
import com.example.eventhandler.core.EventListener;

public class EventConsumer implements EventListener {

	@Override
	public void onEvent(Event event) {
		System.out.println(new StringBuilder().append("New Event: ")
				.append(" Type:").append(event.getEventType().name())
				.append(" Data: ")
				.append(event.getData().entrySet().stream()
				.map(pair -> pair.getKey() + ":" + pair.getValue()).toList())
				.append(" Date:").append(event.getDate().toString()).toString());
	}

}
