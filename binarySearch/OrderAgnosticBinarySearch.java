public class OrderAgnosticBinarySearch {
    static void main(String[] args) {
        int[] ascArr = {1,2,3,4,5,6,7,8,9,10};
        int[] descArr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(OrderAgnosticBS(ascArr,7));
        System.out.println(OrderAgnosticBS(descArr,7));
    }

    static int OrderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = (arr[start]<arr[end])? true:false;
        while(start<=end){
//            int middle = (start+end)/2;
//            This may return an error since start + end may exceed the int value
//            Therefore it is better to use : middle = start + (end-start)/2
            int middle = start + (end-start)/2;
            if(arr[middle] == target){
                return middle;
            }

            if(isAsc){
                if(target<arr[middle]){
                    end = middle - 1;
                }
                else {
                    start = middle + 1;
                }
            }
            else{
                if(target<arr[middle]){
                    start = middle+1;
                }
                else{
                    end = middle - 1;
                }
            }
        }
        return -1;
    }
}