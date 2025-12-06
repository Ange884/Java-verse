import java.util.regex.*;
public class Reg1 {
    public static void main(String[] args){
        Pattern p = Pattern.compile("(abc)*");
        Matcher m = p.matcher("abcabc");

        System.out.println(m.matches());
    }
}
