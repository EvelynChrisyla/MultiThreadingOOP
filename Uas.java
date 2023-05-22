package com.oop.uas;
/**
 *
 * @author Evelyn Chrisyla
 */

import java.util.Scanner;

class Uas extends Thread 
{
    public void run()
    {
        System.out.println("!Welcome Cheong-sun Restaurant!");
        for(int i=1;i<35; i++){
           System.out.print("-");
        }
        System.out.println("\n1. See Menu");
        System.out.println("2. Buy");
        System.out.println("3. Exit");
        for(int i=1;i<35; i++){
           System.out.print("-");
        }
        System.out.print("\nChoose Your Option: ");
    }
    
    static void menu()
    {
        System.out.println("\nHere are three food packages that we provide: ");
        for(int i=1;i<50; i++){
           System.out.print("-");
        }
        System.out.println("\nPackage A: Hotdog, French fries + Drink\n");  
        System.out.println("Package B: Hamburger, French fries + Drink\n");  
        System.out.println("Package C: Fried Chicken, French fries + Drink\n"); 
        for(int i=1;i<50; i++){
           System.out.print("-");
        }
        
    } 
    public static void main(String[] args) 
    {
        Uas t = new Uas();
        int input;
        Restaurant r = new Restaurant();
        Scanner userans = new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        t.start();
         do
        {   
            input = userans.nextInt();
           
            switch (input)
            {
                case 1:
                    menu();
                    System.out.println("\n");
                    break;
                     
                case 2:
                    
                        menu();
                        System.out.print("\nPackage Code to choose (A/B/C): ");
                        String str= sc.nextLine();  
                        System.out.println("\n"); 
                        
                        switch(str)
                        {
                            case "A":
                                 r.paketA();
                                 break;
                            case "B":
                                 r.paketB();
                                 break;
                            case "C":
                                 r.paketC();
                                 break;
                        }
                 break;   
                case 3:
                     System.exit(0);
                break;  
                default:
                 System.out.println("Wrong input, please input Again");
                break;
            }  
        } while(input!=3); 
    }
}