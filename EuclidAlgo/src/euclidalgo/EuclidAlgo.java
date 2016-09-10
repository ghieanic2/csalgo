/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidalgo;

import java.util.Scanner;

/**
 *
 * @author moaniceto
 */
public class EuclidAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int rem = 0;

        System.out.println("FIND THE GCD");

        System.out.println("Enter first number:");
        num1 = in.nextInt();
        System.out.println("Enter second number:");
        num2 = in.nextInt();

        do {
            if (num2 > num1) {
                rem = num2 % num1;
            } else {
                rem = num1 % num2;
            }

            num1 = num2;
            num2 = rem;

        } while (num2 != 0);

        System.out.println("GCD: " + num1);

    }

}
