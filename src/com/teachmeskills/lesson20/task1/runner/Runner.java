package com.teachmeskills.lesson20.task1.runner;

import com.teachmeskills.lesson20.task1.runnable.MyRunnable;
import com.teachmeskills.lesson20.task1.thread.MyThread;

/**
 * Thread objects are created in the Runner class and run with a specific priority.
 */
public class Runner {
    public static void main(String[] args) {

        MyThread readingNews = new MyThread("Reading News");
        readingNews.setPriority(2);
        readingNews.start();

        MyThread breakfast = new MyThread("Breakfast");
        breakfast.setPriority(3);
        breakfast.start();

        MyThread coffee = new MyThread("Coffee");
        coffee.setPriority(1);
        coffee.start();

        System.out.println();

        Thread readingNews1 = new Thread(new MyRunnable("Reading News"));
        readingNews1.setPriority(5);
        readingNews1.start();

        Thread breakfast1 = new Thread(new MyRunnable("Breakfast"));
        breakfast1.setPriority(4);
        breakfast1.start();

        Thread coffee1 = new Thread(new MyRunnable("Coffee"));
        coffee1.setPriority(6);
        coffee1.start();


    }
}
