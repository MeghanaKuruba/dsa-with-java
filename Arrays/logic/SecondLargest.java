package Arrays.logic;

public class SecondLargest {
    public static int secondLargest(int[] arr){
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
