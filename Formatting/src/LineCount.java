import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\HP\\Documents\\texts\\one.txt"; // replace with your file path
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                System.out.println(line.toUpperCase());
            }
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
