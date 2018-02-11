package arrayenstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2_PermutationStringTest {

    Q2_PermutationString q2_permutationString = new Q2_PermutationString();
    private static final String permutationString1 = "ABC";
    private static final String permutationString2 = "CBA";
    private static final String notPermutationString = "XCV";

    @Test
    void determinePermutationStringSuccess() {
        assertTrue(q2_permutationString.determinePermutationString(permutationString1, permutationString2));
    }

    @Test
    void determinePermutationStringFailure() {
        assertTrue(q2_permutationString.determinePermutationString(permutationString1, notPermutationString));
    }

}