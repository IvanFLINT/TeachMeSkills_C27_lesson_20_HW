package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.constants.Сonstants;

/**
 * The Table class has two methods getCars, putCars for adding and subtracting cars per hundred.
 * Use synchronized, wait, notify to coordinate threads
 */
public class Table {
    private int carsCount = 0;

    public synchronized void getCars() {
        while (carsCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Машины на СТО отсутствуют");
            }
        }
        carsCount--;
        System.out.println("Выехала машина из СТО");
        System.out.println("Машин на СТО: " + carsCount);
        notify();
    }

    public synchronized void putCars() {
        while (carsCount >= Сonstants.MAXIMUM_CARS) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("На СТО нету места");
            }
        }
        carsCount++;
        System.out.println("Приехала машина на СТО");
        System.out.println("Машин на СТО: " + carsCount);
        notify();
    }
}
