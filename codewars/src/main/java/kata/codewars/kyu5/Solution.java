package kata.codewars.kyu5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Longest Common Subsequence
 * @see <a href="https://www.codewars.com/kata/longest-common-subsequence/java">www.codewars.com/kata/longest-common-subsequence</a>
 *
 * @author danny
 * @date 2019-06-08
 */
public class Solution {
    public static String lcs(String x, String y) {
        List<String> subsequence = getSubsequence(x);
        subsequence.retainAll(getSubsequence(y));
        List<String> commonSubsequence = subsequence.stream()
                .sorted((o1, o2) -> o2.length() - o1.length())
                .collect(Collectors.toList());
        return commonSubsequence.isEmpty() ? "" : commonSubsequence.get(0);
    }

    private static List<String> getSubsequence(String string) {
        List<String> subsequence = new ArrayList<>();
        combinations("", string, subsequence);
        return subsequence;
    }

    private static void combinations(String suffix, String prefix, List<String> subsequence) {
        if (prefix.length() < 0) {
            return;
        }
        subsequence.add(suffix);
        for (int i = 0; i < prefix.length(); i++) {
            combinations(suffix + prefix.charAt(i), prefix.substring(i + 1, prefix.length()), subsequence);
        }
    }

}