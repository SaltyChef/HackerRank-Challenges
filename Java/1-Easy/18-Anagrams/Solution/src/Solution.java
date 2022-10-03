import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    public static boolean isAnagram(String a, String b){
        //to lover case to pass case problem
        String s1 = a.toLowerCase();
        String s2 =  b.toLowerCase();
        //passing lenght of strings
        if(s1.length()!=s2.length()){
            return false;
        }
        //getting letters one by one
        char[] a1 = s1.toCharArray();
        char[]b1 = s2.toCharArray();
        //sorting them by alphabetic order
        Arrays.sort(a1);
        Arrays.sort(b1);
        //and comparing
        return Arrays.equals(a1,b1);

    }
    }

