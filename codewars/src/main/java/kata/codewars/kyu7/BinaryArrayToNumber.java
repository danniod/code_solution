package kata.codewars.kyu7;

import java.util.List;

/**
 * Ones and Zeros
 * @author danny
 * @date 2019-06-15
 *
 * @see <a href="https://www.codewars.com/kata/ones-and-zeros/java">www.codewars.com/kata/ones-and-zeros</a>
 */
public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        return binary.stream().reduce(0,(num,integer) -> num << 1 | integer);
    }
}