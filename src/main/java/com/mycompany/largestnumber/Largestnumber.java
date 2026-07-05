/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.largestnumber;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        int number;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;
        System.out.println("enter numbers");
        while (true) {
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
            if (number > largest) {
                largest = number;
            }
        }
        if (count > 0) {
            System.out.println("largest number " + largest);
            System.out.println("sum of all numbers " + sum);
            System.out.println("number of occurance " + count);
        } else {
            System.out.println("no numbers were entered");
        }
        input.close();
    }
}
