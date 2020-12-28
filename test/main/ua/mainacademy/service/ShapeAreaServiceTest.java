package main.ua.mainacademy.service;

import main.ua.mainacademy.modelshapes.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeAreaServiceTest {

    @Test
    void shouldGetExpectedCircleArea() {
        Circle circle = new Circle(15.0);
        assertEquals(circle.getArea()
                ,ShapeAreaService.getArea(circle));
    }
}