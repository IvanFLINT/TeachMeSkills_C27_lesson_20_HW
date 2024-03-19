package com.teachmeskills.lesson20.task2.runner;

import com.teachmeskills.lesson20.task2.model.ArrivingCars;
import com.teachmeskills.lesson20.task2.model.EnteredCars;
import com.teachmeskills.lesson20.task2.model.Table;

/**
 * In the Runner class, thread objects are created and launched
 */
public class Runner {
    public static void main(String[] args) {
        Table table = new Table();

        Thread t1 = new Thread(new ArrivingCars(table));
        t1.start();
        Thread t2 = new Thread(new EnteredCars(table));
        t2.start();
    }
}
