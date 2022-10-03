import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTests = sc.nextInt();

        while(sc.hasNext()){
            try{
                long number = sc.nextLong();
                System.out.println(number + " can be fitted in:");

                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* integer");
                }
                if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                    System.out.println("* short");
                }
            }catch(Exception e){
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
