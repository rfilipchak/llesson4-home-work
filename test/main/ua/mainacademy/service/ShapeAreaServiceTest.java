package main.ua.mainacademy.service;

import main.ua.mainacademy.modelshapes.Circle;
import main.ua.mainacademy.modelshapes.Square;
import main.ua.mainacademy.modelshapes.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeAreaServiceTest {

    @Test
    void shouldGetExpectedCircleArea() {
        Circle circle = new Circle(15.0);

        assertEquals(circle.getArea()
                ,ShapeAreaService.getArea(circle));

    }

    @Test
    void shouldGetExpectedSquareArea() {
        Square square = new Square(10.0);

        assertEquals(square.getArea()
                ,ShapeAreaService.getArea(square));

    }

    @Test
    void shouldGetExpectedTriangleArea() {
        Triangle triangle = new Triangle(11.0, 12.0);

        assertEquals(triangle.getArea()
                ,ShapeAreaService.getArea(triangle));
    }
}