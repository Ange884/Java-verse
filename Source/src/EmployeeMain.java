import java.io.*;

public class EmployeeMain {
    public static void main(String[] args){
        File file = new File("C:\\Users\\HP\\Documents\\texts\\one.txt");
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))){
            dos.writeInt(5);
            dos.writeUTF("hello");
            dos.writeBoolean(true);
        }catch(IOException e){
            System.out.println("Error occurred: "+e.getMessage());
        }
        try(DataInputStream reader = new DataInputStream(new FileInputStream(file))){
            System.out.println(reader.readInt());
            System.out.println(reader.readUTF());
            System.out.println(reader.readBoolean());
        }catch(IOException e){
            System.out.println("Error occurred: "+e.getMessage());
        }
    }
}       
