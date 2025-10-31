package com.Year2.projects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.SortedMap;

public class IOstream {
    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\HP\\Documents\\texts\\one.txt");
//        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
//            writer.println("Wake up ...");
//            writer.println("still in java");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Scanner c = new Scanner(System.in);
//        System.out.println("Enter data, type 'exit' to quit!!");
//        String line;
//        while (c.hasNext()){
//            line =c.nextLine();
//            if(line.equalsIgnoreCase("exit"))
//                break;
//            System.out.println("entered:" + line);
//        }
//        c.close();


    }
}

class Delimiter2{
    public  static void main(String[]a){
        String data = "Honorine turamuha bonbon 5";
        Scanner c = new Scanner(data);
        String token1= c.next();
        String token2 = c.next();
        String token3 = c.next();
        String token4 = c.next();
        int token5 = c.nextInt();
        System.out.println("Name:" + token1+ "bonbon:" +token4);
        c.close();
    }
}