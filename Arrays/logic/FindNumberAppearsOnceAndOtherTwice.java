package Arrays.logic;

public class FindNumberAppearsOnceAndOtherTwice {
    public static int find(int[] nums){
        int xor = 0;
        for (int i=0; i<nums.length; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
