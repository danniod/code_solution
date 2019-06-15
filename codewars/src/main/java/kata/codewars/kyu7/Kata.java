package kata.codewars.kyu7;

import java.util.stream.IntStream;

/**
 * Don't give me five!
 * @author danny
 * @date 2019-06-15
 * @see <a href="https://www.codewars.com/kata/dont-give-me-five/java">www.codewars.com/kata/dont-give-me-five</a>
 */
public class Kata {

    public static int dontGiveMeFive(int start, int end) {
        return (int) IntStream.rangeClosed(start, end).filter(value -> !String.valueOf(value).contains("5")).count();
    }
}