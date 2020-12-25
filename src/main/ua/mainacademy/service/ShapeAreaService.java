package main.ua.mainacademy.service;

import main.ua.mainacademy.modelshapes.Shape;

import java.util.logging.Logger;

public class ShapeAreaService {

    public static Logger LOGGER = Logger.getLogger(ShapeAreaService.class.getName());

    public static double getArea(Shape shape){
        LOGGER.info(String.format("Getting area for %s ", shape.getClass().getSimpleName()));
        return shape.getArea();
    };
}
