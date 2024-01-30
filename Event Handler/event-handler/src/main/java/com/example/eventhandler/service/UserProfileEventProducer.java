package com.example.eventhandler.service;

import java.time.OffsetDateTime;
import java.time.ZoneId;

import com.example.eventhandler.core.Event;
import com.example.eventhandler.core.EventEmitter;
import com.example.eventhandler.enums.EventType;

public class UserProfileEventProducer extends EventConsumer implements EventProducer {
	
	private EventEmitter eventEmitter;
	public UserProfileEventProducer(EventEmitter eventEmitter) {
		this.eventEmitter = eventEmitter;
	}
	
	@Override
	public void produceEvent() {
		eventEmitter.onEvent(new Event().putDate("name", "Tom")
				.putDate("gender", "male")
				.setDate(OffsetDateTime.now(ZoneId.of("UTC")))
				.setEventType(EventType.EDIT_NAME));
	}
	
}
