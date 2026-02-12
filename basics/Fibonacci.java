import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        if(n==0){
            System.out.println(firstNum);
        }
        else if (n==1) {
            System.out.println(secondNum);
        }
        else{
            for(int i = 2;i<n;i++){
                int temp = secondNum;
                secondNum=firstNum+secondNum;
                firstNum = secondNum;
            }
            System.out.println(firstNum+secondNum);
        }

    }
}