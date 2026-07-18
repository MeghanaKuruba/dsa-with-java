package Arrays.logic;

public class BinarySearch {
    public static int bs(int[] nums, int low, int high, int target){
        int mid = low + (high - low) / 2;

        if(low > high){
            return -1;
        }

        if (target == nums[mid]){
            return mid;
        } else if (target > nums[mid]) {
            return bs(nums, mid + 1, high, target);
        } else {
            return bs(nums, low, mid - 1, target);
        }
    }
    public static int search(int[] nums, int target){
        int n = nums.length;

        // recursive method

        return bs(nums, 0, nums.length, target);

//        int low = 0;
//        int high = n-1;
//
//        while (low <= high){
//            int mid = low + (high - low) / 2;
//
//            if (target == nums[mid]){
//                return mid;
//            } else if (target > nums[mid]) {
//                low = mid +1;
//            } else {
//                high = mid -1;
//            }
//        }
//        return -1;
    }
}
