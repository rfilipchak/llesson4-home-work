package main.ua.mainacademy.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResearchPalindromeServiceTest {


    @Test
    void shouldReturnPolindromeMaxValue() {
        int expectedValue = 99000099;
        assertEquals(expectedValue,
                ResearchPalindromeService.getPolindromeMaxValue(1000, 9999));
    }

    @Test
    void shouldReturnError() {
        int expectedValue = -1;
        assertEquals(expectedValue,
                ResearchPalindromeService.getPolindromeMaxValue(123, 123));
    }
}