package Arrays.logic;

public class FindNumberswithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        // int cnt =0;
        // for (int i = 0; i<nums.length; i++){
        //     if(String.valueOf(nums[i]).length() % 2 == 0){
        //         cnt++;
        //     }
        // }

        int cnt = 0;

        for(int i = 0; i<nums.length; i++){
            if((nums[i] >= 10 && nums[i] <= 99) ||
                    (nums[i] >= 1000 && nums[i] <=9999) ||
                    (nums[i] == 100000)){
                cnt++;
            }
        }
        return cnt;
    }
}
