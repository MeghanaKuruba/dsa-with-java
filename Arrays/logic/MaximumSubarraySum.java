package Arrays.logic;

public class MaximumSubarraySum {
    // Kadane's Algorithm

    public static int max(int[] arr){
        int sum = arr[0];
        int maxSum = arr[0];

        for(int i=1;i<arr.length; i++){
            if(sum >= 0){
                sum += arr[i];
            }else{
                sum = arr[i];
            }

            if(maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
