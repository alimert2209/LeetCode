public class Easy_14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Easy_14 sol = new Easy_14();

        String[][] testCases = {
                {"flower", "flow", "flight"},
                {"dog", "racecar", "car"},
                {"interspecies", "interstellar", "interstate"},
                {"a"},
                {}
        };

        for (String[] test : testCases) {
            System.out.print("Input: ");
            printArray(test);

            String result = sol.longestCommonPrefix(test);
            System.out.println();
            System.out.println("Output: " + result);
            System.out.println("-------------------");
        }
    }

    private static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}