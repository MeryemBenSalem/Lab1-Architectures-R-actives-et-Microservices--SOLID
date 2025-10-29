package com.directi.training.srp.exercise;

public class CarFormatter {
    private final CarRepository carRepository;

    public CarFormatter(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : carRepository.getCars()) {
            sb.append(car.getBrand()).append(" ").append(car.getModel()).append(", ");
        }
        return sb.substring(0, sb.length() - 2);  // Remove trailing comma and space
    }
}
