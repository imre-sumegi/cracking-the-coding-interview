package ctci.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsUniqueTest {
    private IsUnique isUnique;

    @BeforeEach
    public void init() {
        isUnique = new IsUnique();
    }

    @Test
    public void testIsUniqueSimple() {
        assertFalse(isUnique.isUniqueSimple("energetic"));
        assertTrue(isUnique.isUniqueSimple("sideway"));
    }

    @Test
    public void testIsUnique() {
        assertFalse(isUnique.isUnique("energetic"));
        assertTrue(isUnique.isUnique("sideway"));
    }
}