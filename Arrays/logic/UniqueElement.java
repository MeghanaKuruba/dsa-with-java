package Arrays.logic;

public class UniqueElement {
    // arr = {1,5,3,7,5,1,3} unique = 7

    public static int unique(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] != -1){
                ans = arr[i];
            }
        }
        return ans;
    }
}
