package Arrays.logic;

public class ProductOfArrayExceptSelf {
    public static int[] product(int[] arr){
        // Brute force approach

//        int n = arr.length;
//        int[] ans = new int[n];
//
//        for (int i=0; i<n; i++){
//            ans[i] = 1;
//            for (int j=0; j<n; j++){
//                if(i!=j){
//                    ans[i] *= arr[j];
//                }
//            }
//        }
//        return ans;

        // Optimal solution using prefix and suffix

        int n = arr.length;

        int[] left = new int[n];
        left[0] = 1;
        for(int i = 1; i < n; i++){
            left[i] = left[i-1]*arr[i-1];
        }

        int[] right = new int[n];
        right[n-1] = 1;
        for(int i = n-2; i>=0;i--){
            right[i] = right[i+1]*arr[i+1];
        }

        int[] ans = new int[n];
        for(int i = 0; i<arr.length; i++){
            ans[i] = left[i]*right[i];
        }
        return ans;
    }
}
