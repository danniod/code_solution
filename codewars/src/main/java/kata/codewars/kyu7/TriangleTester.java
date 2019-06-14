package kata.codewars.kyu7;

/**
 * Is this a triangle?
 * @author danny
 * @date 2019-06-14
 *
 * @see <a href="https://www.codewars.com/kata/is-this-a-triangle/java">www.codewars.com/kata/is-this-a-triangle</a>
 */
class TriangleTester {

    public static boolean isTriangle(int a, int b, int c) {

        return a + b > c && a + c > b && b + c > a;
    }
}