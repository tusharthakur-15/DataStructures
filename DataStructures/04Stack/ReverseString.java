import java.util.Stack;

public class ReverseString {

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder("");

        while(!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        // String str = "abc";
        // System.out.println(reverseString(str));

        String s = "the sky is blue";

        for(int i=s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
