import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();
        System.out.print("Enter third integer: ");
        int c = input.nextInt();

//        int max = a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max=c;
//        }
        int max = Math.max(c,Math.max(a,b));

        System.out.println("Maximum is " + max);
    }
}