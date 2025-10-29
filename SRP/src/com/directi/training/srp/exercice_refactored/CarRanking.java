package com.directi.training.srp.exercise;

public class CarRanking {
    private final CarRepository carRepository;

    public CarRanking(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : carRepository.getCars()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
