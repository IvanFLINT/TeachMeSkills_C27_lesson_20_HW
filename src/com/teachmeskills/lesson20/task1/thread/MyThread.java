package com.teachmeskills.lesson20.task1.thread;

/**
 * The MyThread class inherits from the Thread class. It overrides the run method.
 * The imitationMorning method describes the actions of the morning
 */
public class MyThread extends Thread{
    private String threadName;
    public MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        imitationMorning();
    }
    private void imitationMorning() {
        System.out.println(threadName);
    }
}
