package Arrays.logic;

public class MinMax {
    public static void minMax(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
