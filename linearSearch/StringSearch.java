import java.util.Scanner;
public class StringSearch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = in.nextLine();
        System.out.println("Enter target char to search:");
        char target = in.next().charAt(0);
        System.out.println("Found at index: "+search(str,target));
    }
    static int search(String str,char target){
        if(str.length() == 0){
            return -1;
        }
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
}
