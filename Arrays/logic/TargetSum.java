package Arrays.logic;

public class TargetSum {

    // if arr = {8,2,4,6,3,5}
    // x = 7
    // sum of the elements like 3+4 which is one pair should be equal to 7
    // so there 2 pairs (3,4) and (5,2) where sum = 7
    // so return 2
    public static int targetSum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
}
