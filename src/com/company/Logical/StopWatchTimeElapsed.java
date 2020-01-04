package com.company.Logical;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class StopWatchTimeElapsed {

    public static void main(String args[]) {
        Scanner WatchIndicator = new Scanner(System.in);
        System.out.print("Do you want to start the Stopwatch(Press Y):");
        String startWatch = WatchIndicator.nextLine();
        long start = 0;
        long end = 0;
        if (startWatch.equalsIgnoreCase("Y")) {
            start = System.currentTimeMillis();
            System.out.print("Do you want to end the Stopwatch(Press Y):");
            String endWatch = WatchIndicator.nextLine();
            if (endWatch.equalsIgnoreCase("Y")) {
                end = System.currentTimeMillis();
                long diff = end-start;
                DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                Date date = new Date(diff);
                String timeElapsed = dateFormat.format(date);
                System.out.println("Time Elapsed in HH:mm:ss "+ timeElapsed);
            }
            else
            {
                System.out.println("This is an invalid response, please try again");
            }
        }
        else
        {
            System.out.println("This is an invalid response, please try again");
        }



    }
}
