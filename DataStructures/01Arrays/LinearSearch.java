public class LinearSearch {

    public static int LS(int numbers[],int key) {
        for(int i=0; i<numbers.length; i++) {
            if(key==numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12};
        int key = 6;

        int index = LS(numbers, key);

        if(index==-1) {
            System.out.println("element not found");
        }
        else {
            System.out.println("element found at index:"+" "+index);
        }
    }
}