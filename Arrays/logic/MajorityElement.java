package Arrays.logic;

public class MajorityElement {

    // Moore's Voting Algorithm
    public static int majority(int[] arr) {

        // cnt keeps track of the current candidate's vote count
        int cnt = 0;

        // el stores the current candidate for majority element
        int el = 0;

        int n = arr.length;

        // Step 1: Find the potential majority candidate
        for (int i = 0; i < n; i++) {

            // If count becomes 0, choose the current element
            // as the new candidate
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            }

            // If current element matches the candidate,
            // increase the vote count
            else if (arr[i] == el) {
                cnt++;
            }

            // If current element is different,
            // cancel out one vote
            else {
                cnt--;
            }
        }

        /*
         * Why does this work?
         *
         * A majority element appears more than n/2 times.
         * Every occurrence of a non-majority element can cancel
         * out one occurrence of the majority element.
         *
         * Since the majority element occurs more than all other
         * elements combined, it will remain as the final candidate.
         */

        // Step 2: Verify that the candidate is actually
        // the majority element
        int cnt1 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == el) {
                cnt1++;
            }
        }

        // If candidate appears more than n/2 times,
        // it is the majority element
        if (cnt1 > n / 2) {
            return el;
        }

        // No majority element found
        return -1;
    }
}