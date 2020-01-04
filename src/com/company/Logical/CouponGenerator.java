package com.company.Logical;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponGenerator {

    public static void main(String args[])
    {
        int i =0;
        int numberOfAttempts = 0;
        Scanner couponsToGenerate = new Scanner(System.in);
        System.out.println("Enter the Number of Coupons to generate");
        int couponsCount = couponsToGenerate.nextInt();
        Set set = new HashSet();
        while(i < couponsCount)
        {
            int couponNumber = generateNumber();
            numberOfAttempts++;
            int befsize = set.size();
            set.add(couponNumber);
            int aftsize = set.size();
            if (befsize < aftsize) {
                i++;
            }
        }
        System.out.println("Elements in set are:"+ set);
        System.out.println("Out of "+ numberOfAttempts + ", times "+ couponsCount + " were successful");
    }

    private static int generateNumber() {
        Random random = new Random();
        return(random.nextInt(10));
    }
}

