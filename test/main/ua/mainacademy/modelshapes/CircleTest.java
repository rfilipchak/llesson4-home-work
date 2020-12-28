package main.ua.mainacademy.modelshapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        double expectedCircleArea = 314.1592653589793;
        assertEquals(expectedCircleArea,
                new Circle(10.).getArea());
    }
}