package io.github.tingreavinash.JavaConcepts.Multithreading;

class MyClass {
    /*
     * This method request two locks, first String and then Integer
     */
    public void method1() {
        synchronized (String.class) {
            System.out.println("Aquired lock on String.class object -->" + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            synchronized (Integer.class) {
                System.out.println("Aquired lock on Integer.class object -->" + Thread.currentThread().getName());
            }
        }
    }

    /*
     * This method also requests same two lock but in exactly
     * Opposite order i.e. first Integer and then String.
     * This creates potential deadlock, if one thread holds String lock
     * and other holds Integer lock and they wait for each other, forever.
     */
    public void method2() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object -->" + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object -->" + Thread.currentThread().getName());
            }
        }
    }
}

public class DeadlockDemo {

    public static void main(String[] args) throws InterruptedException {

        MyClass obj = new MyClass();
        Thread t1 = new Thread(obj::method1);

        Thread t2 = new Thread(obj::method2);

        t1.start();
        //t1.join(); Using this technique deadlock can be resolved.
        t2.start();

        /***
         * Solution to above deadlock issue:
         * To solve the issue we will have to simply re-order the statements where the code is accessing shared resources.
         *
         * How to Avoid Deadlock in Java?
         *
         * 1. Avoid Nested Locks: We must avoid giving locks to multiple threads, this is the main reason for a deadlock condition. It normally happens when you give locks to multiple threads.
         * 2. Avoid Unnecessary Locks: The locks should be given to the important threads. Giving locks to the unnecessary threads that cause the deadlock condition.
         * 3. Using Thread Join: A deadlock usually happens when one thread is waiting for the other to finish. In this case, we can use join with a maximum time that a thread will take.
         */

    }
}
