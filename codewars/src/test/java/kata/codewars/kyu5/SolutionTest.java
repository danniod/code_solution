package kata.codewars.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void exampleTests() {
        assertEquals("", Solution.lcs("a", "b"));
        assertEquals("abc", Solution.lcs("abcdef", "abc"));
    }
}