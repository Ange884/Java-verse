package lala;
import java.util.regex.*;

public class RegexManipulation {
     public  static void main(String[] args){
         System.out.println(Pattern.matches("[ann]", "a"));
         System.out.println(Pattern.matches("[.ca]", "rca"));

         Pattern p = Pattern.compile("\\d+");
         Matcher m = p.matcher("123ggh657");
         System.out.println(m.matches());
         while(m.find()){
             System.out.println(m.group());
         }
         Pattern p1 = Pattern.compile("^L\\W+\\d+$");
         Matcher m2 = p1.matcher("Larissa");
         System.out.println(m2.matches());
     }
}
