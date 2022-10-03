import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sA = sc.nextLine();
        String sB = sc.nextLine();

        System.out.println(sA.length() + sB.length());
        if(sA.compareTo(sB) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");

        String[] stringA = sA.split("");
        stringA[0] = stringA[0].toUpperCase();
        sA = String.join("",stringA);



        String[] stringB = sB.split("");
        stringB[0] = stringB[0].toUpperCase();
        sB = String.join("", stringB);

        System.out.println(sA+ " " + sB);

    }
}
