import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        Factor numbers = new Factor();
        BigInteger r = numbers.fac(1000);
        System.out.println(r);
    }
}
