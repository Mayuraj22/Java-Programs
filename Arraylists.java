import java.util.ArrayList; //for adding list of array

public class Arraylists {

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

        System.out.println(list);

        // Get operation
        int element = list.get(2);
        System.out.println(element);

        // to remove an element fronm the array
        list.remove(2);
        System.out.println(list);

        // set element at index
        list.set(2, 10);
        System.out.println(list);

        // contains [to check elements in array list]
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}
