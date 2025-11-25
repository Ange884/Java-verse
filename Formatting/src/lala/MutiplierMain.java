package lala;

public class MutiplierMain {
    public static void main(String[] args) {

        Multiplier mult = (x,y) -> x*y;
        int k = mult.multiply(5,4);
        System.out.println(k);
    }
}
