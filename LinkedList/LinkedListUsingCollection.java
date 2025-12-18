package Java.LinkedList;
import java.util.LinkedList;

public class LinkedListUsingCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(2);
        list.addFirst(5);
        list.addLast(10);
        list.add(78); //By default add function will add the element in the last
        System.out.println(list);

        list.removeFirst(); //To remove the first element
        System.out.println(list);

        list.removeLast(); //To remove the last element
        System.out.println(list);
        
        int size = list.size();
        System.out.println(size);

        //Loop to print the elements
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
    }
}
