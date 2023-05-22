
package com.oop.uas;

/**
 *
 * @author Evelyn Chrisyla
 */
public class Client implements Runnable {
    private Restaurant r;

    public void makeOrder() throws InterruptedException {
        synchronized (r) {
            r.notifyAll();
            System.out.println("Start ordering ");
            System.out.println("End ordering ");
        }
    }

    public Client(Restaurant r) {
        this.r=r;
    }

    public void run() {
        try {
            makeOrder();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}