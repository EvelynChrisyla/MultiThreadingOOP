
package com.oop.uas;

/**
 *
 * @author Evelyn Chrisyla
 */
public class RobotHotdog implements Runnable {
    private Restaurant r;

    public void makeFood() throws InterruptedException {
        synchronized (r) {
            r.notifyAll();

            System.out.println("Robot Start making Hotdog Beef Mozza");
           // Thread.sleep(1000);
            
            System.out.println("End making food Hotdog Beef Mozza");
        }
    }

    public RobotHotdog(Restaurant r) {
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