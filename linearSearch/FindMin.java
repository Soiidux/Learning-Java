public class FindMin {
    static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(findMinimum(arr));
    }
    static int findMinimum(int[] arr){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        int min = arr[0];
        for(int i =1; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}