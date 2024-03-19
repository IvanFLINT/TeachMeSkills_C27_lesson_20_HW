package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.constants.Сonstants;

/**
 * The Runnable interface is implemented in the ArrivingCars class.
 * It overrides the run method. The addCar method describes the logic for adding cars to a service station
 */
public class ArrivingCars implements Runnable {
    private Table table;

    public ArrivingCars(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        addCar();
    }

    private void addCar() {
        for (int i = 0; i <= Сonstants.MAXIMUM_CARS; i++) {
            table.putCars();
        }
    }
}
