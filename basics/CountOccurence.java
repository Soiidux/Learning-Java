import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int numberToCheck = in.nextInt();
        System.out.print("Enter digit to count: ");
        int digitToCount = in.nextInt();

        int count = 0;
        while(numberToCheck!=0){
            int lastDigit = numberToCheck%10;
            if(lastDigit == digitToCount){
                count++;
            }
            numberToCheck = numberToCheck/10;
        }
        System.out.println("Count of "+digitToCount+" in the given number is :"+count);
    }
}