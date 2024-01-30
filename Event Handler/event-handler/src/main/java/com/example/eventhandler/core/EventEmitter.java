package com.example.eventhandler.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EventEmitter implements Observer {
	
	private final Map<EventListener, Long> subscribers = new ConcurrentHashMap<>();

	public void addSubscriber(EventListener listener) {
		subscribers.put(listener, System.currentTimeMillis());
	}

	public void removeSubscriber(EventListener listener) {
		subscribers.remove(listener);
	}

	public Map<EventListener, Long> getSubscribers() {
		return subscribers;
	}

	@Override
	public void onEvent(Event event) {
		System.out.println("Starting Notify..");

		for (EventListener eventListener : subscribers.keySet()) {
			System.out.println("firing event for subscriber.... ");
			eventListener.onEvent(event);
		}
	}
}
