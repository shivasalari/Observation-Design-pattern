package com.example.eventhandler.service;

import java.time.OffsetDateTime;
import java.time.ZoneId;

import com.example.eventhandler.core.Event;
import com.example.eventhandler.core.EventEmitter;
import com.example.eventhandler.enums.EventType;

public class WalletEventProducer extends EventConsumer implements EventProducer {

	private EventEmitter eventEmitter;
	public WalletEventProducer(EventEmitter eventEmitter) {
		this.eventEmitter = eventEmitter;
	}
	
	@Override
	public void produceEvent() {
		eventEmitter.onEvent(new Event()
				.putDate("bank", "mellat")
				.putDate("amount", 1000)
				.setDate(OffsetDateTime.now(ZoneId.of("UTC")))
				.setEventType(EventType.NEW_DEPOSIT));
	}
	
}
