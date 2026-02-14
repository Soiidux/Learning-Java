import java.util.Scanner;
import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr1 = new int[5];
////        int[] arr1 = {1,2,3,4,5};
//        for(int i=0;i<arr1.length;i++){
//            arr1[i] = in.nextInt();
//        }
//        for(int num:arr1){
//            System.out.print(num+" ");
//        }
//        System.out.println(Arrays.toString(arr1));

        //Multidimensional arrays
        /*
            123
            456
            789
         */

//        int[][] arr2 = new int[3][3]; //arr[rows][cols]
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(arr2)); //prints address
        for(int i=0;i<arr2.length;i++){
            System.out.println(Arrays.toString(arr2[i])); //prints actual arrays
        }
    }
}