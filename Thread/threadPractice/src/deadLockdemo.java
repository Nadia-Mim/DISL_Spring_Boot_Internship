public class deadLockdemo {
    static void deadLock(){
        Resource r1 = new Resource();
        Resource r2 = new Resource();
        UserOne thread1 = new UserOne(r1,r2);
        thread1.start();
        UserTwo thread2 = new UserTwo(r1,r2);
        thread2.start();
    }
}

class Resource{
    void status(){
        System.out.println(Thread.currentThread().getName() +  " is handling.");
    }
}

class UserOne extends Thread{
    Resource r1;
    Resource r2;

    UserOne (Resource r1, Resource r2){
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run(){
        synchronized (r1){
            System.out.println(Thread.currentThread().getName() + "  is holding r1.");
            System.out.println(Thread.currentThread().getName() + "  is waiting for r2.");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (r2){
                System.out.println(Thread.currentThread().getName() + "  is holding r1 & r2.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " Leaving.....");
    }
}

class UserTwo extends Thread {
    Resource r1;
    Resource r2;
    UserTwo(Resource r1, Resource r2){
        this.r1 = r1;
        this.r2 = r2;
    }
    public void run(){

        synchronized (r1){

            System.out.println(Thread.currentThread().getName() + "  is holding r1.");
            System.out.println(Thread.currentThread().getName() + "  is waiting for r2.");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (r2) {
                System.out.println(Thread.currentThread().getName() + "  is holding r1 & r2.");
            }
        }
    }
}