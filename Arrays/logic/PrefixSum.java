package Arrays.logic;

public class PrefixSum {
    public static void prefixSum(int[] arr){
        for(int i = 1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        Traversal.traversal(arr);
    }
}
