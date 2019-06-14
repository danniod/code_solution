package kata.codewars.kyu7;

/**
 * Printer Errors
 * @see <a href="https://www.codewars.com/kata/printer-errors/java">www.codewars.com/kata/printer-errors</a>
 *
 * @author danny
 * @date 2019-06-08
 */
public class Printer {

    public static String printerError(String s) {
        return String.format("%d/%d", s.chars().filter(c -> c > 109).count(), s.length());
    }

}
