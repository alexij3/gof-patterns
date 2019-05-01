package com.buzilov.patterns.behavioral.chain.notifiers;

import com.buzilov.patterns.behavioral.chain.model.Event;

public abstract class Notifier {
    protected Event event;
    protected Notifier nextNotifier;

    public Notifier(Event event) {
        this.event = event;
    }

    public abstract void notifyUser();

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }
}
