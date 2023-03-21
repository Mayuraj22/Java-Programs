import java.util.ArrayList;

public class Reverseprint {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list.add(1);// O(1) time complexity
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // Reverse print

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i) + " ");

        }
        System.out.println();

    }
}
