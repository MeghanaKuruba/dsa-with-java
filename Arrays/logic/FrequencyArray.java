package Arrays.logic;

public class FrequencyArray {
    public static void frequency(int[] arr){
        int max = arr[0];
        int n = arr.length;

        // Step 1: Find the maximum element.
        // We need this because the frequency array size
        // depends on the largest element present in the array.
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // For this example:
        // max = 3
        // Step 2: Create frequency array.
        // Size = max + 1 because array indexing starts from 0.
        int[] freq = new int[max + 1];

        /*
        Initially:
        Index : 0 1 2 3
        freq : 0 0 0 0
        */
        // Step 3: Count frequency of each element.
        for (int i=0; i<n; i++){
            freq[arr[i]]++;
        }

        /*
             Dry Run:

             i = 0
             arr[0] = 1
             freq[1]++

             freq = [0,1,0,0]

             i = 1
             arr[1] = 2
             freq[2]++

             freq = [0,1,1,0]

             i = 2
             arr[2] = 3
             freq[3]++

             freq = [0,1,1,1]

             i = 3
             arr[3] = 2
             freq[2]++

             freq = [0,1,2,1]

             i = 4
             arr[4] = 1
             freq[1]++

             freq = [0,2,2,1]

             i = 5
             arr[5] = 1
             freq[1]++

             freq = [0,3,2,1]
            */

        // Print frequencies
        for (int i=0; i < freq.length; i++){
            if (freq[i] > 0){
                System.out.println(i +"->"+ freq[i]);
            }
        }
    }
}
