import java.util.Arrays;
import java.util.TreeSet;

public class Easy_26 {

    public int removeDuplicates(int[] nums) {
        // TODO
        TreeSet<Integer> uniqueSet = new TreeSet<Integer>();
        for (int num : nums) {
            uniqueSet.add(num);
        }

        int numberOfUniqueElements = uniqueSet.size();

        for (int i = 0; i < numberOfUniqueElements; i++) {
            nums[i] = uniqueSet.getFirst();
            uniqueSet.remove(uniqueSet.getFirst());
        }
        
        return numberOfUniqueElements;
    }

    // ---------------- TEST RUNNER ----------------

    private static void runTest(int[] input, int expectedLength, int[] expectedArrayStart) {
        Easy_26 sol = new Easy_26();

        int[] copy = Arrays.copyOf(input, input.length); // orijinali bozmayalım
        int resultLength = sol.removeDuplicates(copy);

        boolean lengthCorrect = resultLength == expectedLength;
        boolean contentCorrect = true;

        for (int i = 0; i < expectedLength; i++) {
            if (copy[i] != expectedArrayStart[i]) {
                contentCorrect = false;
                break;
            }
        }

        if (lengthCorrect && contentCorrect) {
            System.out.println("✅ PASS");
        } else {
            System.out.println("❌ FAIL");
            System.out.println("Input:           " + Arrays.toString(input));
            System.out.println("Expected length: " + expectedLength);
            System.out.println("Got length:      " + resultLength);
            System.out.println("Expected start:  " + Arrays.toString(expectedArrayStart));
            System.out.println("Got start:       " +
                    Arrays.toString(Arrays.copyOf(copy, resultLength)));
        }

        System.out.println("----------------------------------");
    }

    // ---------------- MAIN ----------------

    public static void main(String[] args) {

        runTest(
                new int[]{1,1,2},
                2,
                new int[]{1,2}
        );

        runTest(
                new int[]{0,0,1,1,1,2,2,3,3,4},
                5,
                new int[]{0,1,2,3,4}
        );

        runTest(
                new int[]{},
                0,
                new int[]{}
        );

        runTest(
                new int[]{1,1,1,1},
                1,
                new int[]{1}
        );
    }
}