package com.example;

public class Consumer<T> implements Runnable {

    private final Queue<T> queue;

    public Consumer(Queue<T> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            T val = queue.take();
            System.out.println("Consumed === ...." + val);
        }

    }
}
