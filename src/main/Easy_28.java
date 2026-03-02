public class Easy_28 {

    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.startsWith(needle, i)){
                return i;
            }
        }
        return -1;
    }

    // ---------------- TEST RUNNER ----------------

    private static void runTest(String haystack, String needle, int expected) {
        Easy_28 sol = new Easy_28();
        int result = sol.strStr(haystack, needle);

        if (result == expected) {
            System.out.println("✅ PASS");
        } else {
            System.out.println("❌ FAIL");
            System.out.println("Haystack: \"" + haystack + "\"");
            System.out.println("Needle:   \"" + needle + "\"");
            System.out.println("Expected: " + expected);
            System.out.println("Got:      " + result);
        }

        System.out.println("----------------------------------");
    }

    // ---------------- MAIN ----------------

    public static void main(String[] args) {

        runTest("sadbutsad", "sad", 0);
        runTest("leetcode", "leeto", -1);
        runTest("hello", "ll", 2);
        runTest("aaaaa", "bba", -1);
        runTest("a", "a", 0);
        runTest("mississippi", "issip", 4);
        runTest("", "", 0); // edge case
        runTest("abc", "", 0); // edge case (LeetCode böyle kabul eder)
    }
}
