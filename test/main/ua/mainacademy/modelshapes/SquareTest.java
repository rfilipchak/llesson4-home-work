package main.ua.mainacademy.modelshapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        double expectedSquareArea = 100.;
        assertEquals(expectedSquareArea,
                new Square(10.).getArea());
    }
}