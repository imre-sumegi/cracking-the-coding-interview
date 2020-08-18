package ctci.string;

import java.util.Set;
import java.util.TreeSet;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
public class CheckPermutation {

    public CheckPermutation() {}

    public boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            Set<Character> set1 = new TreeSet<>();
            Set<Character> set2 = new TreeSet<>();

            for (int i = 0; i < s1.length(); i++) {
                set1.add(s1.charAt(i));
                set2.add(s2.charAt(i));
            }

            return set1.equals(set2);
        }
    }
}
