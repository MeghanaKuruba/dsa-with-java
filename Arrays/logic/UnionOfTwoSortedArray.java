package Arrays.logic;

import java.util.ArrayList;

public class UnionOfTwoSortedArray {
    public static ArrayList<Integer> union(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            }else {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n1){
            if (ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]){
                ans.add(arr1[i]);
            }
            i++;
        }

        while (j < n2){
            if (ans.size() == 0 || ans.get(ans.size() - 1) != arr2[j]){
                ans.add(arr2[j]);
            }
            j++;
        }

        return ans;
    }
}
