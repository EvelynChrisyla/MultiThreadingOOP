/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.uas;

/**
 *
 * @author Evelyn Chrisyla
 */
public class Restaurant {

    int orderId;

    public Restaurant() {
    }
    public void paketA() {
        this.orderId = 1;
        RobotHotdog ch = new RobotHotdog(this);
        RobotFrenchFries ch1 = new RobotFrenchFries(this);
        RobotDrink ch2 = new RobotDrink(this);
        Thread t1 = new Thread(ch);
        Thread t2 = new Thread(ch1);
         Thread t3 = new Thread(ch2);
       
        t1.start();
        t2.start();
        t3.start();

    }
    
    public void paketB() {
        this.orderId = 1;
        RobotHamburger A = new RobotHamburger(this);
        RobotFrenchFries B = new RobotFrenchFries(this);
        RobotDrink C = new RobotDrink(this);
        Thread A1 = new Thread(A);
        Thread A2 = new Thread(B);
        Thread A3 = new Thread(C);
       
        A1.start();
        A2.start();
        A3.start();
    }
    
    public void paketC() {
        this.orderId = 1;  
        RobotFriedChicken D = new RobotFriedChicken(this);
        RobotFrenchFries E = new RobotFrenchFries(this);
        RobotDrink F = new RobotDrink(this);
        Thread C1 = new Thread(D);
        Thread C2 = new Thread(E);
        Thread C3 = new Thread(F);
       
        C1.start();
        C2.start();
        C3.start();
    }

    public void client1(){
         System.out.println("\n  *Your Food is Ready, please pick up your food*");
    }
    
    
}