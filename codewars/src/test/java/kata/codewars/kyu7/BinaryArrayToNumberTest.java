package kata.codewars.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryArrayToNumberTest {

    @org.junit.Test
    public void sampleTests() throws Exception {

        assertEquals(1, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        assertEquals(15, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        assertEquals(6, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        assertEquals(9, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
    }


    @org.junit.Test
    public void convertBinaryArrayToInt() throws Exception {
        List<List<Integer>> tests = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j < Math.floor(Math.random() * 5) + 4; j++) {
                temp.add((int) Math.round(Math.random() * 1));
            }

            tests.add(temp);
        }

        tests.forEach((test) -> {
            String s = test.toString();
            String ans = "";

            for (char c : s.toCharArray()) {
                int value = Character.getNumericValue(c);

                if (value == 1 || value == 0) {
                    ans += c;
                }
            }

            int solution = Integer.parseInt(ans, 2);

            System.out.println("Testing: " + s + " ==> " + solution);

            assertEquals(solution, BinaryArrayToNumber.ConvertBinaryArrayToInt(test));
        });

    }

}