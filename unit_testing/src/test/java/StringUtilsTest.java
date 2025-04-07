import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils StringUtils = new StringUtils();
    @Test
    void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
    }
    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("aba"));

    }

}