import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String reverse = new StringBuilder(s).reverse().toString();
        if(s.equals(reverse))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
