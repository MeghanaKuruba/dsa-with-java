package Arrays.logic;

public class RemoveDuplicatesFromSortedArray {
    public static int remove(int[] arr){
        // Why do we start with k = 1 in Remove Duplicates?
        // We already know the first element is unique.
        // So we keep:
        // arr = {1,1,2,3,3}
        //arr[0] = 1
        //and start filling new unique elements from the next position:
        int k = 1;
        for (int i = 0; i<arr.length - 1; i++){
            if (arr[i] != arr[i+1]){
                arr[k] = arr[i+1];
                k++;
            }
        }
        return k;
    }
}
