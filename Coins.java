/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgo;

import java.util.Scanner;

/**
 *
 * @author moaniceto
 */
public class GreedyAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        double n;
        
        double tens;
        double fives;
        double ones;
        double cents;
        
        System.out.println("Enter value:");
        n = in.nextDouble();
        
        double a = 10;
        double b = 5;
        double c = 1;
        double d = .25;
        
        
        double x = Math.floor(n);
        
        tens = Math.floor(x/a);
        x -= tens*a;
        fives = Math.floor(x/b);
        x -= fives*b;
        ones = Math.floor(x/c);
        x -= ones*c;
        cents = (n-Math.floor(n))/d;
        
        System.out.println("10 peso coins: "+tens);  
        System.out.println("5 peso coins: "+fives);
        System.out.println("1 peso coins: "+ones);
        System.out.println("25 cents coins: "+cents);
    }
    
}
