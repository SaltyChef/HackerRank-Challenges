package UsernameChanges;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'possibleChanges' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY usernames as parameter.
     */

    public static List<String> possibleChanges(List<String> usernames) {
        System.out.println("size: " + usernames.size());
        List<String> result = new ArrayList<>(usernames.size());
        for(int i = 0; i < usernames.size(); i++){
            result.add("NO");
        }

        int index = 0;
        for(String name : usernames){

            boolean isBreak = false;

            String[] s = name.split("");
            for(int i = 0; i < s.length && !isBreak; i++){
                for(int j = 0; j < s.length && !isBreak; j++){
                   String[] newName = name.split("");
                   newName[i] = s[j];
                   newName[j] = s[i];


                    System.out.println("new: " + Arrays.toString(newName));
                    System.out.println("original: " + String.valueOf(name));
                   if(Arrays.toString(newName).compareTo(name) < 0){
                        result.set(index, "YES");
                       isBreak = true;
                   }
                }
            }

        isBreak = false;
        index++;
        }

    return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int usernamesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> usernames = IntStream.range(0, usernamesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = Result.possibleChanges(usernames);

//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
