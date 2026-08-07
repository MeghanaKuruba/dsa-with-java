package Arrays;

import Arrays.logic.*;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class ArraysMain {
    public static void main(String args[]){

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        //Taking Input
//        System.out.println("Enter elements");
//        for (int i = 0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        //Print array
//        for (int i = 0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }

//        int[] arr = {8,1,5,8,6,7};


//        MinMax.minMax(arr);
//        Reverse.reverse(arr);
//        PrefixSum.prefixSum(arr);
//        int sum = TargetSum.targetSum(arr, 10);

//        int ans = UniqueElement.unique(arr);
//        System.out.println(ans);
//        System.out.println(SecondLargest.secondLargest(arr));
//        Swap.swap(2,3);
//        RotateArray.rotate(arr, 2);
//        FrequencyArray.frequency(arr);
//        int[] arr = {0,1,0,1,1,1,0,0};
//        SortZeorsAndOnes.sort(arr);
//        SortArray.sort(arr);

//        int[] arr = {1, 5, 6, 7, 8, 8};
//        int[] arr2 = {0,1,4,9};
//        MergeSortedArray.merge(arr, arr2, arr.length, arr2.length);

//        int[] arr = {2,0,2,1,1,1,0,1,2,0};
//        SortColors.sortcolors(arr);

//        int[] result = TwoSum.twoSum(arr, 8);
//
//        System.out.println(Arrays.toString(result));

//        int result = RemoveElement.remove(arr, 8);
//        // The remaining elements of arr are not important as well as the size of arr.
//        // It does not matter what you leave beyond the returned k
//        // if arr = {8,1,5,8,6,7} consider the result arr is like this: [1,5,6,7,_,_] so k = 4
//        System.out.println(Arrays.toString(arr));
//        System.out.println(result);

//        int[] arr = {1,1,3,3,6,6,6,6,7};
//
//        int result = RemoveDuplicatesFromSortedArray.remove(arr);
//
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println(result);

//        int[] arr = {1,0,2,0,3,4};

//        int[] result = ProductOfArrayExceptSelf.product(arr);
//        System.out.println(Arrays.toString(result));

//        int result = BinarySearch.search(arr, 3);
//        System.out.println(result);

//        MoveZerosToEnd.move(arr);
//        int result = LinearSearch.search(arr, 3);
//        System.out.println(result);

//        int[] arr1 = {1,3,3,7,8,};
//        int[] arr2 = {1,2,3,4,5,6};

//        ArrayList<Integer> result = UnionOfTwoSortedArray.union(arr1, arr2);
//        System.out.println(result);

//        int[] result = IntersectionOfTwoArrays.intersection(arr1, arr2);
//        System.out.println(Arrays.toString(result));

//        int[] arr = {1,2,3,4};

//        int result = MissingElementInArray.missing(arr);

//        int[] arr = {1,1,0,0,1,1,1,0,1,0,1};
//        int result = MaxConsecutiveOnes.max(arr);

//        int[] arr = {1,1,2,2,3,4,4,5,5};
//        int result = FindNumberAppearsOnceAndOtherTwice.find(arr);

//        int[] arr = {5,2,2,5,1,1,1,1,4};
//        int result = LongestSubarraySumEqualsK.longest(arr, 4);

//        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
//        int result = CountSubarraysumEqualsK.count(arr, 3);
//        System.out.println(result);

//        int[] arr = {5,5,1,1,5,5,1,7,5,3,5};
//        int result = MajorityElement.majority(arr);
//        System.out.println(result);

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = MaximumSubarraySum.max(arr);
        System.out.println(result);
    }
}
