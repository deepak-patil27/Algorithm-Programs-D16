package com.bridgelab.AlgorithmPrograms;

import java.util.Scanner;

public class PrimeNoRange {
	public static void main(String[] args)
    {
        int lowerLimit,upperLimit;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lower limit: ");
        lowerLimit= sc.nextInt();  //take input
        System.out.println("Enter upper limit : ");
        upperLimit = sc.nextInt();  // take input

        PrimeNoRange range = new PrimeNoRange();
        System.out.println("Prime numbers between given range are:");
        range.primeRange(lowerLimit,upperLimit);
    }
    public void primeRange(int lower,int upper) {
        for (int i = lower; i <= upper; i++) {  // traverse each number in the interval
            if (i == 1 || i == 0)  // skip 0 and 1 as they are neither prime nor composite
                continue;
         // Flag variable tell if i is prime or not
            int flag = 1;  //flag 1 means i is prime

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0; //flag 0 means i is not prime
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }

}
