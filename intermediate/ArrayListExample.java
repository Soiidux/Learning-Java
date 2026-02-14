import java.util.ArrayList;

public class ArrayListExample {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(67);
        list.add(66);
        list.set(0,88);
        System.out.println(list.get(0));
    }
}