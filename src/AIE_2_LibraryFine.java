import java.util.Scanner;

public class AIE_2_LibraryFine {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int actualDay = in.nextInt();
        int actualMonth = in.nextInt();
        int actualYear = in.nextInt();

        int expectedDay = in.nextInt();
        int expectedMonth = in.nextInt();
        int expectedYear = in.nextInt();

        int fine = 0;

        if (actualYear > expectedYear)
            fine = 10000;
        else if (actualYear == expectedYear && actualMonth > expectedMonth)
            fine = 500 * (actualMonth - expectedMonth);
        else if (actualYear == expectedYear && actualMonth == expectedMonth && actualDay > expectedDay)
            fine = 15 * (actualDay - expectedDay);

        System.out.println(fine);
    }
}
