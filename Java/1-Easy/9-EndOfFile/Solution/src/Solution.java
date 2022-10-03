import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        while(sc.hasNext()){
            String line = sc.nextLine();
            lines.add(line);
        }

        int count = 1;
        for(String line : lines){
            System.out.println(count + " " + line);
            count++;
        }
    }
}
