import java.util.*;

public class CheckExistence {
    public static void main(String[] args) {

        Set<Integer> studentIDs = new HashSet<>(Arrays.asList(
                101, 102, 103, 104, 105
        ));

        int idToCheck = 103;

        if (studentIDs.contains(idToCheck)) {
            System.out.println("id " + idToCheck + " Exists");
        }else {
            System.out.println("id " + idToCheck + "does not exist");
        }
    }
}
