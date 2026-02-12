import java.util.Scanner;
public class Input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer input: ");
        int rno = input.nextInt();
        System.out.println("Your roll number is: " + rno);

        input.nextLine(); //Nextline to clear \n buffer

        System.out.print("Enter a string: ");
        String name = input.nextLine();
        System.out.println("Your name is: "+name);

        System.out.print("Enter a floating point");
        float marks = input.nextFloat();
        System.out.println("Your marks are : "+marks);


    }
}