
package com.oop.uas;

/**
 *
 * @author Evelyn Chrisyla
 */
public class RobotFriedChicken implements Runnable {
    private Restaurant r;

    public void makeFood() throws InterruptedException {
        synchronized (r) {
            r.notifyAll();

            System.out.println("Robot Start making a Fried Chicken Pok Pok ");
            //Thread.sleep(1000);
            System.out.println("Robot End making Fried Chicken Pok Pok ");
        }
    }

    public RobotFriedChicken(Restaurant r) {
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
