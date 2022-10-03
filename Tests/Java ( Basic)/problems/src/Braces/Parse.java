package Braces;
import java.util.*;

class Parser{
    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<Character>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c == '{' || c == '[' || c == '(') {
                st.push(c);
            } else {
                if (c == ']' && !st.isEmpty() && st.pop() == '[') {
                    continue;
                } else if (c == '}' && !st.isEmpty() && st.pop() == '{') {
                    continue;
                } else if (c == ')' && !st.isEmpty() && st.pop() == '(') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (!st.isEmpty()) {
            return false;
        }

        return true;
    }

}
class Solution {
    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(Parser.isBalanced(in.next()));
        }

        in.close();
    }
}
}