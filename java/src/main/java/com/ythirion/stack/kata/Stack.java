package com.ythirion.stack.kata;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {
    private final ArrayList<Object> internalStack;

    public Stack() {
        internalStack = new ArrayList<>();
    }

    public Object pop() {
        if (internalStack.isEmpty()) {
            throw new EmptyStackException();
        }
        var lastElement = internalStack.get(internalStack.size() - 1);
        internalStack.remove(lastElement);

        return lastElement;
    }

    public void push(Object element) {
        internalStack.add(element);
    }
}