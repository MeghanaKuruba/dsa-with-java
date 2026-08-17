package Arrays.logic;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementsBySign {
    public static int[] reaarange(int[] arr){
        // Variety 1: Equal Positives and Negatives

//        int n = arr.length;
//
//        int pos = 0;
//        int neg = 1;
//
//        int[] ans = new int[n];
//
//        for(int i = 0; i < n; i++){
//            if(arr[i] < 0){
//                ans[neg] = arr[i];
//                neg += 2;
//            }
//            else {
//                ans[pos] = arr[i];
//                pos += 2;
//            }
//        }
//        return ans;

        // Variety 2: Unequal Positives and Negatives

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            }else {
                neg.add(arr[i]);
            }
        }

        int[] ans = new int[arr.length];
        int p = 0, n = 0, ind = 0;

        while(p < pos.size() && n < neg.size()){
            ans[ind++] = pos.get(p++);
            ans[ind++] = neg.get(n++);
        }

        for(int i = p; i<pos.size(); i++){
            ans[ind++] = pos.get(i);
        }

        for(int i = n; i<neg.size(); i++){
            ans[ind++] = neg.get(i);
        }

        return ans;
    }
}
