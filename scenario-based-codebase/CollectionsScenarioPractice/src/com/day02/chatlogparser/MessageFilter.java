package com.day02.chatlogparser;

// generic interface to filter messages
public interface MessageFilter<T> {
    boolean shouldKeep(T message);
}