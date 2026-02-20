public class EvenDigits {
    static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(countEvenDigitNumbers(nums));
        int[] nums1 = {18,124,9,1764,98,1};
        System.out.println(countEvenDigitNumbers(nums1));
    }
    static int countEvenDigitNumbers(int[] arr){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(isEvenDigitNumber(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean isEvenDigitNumber(int num){
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        if(count%2 == 0){
            return true;
        }
        return false;
    }
}