package Arrays.logic;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumEqualsK {
    public static int longest(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();

        int prefixsum = 0;
        int maxLen = 0;

        // arr = {5,2,2,5,1,1,1,1,-9} and k = 4

        for (int i=0; i < arr.length; i++){
            prefixsum += arr[i];

            // map table

            // key is prefix sum value and map's value is arr index
            // initially prefix sum = 0 and the pointer is outside of arr so index = -1

            // key                value
            //  0                  -1
            //  5                   0    ->  5-0 = 5 != k so maxLen = 0
            // (5+2)=7              1    ->  7-4 = 3 != k so maxLen = 0
            // (7+2)=9              2    ->  9-4 = 5 prefixSum = 5 already exists in map, so now we will take
            //                               value = 2 of key = 9 and value = 0 of key = 5 as perfixsum = 5, and we do
            //                               2-0 = 2, we will compare with previous maxLen(i.e 0) with new maxLen,
            //                               and assign max of both(which is 2>0), so maxLen = 2
            //  14                  3
            //  15                  4
            //  16                  5
            //  17                  6
            //  18                  7    ->  18-4 = 14 prefixSum = 14 already exists in map, so now we will take
            //                               value = 7 of key = 18 and value = 3 of key = 14 as perfixsum = 14, and we do
            //                               7-3 = 4, we will compare with previous maxLen(i.e 2) with new maxLen,
            //                               and assign max of both(which is 4>2), so maxLen = 4
            //  9                   8    ->  9-4 = 5 prefixSum = 5 already exists in map, so now we will take
            //                               value = 8 of key = 9 and value = 0 of key = 5 as perfixsum = 5, and we do
            //                               8-0 = 8, we will compare with previous maxLen(i.e 4) with new maxLen,
            //                               and assign max of both(which is 8>4), so maxLen = 8 (2+2+5+1+1+1+1+(-9)) = 4
            //                               **** As 9 is already a key the previous value of key = 9 will get replaced by new value i.e 8 *******

            // final table will be:

            // key                value
            //  0                  -1
            //  5                   0
            // (5+2)=7              1
            // (7+2)=9              8 (before it was 2) if key is same, value will be updated
            //  14                  3
            //  15                  4
            //  16                  5
            //  17                  6
            //  18                  7


            if(map.containsKey(prefixsum - k)){
                maxLen = Math.max(maxLen, i - map.get(prefixsum - k));
            }

            if(!map.containsKey(prefixsum)){
                map.put(prefixsum, i);
            }
        }
        return maxLen;
    }
}
