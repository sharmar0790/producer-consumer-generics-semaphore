package com.example;

import java.util.Random;

public class Producer<T> implements Runnable {

    private final Queue<T> queue;
    private final Random rand = new Random();

    public Producer(Queue<T> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        while (true) {
            Integer val = rand.nextInt(10);
            queue.put((T) val);
            System.out.println("Produced ==== ..... " + val);
        }

    }
}
