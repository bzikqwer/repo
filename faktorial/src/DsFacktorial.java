import java.math.BigInteger;
import java.util.Scanner;

public class DsFacktorial {
    static int calcFactorial (int n){
       BigInteger ar = BigInteger.ONE;

               for (int i = 1; i <= n; i++) {
                ar = ar.multiply(new BigInteger(Integer.toString(i)));
                    }
        return ar;
    }
    public static void main(String[] args) {
//        Scanner c = new Scanner(System.in);
//        int b = c.nextInt();
        System.out.println(calcFactorial(5));
    }