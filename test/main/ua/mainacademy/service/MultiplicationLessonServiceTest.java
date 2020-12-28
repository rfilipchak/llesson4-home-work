package main.ua.mainacademy.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationLessonServiceTest {

    @Test
    void getMultiplicationLessonForNumbers() {
        String expectedString = "  12" + "\n" +
                " 111" + "\n" +
                " ---" + "\n" +
                "  12" + "\n" +
                " 12" + "\n" +
                "12" + "\n" +
                "----" + "\n" +
                "1332";

        assertEquals(MultiplicationLessonService.getMultiplicationLessonForNumbers(12, 111), expectedString);
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
}