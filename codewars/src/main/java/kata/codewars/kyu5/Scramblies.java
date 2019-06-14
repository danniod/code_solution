package kata.codewars.kyu5;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Scramblies
 * @see <a href="https://www.codewars.com/kata/scramblies/java">www.codewars.com/kata/scramblies</a>
 *
 * @author danny
 * @date 2019-06-11
 */
public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        List<Character> chars = str1.chars().mapToObj(value -> (char) value).collect(Collectors.toList());
        return str2.chars().filter(value -> !str1.contains(String.valueOf((char) value)) || !chars.remove(Character.valueOf((char) value))).count() <= 0;

    }

}