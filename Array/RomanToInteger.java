
import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {

        HashMap<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = roman.get(s.charAt(i));

            if (i + 1 < s.length() &&
                current < roman.get(s.charAt(i + 1))) {

                result = result - current;

            } else {

                result = result + current;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "MCMXCIVI";

        int answer = romanToInt(s);

        System.out.println("Roman Numeral: " + s);
        System.out.println("Integer: " + answer);
    }
}

