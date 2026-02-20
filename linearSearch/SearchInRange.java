public class SearchInRange {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        System.out.println(target+" found at index: "+rangeSearch(arr,target,2,4));
    }
    static int rangeSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i<= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}