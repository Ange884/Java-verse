import java.io.*;
import java.util.*;
public class PrimitiveStream {
    public static void main(String[] args){
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Documents\\texts\\two.txt");
            BufferedOutputStream Bos = new BufferedOutputStream(fos);
            String one = "I wanna write this codes there!";
            Bos.write(one.getBytes());
            Bos.close();

          //Read the file

            FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Documents\\texts\\two.txt");
            BufferedInputStream Bis = new BufferedInputStream(fis);
           int b;
            while ((b = Bis.read()) != -1) {
                System.out.print((char)b);

           }
         }


            catch (IOException e){
            e.printStackTrace();
            }
        }
    }
