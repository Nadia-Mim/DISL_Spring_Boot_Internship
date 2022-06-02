
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main extends Thread{
    public static void main(String[] args) {
        Main st = new Main();
        st.start();
        Thread t2 = new Main();
        t2.start();
        Thread threadFirst =new Thread("ThreadFirst") ;
        threadFirst.setPriority(10);
        System.out.println("Name:" +threadFirst.getName());
        System.out.println("Priority:" +threadFirst.getPriority());
        ClassImplementsRunnable td = new ClassImplementsRunnable();
        Thread runthread = new Thread(td, "runthread");
        runthread.start();


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