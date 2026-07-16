package Arrays.logic;

public class ProductOfArrayExceptSelf {
    public static int[] product(int[] arr){
        // Brute force approach
        int n = arr.length;
        int[] ans = new int[n];

        for (int i=0; i<n; i++){
            int product = 1;
            for (int j=0; j<n; j++){
                if(i!=j){
                    product *= arr[j];
                }
            }
            ans[i] = product;
        }
        return ans;
    }
}
