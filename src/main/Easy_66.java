import java.util.Arrays;

public class Easy_66 {

    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1] != 9){
            digits[digits.length-1] += 1;
            return digits;
        } else {
            int check = digits.length - 1;
            while (digits[check] == 9){
                if (check == 0){
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    return result;
                } else {
                    digits[check] = 0;
                    check--;
                }
            }
            digits[check] += 1;
            return digits;
        }
    }

    // ---------------- TEST RUNNER ----------------

    private static void runTest(int[] input, int[] expected) {
        Easy_66 sol = new Easy_66();

        int[] inputCopy = Arrays.copyOf(input, input.length);
        int[] result = sol.plusOne(inputCopy);

        boolean pass = Arrays.equals(result, expected);

        if (pass) {
            System.out.println("✅ PASS");
            System.out.println("Input:    " + Arrays.toString(input));
            System.out.println("Got:      " + Arrays.toString(result));
        } else {
            System.out.println("❌ FAIL");
            System.out.println("Input:    " + Arrays.toString(input));
            System.out.println("Expected: " + Arrays.toString(expected));
            System.out.println("Got:      " + Arrays.toString(result));
            System.out.println("----------------------------------");
        }

    }

    // ---------------- MAIN ----------------

    public static void main(String[] args) {


        runTest(
                new int[]{1,2,3},
                new int[]{1,2,4}
        );

        runTest(
                new int[]{4,3,2,1},
                new int[]{4,3,2,2}
        );

        runTest(
                new int[]{9},
                new int[]{1,0}
        );


        runTest(
                new int[]{9,9,9},
                new int[]{1,0,0,0}
        );


        runTest(
                new int[]{0},
                new int[]{1}
        );
        runTest(
                new int[]{1,9,9},
                new int[]{2,0,0}
        );
        runTest(
                new int[]{1,8,9},
                new int[]{1,9,0}
        );

    }
}
