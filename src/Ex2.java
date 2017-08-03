import java.util.Scanner;

/**
 * Created by innuendo on 8/2/17.
 */
public class Ex2 {
    static int simpleArraySum(int n, int[] ar1) {
        // Complete this function
        int sum = 0;
        for (int val:ar1
             ) {
            sum+=val;
        }

        return sum;
    }

    public static void main(String[] ar1gs) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int n = 5;
        int[] ar1 = new int[n];
        for(int ar1_i = 0; ar1_i < n; ar1_i++){
            ar1[ar1_i] = in.nextInt();
//            ar1[ar1_i] = (ar1_i+1) *100 -1;
        }
        int result = simpleArraySum(n, ar1);
        System.out.println(result);
    }
}
