import java.io.*;
import java.util.*;

public class AE_ViralAdvertising {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int peopleCount = 5;
        int nDays = in.nextInt();
        int sumOfPeople = 0;

        int[] likedPeopleEachDay = new int[nDays];


        for (int i = 0; i < nDays; i++) {
            likedPeopleEachDay[i] = peopleCount / 2;
            peopleCount = likedPeopleEachDay[i] * 3;
        }

        for (int i : likedPeopleEachDay) {
            sumOfPeople += i;
        }
        System.out.println(sumOfPeople);

    }
}