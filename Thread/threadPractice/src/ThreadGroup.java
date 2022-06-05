import java.lang.*;
public class ThreadGroup {
    static void threadGroupDemo(){
        ThreadGroup readingThreads = new ThreadGroup("ReadingThreadGroup");
        for (int i = 1; i <= 3; i++){
            A thread = new A(readingThreads, "Thread-" + i);
            thread.start();
        }
        ThreadGroup writingThreads = new ThreadGroup("WritingThreadGroup");
        for (int i = 4; i <= 6; i++) {
            B thread = new B(writingThreads, "Thread-" + i);
            thread.start();
        }
    }
}

class A extends Thread {
    A(ThreadGroup tg, String name) {
        super(tg, name);
    }

    public void run() {
        System.out.println("I am " + Thread.currentThread().getName() + " I belong to " + Thread.currentThread().getThreadGroup().getName());
        System.out.println("I am running.");
    }
}

class B extends Thread {
    B(ThreadGroup tg, String name) {
        super(tg, name);
    }

    public void run() {
        System.out.println("I am " + Thread.currentThread().getName() + " I belong to " + Thread.currentThread().getThreadGroup().getName());
        System.out.println("I am running.");
    }
}