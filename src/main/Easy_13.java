import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Easy_13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentVal = map.get(s.charAt(i));

            if (currentVal < prevValue) {
                res -= currentVal;
            } else {
                res += currentVal;
            }
            prevValue = currentVal;
        }
        return res;
    }

    public static void main(String[] args) {
        Easy_13 sol = new Easy_13();

        String[] testCases = {
                "III",
                "LVIII",
                "MCMXCIV",
                "IX",
                "XL"
        };

        for (String test : testCases) {
            int result = sol.romanToInt(test);
            System.out.println("Input: " + test + " -> Output: " + result);
        }
    }
}
