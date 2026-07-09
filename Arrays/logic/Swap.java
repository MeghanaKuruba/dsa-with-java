package Arrays.logic;

public class Swap {
    public static void swap(int a, int b){
        System.out.println("a: "+a+" and b: " +b);
        // using temp

//        int temp = a;
//        a = b;
//        b = temp;

        //without temp

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: "+a+" and b: " +b);
    }
}
