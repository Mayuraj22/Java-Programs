import java.util.ArrayList;

public class sizearray {
    public static void main(String[] args) {
        // To define arraylist, the syntax is:
        // ClassName objectName= new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list.add(1);// O(1) time complexity
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.size());

        // To print the array list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}