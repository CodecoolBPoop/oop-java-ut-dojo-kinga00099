package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhraseReverseTest {
    private String str;

    @BeforeEach
    void setUp() {
        this.str = "mini test haha";
    }


    @Test
    void testIsStringReversed() {
        String expected = "ahah tset inim";
        assertEquals(expected, PhraseReverse.reverse(str));
    }

    @Test
    void testAreWordsReversed() {
        String expected = "inim tset ahah";
        assertEquals(expected, PhraseReverse.reverseWords(str));
    }

    @Test
    void testIsreverseWordOrder() {
        String expected = "haha test mini";
        assertEquals(expected, PhraseReverse.reverseWordOrder(str));
    }

    @Test
    void testIsFirstNReversed() {
        String expected = "et inimst haha";
        assertEquals(expected, PhraseReverse.reverseN(str,7));
    }

    @Test
    void reverseArray() {
        String[] actual = str.split(" ");
        String[] expected = {"haha", "test", "mini"};
        assertArrayEquals(expected, PhraseReverse.reverseArray(actual));
    }

    @Test
    void join() {
        String[] actual = str.split(" ");
        String expected = "mini test haha";
        assertEquals(expected, PhraseReverse.join(actual," "));
    }

}