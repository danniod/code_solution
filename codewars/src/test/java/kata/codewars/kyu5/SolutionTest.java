package kata.codewars.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void exampleTests() {
        assertEquals("", Solution.lcs("a", "b"));
        assertEquals("abc", Solution.lcs("abcdef", "abc"));
    }


    @Test
    public void testSequences() {
        assertEquals("", Solution.lcs("a", "b"));
        assertEquals("a", Solution.lcs("a", "a"));
        assertEquals("ac", Solution.lcs("abc", "ac"));
        assertEquals("abc", Solution.lcs("abcdef", "abc"));
        assertEquals("acf", Solution.lcs("abcdef", "acf"));
        assertEquals("nottest", Solution.lcs("anothertest", "notatest"));
        assertEquals("12356", Solution.lcs("132535365", "123456789"));
        assertEquals("final", Solution.lcs("finaltest", "zzzfinallyzzz"));
    }

}