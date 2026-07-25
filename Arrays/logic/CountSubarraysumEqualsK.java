package Arrays.logic;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysumEqualsK {

    public static int count(int[] arr, int k) {

        int cnt = 0;
        int prefixsum = 0;

        // Stores:
        // Prefix Sum -> Frequency
        //
        // Example:
        // {0=1, 3=2, 6=1}
        //
        // Means:
        // Prefix sum 0 appeared once
        // Prefix sum 3 appeared twice
        // Prefix sum 6 appeared once
        Map<Integer, Integer> map = new HashMap<>();


        // Before array starts, prefix sum is 0.
        //
        // We assume it has already occurred once.
        //
        // This helps us count subarrays
        // starting from index 0.
        //
        // Example:
        // arr = {1,2}
        // k = 3
        //
        // prefixsum becomes 3
        //
        // We search:
        // 3 - 3 = 0
        //
        // Since 0 exists in map,
        // [1,2] gets counted.
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {

            // Add current element to running sum
            prefixsum += arr[i];

            /*
             * MAIN INTUITION
             * -------------------------
             *
             * Subarray Sum =
             * Current Prefix Sum -
             * Previous Prefix Sum
             *
             * We want:
             *
             * Subarray Sum = k
             *
             * Therefore:
             *
             * Current Prefix -
             * Previous Prefix = k
             *
             * Previous Prefix =
             * Current Prefix - k
             *
             * So for every prefix sum,
             * we ask:
             *
             * "Have I seen
             * (prefixsum - k) before?"
             */

            if (map.containsKey(prefixsum - k)) {

                /*
                 * Example using:
                 *
                 * arr =
                 * {1,2,3,-3,1,1,1,4,2,-3}
                 *
                 * k = 3
                 *
                 * --------------------------------
                 * i = 1
                 *
                 * prefixsum = 3
                 *
                 * Need:
                 * 3 - 3 = 0
                 *
                 * 0 exists.
                 *
                 * So:
                 * 3 - 0 = 3
                 *
                 * Subarray:
                 * [1,2]
                 *
                 * cnt = 1
                 * --------------------------------
                 *
                 * i = 2
                 *
                 * prefixsum = 6
                 *
                 * Need:
                 * 6 - 3 = 3
                 *
                 * 3 exists.
                 *
                 * So:
                 * 6 - 3 = 3
                 *
                 * Subarray:
                 * [3]
                 *
                 * cnt = 2
                 * --------------------------------
                 *
                 * i = 3
                 *
                 * prefixsum = 3
                 *
                 * Need:
                 * 3 - 3 = 0
                 *
                 * 0 exists.
                 *
                 * So:
                 * 3 - 0 = 3
                 *
                 * Subarray:
                 * [1,2,3,-3]
                 *
                 * cnt = 3
                 * --------------------------------
                 *
                 * i = 6
                 *
                 * prefixsum = 6
                 *
                 * Need:
                 * 6 - 3 = 3
                 *
                 * Prefix sum 3
                 * already occurred twice.
                 *
                 * map.get(3) = 2
                 *
                 * Therefore two subarrays
                 * end at current index.
                 *
                 * cnt += 2
                 */
                cnt += map.get(prefixsum - k);
            }

            /*
             * Store current prefix sum frequency.
             *
             * Example:
             *
             * Prefix sums:
             *
             * 1
             * 3
             * 6
             * 3
             *
             * Then map becomes:
             *
             * {
             *   0=1,
             *   1=1,
             *   3=2,
             *   6=1
             * }
             *
             * Notice:
             * Prefix sum 3 occurred twice.
             *
             * Later when we need a prefix
             * sum of 3, we can form TWO
             * different subarrays.
             */
            if (map.containsKey(prefixsum)) {
                map.put(prefixsum, map.get(prefixsum) + 1);
            } else {
                map.put(prefixsum, 1);
            }
        }

        return cnt;
    }
}