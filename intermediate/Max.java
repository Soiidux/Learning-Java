public class Max {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int maximumItem = max(arr);
        System.out.println("Maximum item in the array is "+maximumItem);
    }

    static int max(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}