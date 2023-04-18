package com.dzcode.app;

import java.util.concurrent.Semaphore;

public class App {

    public static void main(String[] args) throws Exception {
        Semaphore semaphore = new Semaphore(1);

        semaphore.acquire();
        semaphore.release();

        System.out.println("Available permits: " + semaphore.availablePermits());
    }
}
