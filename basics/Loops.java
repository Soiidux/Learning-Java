import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        //Q.Print numbers from 1 to n

        System.out.println("Using for loop: ");
        for(int i=1;i<num+1;i++) {   //Syntax similar to c++
            System.out.println(i);
        }

        System.out.println("Using while loop");
        int i =1;
        while(i<=num){
            System.out.println(i);
            i++;
        }

        System.out.println("Using do while loop");
        int j =1;
        do{
            System.out.println(j);
            j++;
        }while(j<=num);
    }
}