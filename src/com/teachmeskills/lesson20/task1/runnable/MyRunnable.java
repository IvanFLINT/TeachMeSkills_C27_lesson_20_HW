package com.teachmeskills.lesson20.task1.runnable;

/**
 * The MyRunnable class implements the Runnable interface. It overrides the run method.
 * The imitationMorning method describes the actions of the morning
 */
public class MyRunnable implements Runnable {
    private String name;
    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        imitationMorning();
    }

    private void imitationMorning(){
        System.out.println(name);
    }
}
