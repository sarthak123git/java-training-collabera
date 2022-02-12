package corejava28;


    import java.util.*;
import java.util.stream.IntStream;

    public class GFG {

        // Driver code
        public static void main(String[] args)
        {
            // Using IntStream.sum() to find
            // sum of elements dividible by 3
            // in given range
            int sumOfElements = IntStream.range(2, 10)
                    .filter(num -> num % 3 == 0)
                    .sum();

            // Displaying the calculated sum
            System.out.println(sumOfElements);
        }
    }

