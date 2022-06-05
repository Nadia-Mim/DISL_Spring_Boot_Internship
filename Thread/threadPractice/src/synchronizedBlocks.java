public class synchronizedBlocks {
    public static void atmTransaction(){
        for(int i = 1; i < 4; i++){
            AccountHolder t = new AccountHolder();
            t.setName("Person" + i);
            t.start();
        }
    }
}
class ATMCenter{
    static synchronized void userAction(){
        System.out.println(Thread.currentThread().getName() + " entered");
        System.out.println("Performed Transaction");
        try{
            Thread.sleep(400);
        }
        catch (Exception e){
            System.out.println("Thread Interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " transaction complete");
        System.out.println(Thread.currentThread().getName() + " leaving.......");
        System.out.println("----------------------------------------------");
    }
}
class AccountHolder extends Thread{
    ATMCenter s = new ATMCenter();
    @Override
    public void run(){
        s.userAction();
        ATMCenter.userAction();
    }
}