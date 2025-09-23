import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        //creating an array list
        List<Integer> list1 = new ArrayList<>();
        System.out.println(list1); //an [] empty list will be printed

        //Initializing a list with values from collection
        List<Integer> marks = new ArrayList<>(List.of(10,20,30));
        System.out.println(marks);

        //Creating a List with String data types to store the names of students
        List<String> names = new ArrayList<>();
        names.add("Ava"); // names = ["Ava"]. Ava will be added to the list names
        names.add(0, "Zoe"); // names = ["Zoe", "Ava"] . Zoe will be added to 0 index and Ava will shift next
        names.addAll(List.of("Max","John")); //names = ["Zoe","Ava","Max","John"] . Max and John will be added to list
        names.addAll(2, List.of("Ben")); //names = ["Zoe","Ava","Ben","Max","John"] . Ben will be added at 2 index
        
        String first = names.get(0); //first = Zoe , access any element using index
        int n = names.size(); // Calculates the length of the list names. ArrayList does not have length property
        System.out.println(first + n);

        boolean empty = names.isEmpty(); //tells if the ArrayList is empty or not
        System.out.println(empty);

        boolean hasMax = names.contains("Max"); //Tells if the list names contains Max or Not
        int firstBen = names.indexOf("Ben"); //Returns the first index of the data "Ben"
        int lastBen = names.lastIndexOf("Ben"); //Returns the last index of the data "Ben"
    }
}
