
package com.oop.uas;

/**
 *
 * @author Evelyn Chrisyla
 */
public class RobotHamburger implements Runnable {
    private Restaurant r;

    public void makeFood() throws InterruptedException {
        synchronized (r) {
            r.notifyAll();
           
            
            System.out.println("Robot Start making a Hamburger ");
            System.out.println("Robot End making Hamburger ");
           
        }
    }

    public RobotHamburger(Restaurant r) {
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