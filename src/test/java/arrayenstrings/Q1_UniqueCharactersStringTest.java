package arrayenstrings;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class Q1_UniqueCharactersStringTest {

    Q1_UniqueCharactersString q1UniqueCharactersString = new Q1_UniqueCharactersString();

    private String uniqueString = "abcdefghijklmnopqrstuvwxyz1234567890";
    private String notuniqueString = "abcdefghijklmnopqrstuvwxyz1234567890x";

    @Test
    void determineUniqueCharSuccessNoDS() {
        assertTrue(q1UniqueCharactersString.determineUniqueCharNoDS(uniqueString));
    }

    @Test
    void determineUniqueCharFailureNoDS() {
        assertFalse(q1UniqueCharactersString.determineUniqueCharNoDS(notuniqueString));
    }

    @Test
    void determineUniqueCharSuccessWithDS() {
        assertTrue(q1UniqueCharactersString.determineUniqueCharWithDS(uniqueString));
    }

    @Test
    void determineUniqueCharFailureWithDS() {
        assertFalse(q1UniqueCharactersString.determineUniqueCharWithDS(notuniqueString));
    }
}