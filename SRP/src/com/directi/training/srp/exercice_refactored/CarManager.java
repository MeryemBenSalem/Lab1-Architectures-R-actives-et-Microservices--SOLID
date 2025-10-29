package com.directi.training.srp.exercise;

import java.util.List;

public class CarManager {
    private final CarRepository carRepository;
    private final CarFormatter carFormatter;
    private final CarRanking carRanking;

    public CarManager() {
        this.carRepository = new CarRepository();
        this.carFormatter = new CarFormatter(carRepository);
        this.carRanking = new CarRanking(carRepository);
    }

    public Car getFromDb(String carId) {
        return carRepository.getCarById(carId);
    }

    public String getCarsNames() {
        return carFormatter.getCarsNames();
    }

    public Car getBestCar() {
        return carRanking.getBestCar();
    }
}
