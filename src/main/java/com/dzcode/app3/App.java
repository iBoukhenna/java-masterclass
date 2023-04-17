package com.dzcode.app3;

public class App {
    private App() {
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {

            @Override
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
        });
        thread1.start();
    }

}
