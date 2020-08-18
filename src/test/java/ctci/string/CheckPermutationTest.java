package ctci.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckPermutationTest {

    private CheckPermutation checkPermutation;

    @BeforeEach
    public void init() {
        checkPermutation = new CheckPermutation();
    }

    @Test
    public void testIsPermutationOf() {
        assertTrue(checkPermutation.checkPermutation("lama", "alma"));
        assertTrue(checkPermutation.checkPermutation("tekerd", "kerted"));
        assertFalse(checkPermutation.checkPermutation("aa", "a"));
        assertFalse(checkPermutation.checkPermutation("alak", "alma"));
    }
}