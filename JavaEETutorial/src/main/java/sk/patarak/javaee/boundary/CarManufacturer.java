package sk.patarak.javaee.boundary;

import sk.patarak.javaee.entity.Car;
import sk.patarak.javaee.entity.Specification;

import java.util.UUID;

public class CarManufacturer {

    public Car manufactureCar(Specification specification) {
        Car car = new Car();
        car.setIdentifier(UUID.randomUUID().toString());
        car.setColor(specification.getColor());
        car.setEngineType(specification.getEngineType());
        return car;
    }
}
