package main.ua.mainacademy.modelshapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void getArea() {
        double expectedTriangleArea = 25.;
        assertEquals(expectedTriangleArea,
                new Triangle(10., 5.).getArea());
    }
}