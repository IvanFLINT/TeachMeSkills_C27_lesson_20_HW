package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.constants.Сonstants;

/**
 * The Runnable interface is implemented in the EnteredCars class.It overrides the run method.
 * The takingAwayCars method describes the logic for taking away cars from a service station
 */
public class EnteredCars implements Runnable {
    private Table table;

    public EnteredCars(Table table) {
        this.table = table;
    }


    @Override
    public void run() {
        takingAwayCars();
    }

    private void takingAwayCars() {
        for (int i = 0; i < Сonstants.MAXIMUM_CARS; i++) {
            table.getCars();
        }
    }
}
