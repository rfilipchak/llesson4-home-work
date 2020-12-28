package main.ua.mainacademy.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationLessonServiceTest {

    @Test
    void getMultiplicationLessonForNumbers() {
        String expectedString = "         1111111111" + "\n" +
                "         1111111111" + "\n" +
                "         ----------" + "\n" +
                "         1111111111" + "\n" +
                "        1111111111" + "\n" +
                "       1111111111" + "\n" +
                "      1111111111" + "\n" +
                "     1111111111" + "\n" +
                "    1111111111" + "\n" +
                "   1111111111" + "\n" +
                "  1111111111" + "\n" +
                " 1111111111" + "\n" +
                "1111111111" + "\n" +
                "-------------------" + "\n" +
                "1234567900987654321";

        assertEquals(expectedString, MultiplicationLessonService.getMultiplicationLessonForNumbers(1111111111, 1111111111));
    }

    @Test
    void getMultiplicationLessonForNegativeNumbers() {
        String expectedString = "  122" + "\n" +
                "  111" + "\n" +
                "  ---" + "\n" +
                "  122" + "\n" +
                " 122" + "\n" +
                "122" + "\n" +
                "-----" + "\n" +
                "13542";

        assertEquals(MultiplicationLessonService.getMultiplicationLessonForNumbers(-122, -111), expectedString);
    }

    @Test
    void getMultiplicationLessonWithZero() {
        String expectedString = "  12" + "\n" +
                " 101" + "\n" +
                " ---" + "\n" +
                "  12" + "\n" +
                " 0" + "\n" +
                "12" + "\n" +
                "----" + "\n" +
                "1212";

        assertEquals(MultiplicationLessonService.getMultiplicationLessonForNumbers(12, 101), expectedString);
    }

    @Test
    void getMultiplicationLessonWithLessThenTenNumber() {
        String expectedString = "  2" + "\n" +
                "123" + "\n" +
                "---" + "\n" +
                "246";

        assertEquals(MultiplicationLessonService.getMultiplicationLessonForNumbers(2, 123), expectedString);
    }

    @Test
    void getMultiplicationLessonWithTenNumber() {
        String expectedString = " 122" + "\n" +
                "  10" + "\n" +
                "----" + "\n" +
                "1220";

        assertEquals(MultiplicationLessonService.getMultiplicationLessonForNumbers(122, 10), expectedString);
    }

    @Test
    void getMultiplicationLessonWithZeroNumber() {
        String expectedString = "1222" + "\n" +
                "0" + "\n" +
                "-" + "\n" +
                "0";

        assertEquals(MultiplicationLessonService.getMultiplicationLessonForNumbers(-1222, 0), expectedString);
    }
}