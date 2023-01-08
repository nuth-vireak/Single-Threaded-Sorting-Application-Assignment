import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SingleThread {

    // ----------------------------------------------------------------------------------
    // Fields
    //-----------------------------------------------------------------------------------
     static Scanner input = new Scanner(System.in);


    // ----------------------------------------------------------------------------------
    // Methods
    //-----------------------------------------------------------------------------------

    /**
     * This method is used to run the single thread program.
     */
    public void singleThreadProgram() {

        System.out.println("----------------------------------");
        System.out.println("-> Single Thread Sorting");
        System.out.println("----------------------------------");

        // User input
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        // Create a random array
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add((int) (Math.random() * 100));
        }

        System.out.println(); // Empty line

        // Print the array before sorting
        System.out.println("Generated Array----------------------------------------------------------------------------------");
        System.out.println(array);
        System.out.println("-------------------------------------------------------------------------------------------------");

        // Start the timer
        Date startTime = new Date();

        // Sort the array using the bubble sort algorithm
        BubbleSort.bubbleSort(array);

        System.out.println(); // Empty line

        // Print the array after sorting
        System.out.println("Array After Sorting------------------------------------------------------------------------------");
        System.out.println(array);
        System.out.println("-------------------------------------------------------------------------------------------------");

        // Stop the timer
        Date stopTime = new Date();

        System.out.println(); // Empty line

        // Calculate the time difference
        long timeTaken = stopTime.getTime() - startTime.getTime();

        System.out.println();
        System.out.println("EXECUTION TIME--------------");
        System.out.println(timeTaken + " ms");
        System.out.printf("%02d min, %02d sec, %03d ms%n",
                TimeUnit.MILLISECONDS.toMinutes(timeTaken),
                TimeUnit.MILLISECONDS.toSeconds(timeTaken) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(timeTaken)),
                timeTaken % 1000);

        System.out.println("----------------------------");
    }
} // End of SingleThread class
