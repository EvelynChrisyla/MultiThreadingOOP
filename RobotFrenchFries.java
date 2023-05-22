package com.oop.uas;
/**
 *
 * @author Evelyn Chrisyla
 */
public class RobotFrenchFries implements Runnable {
    private Restaurant r;

    public void makeFood() throws InterruptedException {
        synchronized (r) {
            r.notifyAll();

            System.out.println("Robot Start making a French Fries ");
            System.out.println("Robot End making French Fries ");
        }
    }
    public RobotFrenchFries(Restaurant r) {
        this.r=r;
    }

    @Override
    public void run() {
        try {
            makeFood();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}