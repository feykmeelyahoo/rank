import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class AM_1_ExtraLongFactorials {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigDecimal result = factorial(n);

        System.out.println(result);

    }

    public static BigDecimal factorial(int n) {
        if (n > 1)
            return new BigDecimal(n).multiply(factorial(n - 1));
        else return new BigDecimal(1);
    }
}
