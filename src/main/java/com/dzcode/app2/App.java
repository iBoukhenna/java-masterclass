package com.dzcode.app2;

class Runner extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Hello " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
    
public final class App {
    private App() {
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runner());
        thread1.start();

        Thread thread2 = new Thread(new Runner());
        thread2.start();
    }
}
