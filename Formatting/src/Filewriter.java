import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
    public static void main(String[] args) {
        String SourceFile = "C:\\Users\\HP\\Documents\\texts\\two.txt";  // replace with your source file path
        String TargetFile = "C:\\Users\\HP\\Documents\\texts\\one.txt";  // replace with your target file path

        try (
                BufferedReader br = new BufferedReader(new FileReader(SourceFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(TargetFile))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);        // write the line
                bw.newLine();          // write a newline
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
