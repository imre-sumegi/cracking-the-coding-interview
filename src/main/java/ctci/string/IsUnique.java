package ctci.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structure
 */
public class IsUnique {

    public IsUnique() {
    }

    public boolean isUniqueSimple(String s) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            characterSet.add(s.charAt(i));
        }

        return s.length() == characterSet.size();
    }

    public boolean isUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
