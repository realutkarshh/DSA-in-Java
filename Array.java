import java.util.Arrays;

class Array{
    public static void main(String[] args) {
           //Initializing an array in Java. Default values are given in the comments
           //Declare + Allocate the array with default values
           int[] array = new int[5]; //{0,0,0,0,0}
           String[] stringArray = new String[3]; //{null,null,null} 
           boolean[] boolArray = new boolean[2]; //{false, false}

           //print the values of array using for loop
           for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
           }

           //Print the array using the Arrays module
           System.out.println(Arrays.toString(array));
           System.out.println(Arrays.toString(boolArray));


           //Allocate the array with any given values
           int[] marks = {10,20,30,40,50};
           String[] names = {"Utkarsh", "Vibhor", "Vasu"};

           //Print the arrays
           System.out.println(Arrays.toString(names));
           System.out.println(Arrays.toString(marks));


           //Declare an array and fill the values
           int[] days = new int[7];
           for(int i = 0; i<days.length;i++){days[i] = i + 1;}
           System.out.println(Arrays.toString(days));
    }
}