package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum=0;
        Scanner s= new Scanner(System.in);
        int [] arr= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum ="+sum);
        int average =sum/(arr.length-1);
        System.out.println("Average ="+average);
    }
}
