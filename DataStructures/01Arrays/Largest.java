public class Largest {

    public static int getLargest(int numbers[]) {
        int large = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {            
            if(large<numbers[i]) {

                large = numbers[i];
            }
        }
        return large ; 
    }

    public static void main(String args[]) {

        int numbers[] = {2,4,6,24,10,12};
        System.out.println("largest number in array is : "+getLargest(numbers));

    }
}
