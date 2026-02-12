import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to reverse: ");
        int numberToReverse = in.nextInt();

        int count = 0;
        int reversed = 0;
        while (numberToReverse!=0){
            int lastDigit = numberToReverse%10;
            reversed = reversed*10;
            reversed = reversed + lastDigit;
            count++;
            numberToReverse =  numberToReverse/10;
        }

        System.out.println("Reversed number is: "+reversed);
    }
}