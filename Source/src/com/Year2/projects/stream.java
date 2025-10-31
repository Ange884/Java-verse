package com.Year2.projects;
import java.io.*;

public class stream {
    public static void main(String[] args) {
        String data = "Hello RCA students!";

        try (FileWriter out = new FileWriter("C:\\Users\\HP\\Documents\\texts\\one.txt",true)) {
            out.write(data);
            System.out.println("Data written to one.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader in = new FileReader("C:\\Users\\HP\\Documents\\texts\\one.txt")) {
            int content;
            System.out.print("File content: ");
            while ((content = in.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
