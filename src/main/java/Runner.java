import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list

        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list

        String newsStudent1 = "Tiree";
        scottishIslands.add(0, newsStudent1);

//        3. Add "Islay" after "Jura" and before "Mull"

        String newStudent2 = "Islay";
        scottishIslands.add(2, newStudent2);

//        4. Print out the index position of "Skye"\
        //added a .indexof to locate the index of element “Skye”

        System.out.println("The index position of Skye is: " + scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name

        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index

        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist

        System.out.println("The size of the arraylist is: " + scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop

        System.out.println(scottishIslands);

        for (String Islands : scottishIslands) {
            System.out.println(Islands);
        }

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers (2,4,6)
        int[] arrayNumbers = {1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7};
        List<Integer> even = new ArrayList<>();
//        Used Enhanced for loop method
        for (int arrayNumber : arrayNumbers)
            if (arrayNumber % 2 == 0) {
                even.add(arrayNumber);

            }
        System.out.println("List of even numbers: " + even);


//        2. Print the difference between the largest and smallest value (smallest = 1, largest = 99)
//        int[] arrayNumbers1 = {1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7};

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        boolean NumIsNext = true;
        boolean NumNotNext = false;
        System.out.println(NumIsNext);
        System.out.println(NumNotNext);

//    To be continued...

//
//        4. Print the sum of the numbers,
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 9.


//


    }
}