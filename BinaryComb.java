import java.util.ArrayList;
import java.util.List;

public class BinaryComb {

    // list of booleans to represent each bit
    private static List<Boolean> bytes = new ArrayList<>();

    public static void main(String[] args) {
        // initialize the list to all false
        for(int i = 0; i < 16; i++) {
            bytes.add(false);
        }

        // calculate the number of permutations
        int numPermutations = (int)Math.pow(2, 16);

        // print the first permutation
        print();

        // loop through all permutations
        for(int i = 0; i < numPermutations; i++) {
            // increment the 2 bytes
            increment();

  // print the current permutation
            print();
        }
    }

    /**
     * Prints out the current permutation
     */
    private static void print() {
        // loop through the bytes
        for(Boolean bool : bytes) {
            // print 1 or 0
            if(bool)
                System.out.print(1);
            else
                System.out.print(0);

        }

        // end the line
        System.out.println();
    }

    /**

 * Increment the bytes
     */
    private static void increment() {
        // set increment position to the end of the list
        int position = bytes.size() - 1;

        // loop through changing next digit if necessary, stopping
        // if the front of the list is reached.
        do {
            bytes.set(position, !bytes.get(position));
        } while(!bytes.get(position--) && position >= 0);
    }
}

