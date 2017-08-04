import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AIE_1_SherlockAndSquares {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] ar1 = new int[n][2];

        for (int ar1_i = 0; ar1_i < n; ar1_i++) {
            ar1[ar1_i][0] = in.nextInt();
            ar1[ar1_i][1] = in.nextInt();
            int count = 0;

            for (int i = 1; ; i++) {
                int i2 = i * i;
                if (i2 > ar1[ar1_i][1]){
                    break;
                }
                else if (i2 >= ar1[ar1_i][0] && i2 <= ar1[ar1_i][1])
                    count++;
            }

            System.out.println(count);
        }
    }
}
