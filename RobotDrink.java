
package com.oop.uas;

/**
 *
 * @author Evelyn Chrisyla
 */
public class RobotDrink implements Runnable {
   
    private Restaurant r;

    public void makeFood() throws InterruptedException {
        synchronized (r) {
            r.notifyAll();

            System.out.println("Robot Start making a Drink");
            Thread.sleep(1);
            System.out.println("Robot End making a Drink ");
            r.client1();
        }
    }

    public RobotDrink(Restaurant r) {
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