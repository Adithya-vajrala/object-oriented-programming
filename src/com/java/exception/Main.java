package com.java.exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Enter num1:");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2:");
        int num2 = scanner.nextInt();
        try {
            arr[5] = 6;
            try {
                System.out.println("Results:" + num1/num2);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        }
    }



