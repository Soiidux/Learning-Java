public class BinarySearch {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,7));
        System.out.println(binarySearch(arr,11));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
//            int middle = (start+end)/2;
//            This may return an error since start + end may exceed the int value
//            Therefore it is better to use : middle = start + (end-start)/2
            int middle = start + (end-start)/2;
            if(target < arr[middle]){
                end = middle-1;
            }
            else if(target > arr[middle]){
                start = middle+1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}