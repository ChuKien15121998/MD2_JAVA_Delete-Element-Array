package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int[] arrNumber = {7, 5, 15, 12, 9, 4, 98, 0, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number you want to delete:");
        int numberDelete = input.nextInt();
        int index_del = 0;
        for (int i = 0; i < arrNumber.length; i++) {
            if (arrNumber[i] == numberDelete) {
                index_del = i;
                System.out.println("index_del = " + index_del);
                break;
            }
        }
        for (int i = index_del; i < arrNumber.length-1; i++) {
            arrNumber[i] = arrNumber[i + 1];
        }
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("New arrNumber is: " + arrNumber[i]);
        }
    }
}
