import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	public static int maxRun(String str) {
        int maxString = 1;
        int count = 1;
        for (int i = 1; i < str.length(); ++i) {
            if (str.charAt(i) != str.charAt(i - 1)){
                count = 1;
            } else {
                ++count;
                if (count > maxString) maxString = count;
            }
        }
		return maxString;
	}

	public static String blowup(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                if (i + 1 < str.length()) {
                    int num = Character.getNumericValue(c);
                    char nextChar = str.charAt(i + 1);
                    for (int j = 0; j < num; j++) {
                        result.append(nextChar);
                    }
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

	public static boolean stringIntersect(String a, String b, int len) {
        Set <String> strA = new HashSet<>();
        if (len > a.length() || len > b.length() || len < 1) {
            return false;
        }
        for (int i = 0; i <= a.length() - len; ++i) {
            strA.add(a.substring(i, i + len));
        }
        for (int i = 0; i <= b.length() - len; ++i) {
            String s = b.substring(i, i + len);
            if (strA.contains(s)) {
                return true;
            }
        }
		return false;
	}
}
