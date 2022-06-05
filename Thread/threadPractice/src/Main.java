public class Main extends Thread{
    public static void main(String[] args) {
//        Main st = new Main();
//        st.start();
//        Thread t2 = new Main();
//        t2.start();
//        Thread threadFirst =new Thread("ThreadFirst") ;
//        threadFirst.setPriority(10);
//        System.out.println("Name:" +threadFirst.getName());
//        System.out.println("Priority:" +threadFirst.getPriority());
//        ClassImplementsRunnable td = new ClassImplementsRunnable();
//        Thread runthread = new Thread(td, "runthread");
//        runthread.start();
//
//        Runnable r = new MyThread();
//        Thread t = new Thread(r);
//        System.out.println("Created thread by implementing Runnable interface.");
//        t.start();

        /*calling another class*/
//        multithreadedProgrammimng mp = new multithreadedProgrammimng();
//        mp.InterThreadDemo();
//
//        srynconizedThreadMethod stm = new srynconizedThreadMethod ();
//        stm.seatReservation();

//        synchronizedBlocks sb = new synchronizedBlocks();
//        sb.atmTransaction();

//        BankingSynchronizedBlock bsb = new BankingSynchronizedBlock();
//        bsb.banking();

        deadLockdemo dld = new deadLockdemo();
        dld.deadLock();
    }
    public void run(){
        System.out.println("Thread running...");
    }
}
class ClassImplementsRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("I am running");
    }

}
class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread Running");
    }
}