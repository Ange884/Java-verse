import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Names {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Nziza", "Muheto", "Hozo", "Cyusa"
        ));
        System.out.println("names " + names);
        for (String name : names){
            System.out.println(name);
        }
        }
    }

