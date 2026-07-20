package Arrays.logic;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet set = new HashSet();
//        HashSet result = new HashSet();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        for (int i = 0; i<nums2.length; i++){
            if (set.contains(nums2[i])){
//                result.add(nums2[i]);
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

//        ArrayList<Integer> list = new ArrayList<>(result);

        int[] ans = new int[list.size()];

        for (int i = 0; i<list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}
