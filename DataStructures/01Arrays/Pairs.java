public class Pairs {

    public static void printPairs(int numbers[]) {
        int tP = 0;

        for(int i = 0; i<numbers.length; i++) {
            int curr = numbers[i];

            for(int j = i+1; j<numbers.length; j++) {
                System.out.print("("+curr+","+numbers[j]+")");
                tP++;
            }
            System.out.println();
        }
        System.out.println("total pairs: "+tP);
    }

    public static void main(String args[]) {

        int numbers[] = {2,4,6,8,10,12};
        printPairs(numbers);
        
    }
    
}
