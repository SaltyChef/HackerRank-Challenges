import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] tokens = line.split("[ \"!,?._'@\". ]");

        for(String s: tokens){
            System.out.println(s);
        }

    }
}
