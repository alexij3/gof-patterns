package com.buzilov.patterns.behavioral.memento;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// This class holds the history of Course states (mementos).
public class CourseCaretaker {
    private final Map<String, CourseMemento> statesHistory = new HashMap<>();

    public void saveState(String tag, CourseMemento courseState) {
        statesHistory.put(tag, courseState);
    }

    public Optional<CourseMemento> getState(String tag) {
        return Optional.ofNullable(statesHistory.get(tag));
    }
}
