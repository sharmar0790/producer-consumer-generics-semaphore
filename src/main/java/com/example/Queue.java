package com.example;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class Queue<T> {

    private final int capacity;
    private final LinkedList<T> list;
    private final Semaphore semaphore = new Semaphore(10);

    public Queue(int capacity) {
        this.capacity = capacity;
        list = new LinkedList<>();
    }

    public void put(T val) {
        try {
            semaphore.acquireUninterruptibly();
            this.list.add(val);
        } finally {
            semaphore.release();
        }
    }

    public T take() {
        T val = null;
        try {
            semaphore.acquireUninterruptibly();
            val = this.list.remove();
        } finally {
            semaphore.release();
        }
        return val;
    }
}
