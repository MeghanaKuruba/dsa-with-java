package Arrays.logic;

public class MissingElementInArray {
    public static int missing(int[] arr){
        int n = arr.length + 1;

        int sum = n*(n+1)/2;

        int sum2=0;

        for (int i = 0; i<n-1; i++){
            sum2 += arr[i];
        }

        int ans = sum - sum2;

        return ans;
    }
}
