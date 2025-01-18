package ransom_note;
import static org.junit.jupiter.api.Assertions.*;
import static ransom_note.SolutionKt.canConstruct;

import org.junit.jupiter.api.Test;

class RansomNoteTest {

    // Casos básicos
    @Test
    void testRansomNoteEmptyNoteAndMagazine() {
        String ransomNote = "";
        String magazine = "";
        assertTrue(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteSingleCharMismatch() {
        String ransomNote = "x";
        String magazine = "y";
        assertFalse(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteSingleCharMatch() {
        String ransomNote = "a";
        String magazine = "a";
        assertTrue(canConstruct(ransomNote, magazine));
    }

    // Casos con repetición de caracteres
    @Test
    void testRansomNoteNotEnoughRepeats() {
        String ransomNote = "aa";
        String magazine = "a";
        assertFalse(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteExactRepeats() {
        String ransomNote = "aa";
        String magazine = "aa";
        assertTrue(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteExtraRepeatsInMagazine() {
        String ransomNote = "aa";
        String magazine = "aaa";
        assertTrue(canConstruct(ransomNote, magazine));
    }

    // Casos con caracteres no consecutivos
    @Test
    void testRansomNoteNonConsecutiveMatch() {
        String ransomNote = "abc";
        String magazine = "aabbcc";
        assertTrue(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteNonConsecutiveNoMatch() {
        String ransomNote = "abc";
        String magazine = "acb";
        assertTrue(canConstruct(ransomNote, magazine));
    }

    // Casos límite con caracteres únicos
    @Test
    void testRansomNoteUniqueCharsExactMatch() {
        String ransomNote = "abcd";
        String magazine = "abcd";
        assertTrue(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteUniqueCharsMismatch() {
        String ransomNote = "abcd";
        String magazine = "abc";
        assertFalse(canConstruct(ransomNote, magazine));
    }

    // Casos con mezclas largas
    @Test
    void testRansomNoteMixedLongMatch() {
        String ransomNote = "abcabc";
        String magazine = "aabbccabc";
        assertTrue(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteMixedLongNoMatch() {
        String ransomNote = "abcabc";
        String magazine = "aabbcc";
        assertTrue(canConstruct(ransomNote, magazine));
    }

    // Casos con una nota vacía
    @Test
    void testRansomNoteEmptyNote() {
        String ransomNote = "";
        String magazine = "xyz";
        assertTrue(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteEmptyMagazine() {
        String ransomNote = "abc";
        String magazine = "";
        assertFalse(canConstruct(ransomNote, magazine));
    }

    // Casos con entradas grandes
    @Test
    void testRansomNoteLargeMatch() {
        String ransomNote = "a".repeat(1000);
        String magazine = "a".repeat(1000);
        assertTrue(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteLargeNoMatch() {
        String ransomNote = "a".repeat(1000);
        String magazine = "a".repeat(999);
        assertFalse(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteLargeExtraMagazine() {
        String ransomNote = "a".repeat(1000);
        String magazine = "a".repeat(1000) + "b".repeat(1000);
        assertTrue(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteLargeExtraNote() {
        String ransomNote = "a".repeat(1001);
        String magazine = "a".repeat(1000);
        assertFalse(canConstruct(ransomNote, magazine));
    }

    // Casos con caracteres mezclados y repetidos
    @Test
    void testRansomNoteMixedCharsMatch() {
        String ransomNote = "aabbcc";
        String magazine = "abcabcabc";
        assertTrue(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteMixedCharsNoMatch() {
        String ransomNote = "aabbcc";
        String magazine = "abc";
        assertFalse(canConstruct(ransomNote, magazine));
    }

    @Test
    void testRansomNoteWithExtraCharsInMagazine() {
        String ransomNote = "xyz";
        String magazine = "xyzzzzzzzz";
        assertTrue(canConstruct(ransomNote, magazine));
    }

}
