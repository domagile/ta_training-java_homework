package com.epam.training.student_olha_diatlova.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringAnalyzerTest {
    private final StringAnalyzer analyzer = new StringAnalyzer();


    @Test
    void testMaxUnequalConsecutiveChars() {
        assertEquals(4, analyzer.maxUnequalConsecutiveChars("abcd"));
        assertEquals(5, analyzer.maxUnequalConsecutiveChars("aa1234"));
        assertEquals(1, analyzer.maxUnequalConsecutiveChars("cccc"));
        assertEquals(6, analyzer.maxUnequalConsecutiveChars("AaBbCc"));
        assertEquals(5, analyzer.maxUnequalConsecutiveChars("w!@#q"));
        assertEquals(1, analyzer.maxUnequalConsecutiveChars("w"));
        assertEquals(6, analyzer.maxUnequalConsecutiveChars("abcder"));
        assertEquals(12, analyzer.maxUnequalConsecutiveChars("abcabcabcabc"));

        assertEquals(0, analyzer.maxUnequalConsecutiveChars(null));
        assertEquals(0, analyzer.maxUnequalConsecutiveChars(""));
    }

    @Test
    void testMaxEqualConsecutiveLetters() {
        assertEquals(3, analyzer.maxEqualConsecutiveLetters("abcddde"));
        assertEquals(3, analyzer.maxEqualConsecutiveLetters("aжжжжжжbcddd"));
        assertEquals(2, analyzer.maxEqualConsecutiveLetters("ascc"));
        assertEquals(2, analyzer.maxEqualConsecutiveLetters("asSCcc"));
        assertEquals(2, analyzer.maxEqualConsecutiveLetters("1dd2f"));
        assertEquals(0, analyzer.maxEqualConsecutiveLetters("a"));
        assertEquals(0, analyzer.maxEqualConsecutiveLetters("abcder"));

        assertEquals(0, analyzer.maxEqualConsecutiveLetters(null));
        assertEquals(0, analyzer.maxEqualConsecutiveLetters(""));
        assertEquals(0, analyzer.maxEqualConsecutiveLetters("12364"));
        assertEquals(0, analyzer.maxEqualConsecutiveLetters("№;:?*?(()__"));
    }

    @Test
    void testMaxEqualConsecutiveDigits() {
        assertEquals(5, analyzer.maxEqualConsecutiveDigits("11222223"));
        assertEquals(2, analyzer.maxEqualConsecutiveDigits("512234"));
        assertEquals(2, analyzer.maxEqualConsecutiveDigits("vaa512234fgdfg"));

        assertEquals(0, analyzer.maxEqualConsecutiveDigits(null));
        assertEquals(0, analyzer.maxEqualConsecutiveDigits(""));
        assertEquals(0, analyzer.maxEqualConsecutiveDigits("abcdef"));
        assertEquals(0, analyzer.maxEqualConsecutiveDigits("!?*?!"));
    }
}
