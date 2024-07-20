// lexicographic order

public class LargestString {
    
    public static void main(String args[]) {

        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];

        for(int i = 0; i<fruits.length; i++) {

            if(largest.compareTo(fruits[i]) < 0) {  // str1.compareTo(str2) --> 0(equal) ; -ve(str1<str2) ; +ve(str1>str2)

                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
