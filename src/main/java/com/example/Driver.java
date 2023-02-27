package com.example;

public class Driver {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(10);
        Producer<Integer> producer = new Producer<Integer>(queue);

        Consumer<Integer> consumer = new Consumer<Integer>(queue);

        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(consumer).start();
    }


}
