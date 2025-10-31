package com.Year2.projects;

import java.util.Scanner;

public class Delimiter {
    public  static void main(String[]a){
        String data = "Honorine turamuha bonbon 5";
        String data2 = "17/10/2025";
        Scanner c = new Scanner(data2);
        c.useDelimiter("/");
        String token1= c.next();
        String token2 = c.next();
        String token3 = c.next();

        int year= Integer.parseInt(token3);
        int date1= Integer.parseInt(token1);
        int month = Integer.parseInt(token2);
        int sum = year + date1 + month ;

        System.out.println(sum);
//        System.out.println("Name: " + token1+ " bonbon: " +);
        c.close();
    }
}
