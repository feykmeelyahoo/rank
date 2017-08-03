import java.util.Scanner;

/**
 * Created by innuendo on 8/2/17.
 */
public class Staircase {

    public static void main(String[] ar1gs) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
    }
}