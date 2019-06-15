package kata.codewars.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void exampleTests() {
        assertEquals(8, Kata.dontGiveMeFive(1,9));
        assertEquals(12, Kata.dontGiveMeFive(4,17));
    }

    @Test
    public void moreTests() {
        assertEquals(72, Kata.dontGiveMeFive(1,90));
        assertEquals(20, Kata.dontGiveMeFive(-4,17));
        assertEquals(38, Kata.dontGiveMeFive(-4,37));
        assertEquals(13, Kata.dontGiveMeFive(-14,-1));
        assertEquals(9, Kata.dontGiveMeFive(-14,-6));
    }

    @Test
    public void randomTests() {

        for(int r=0;r<30;r++)
        {
            int start = (int)(Math.random() * 110) - 50;
            int end = (int)(Math.random() * (80 - start - 1)) + start + 1;

            int expectedCount = 0;
            for(int i=start;i<=end;i++)
            {
                if(!(i + "").contains("5"))
                {
                    expectedCount++;
                }
            }

            assertEquals(expectedCount, Kata.dontGiveMeFive(start, end));
        }
    }
}