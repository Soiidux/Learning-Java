import java.util.Scanner;

public class Sum{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer 1");
        int num1 = input.nextInt();
        System.out.println("Enter integer 2");
        int num2 = input.nextInt();

        int sum=num1+num2;
        System.out.println("Sum= " + sum);
    }
}