

// diff between demon and norm thread
public class DemonThread  extends Thread{
    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName());
        while(true){
            System.out.println("running");
        }
    }

    public static void main(String[] args) {


        DemonThread demonThread = new DemonThread();
        DemonThread t2 = new DemonThread();
        System.out.println(Thread.currentThread().getName());
        demonThread.setDaemon(true);
        demonThread.start();
        t2.start();
        System.out.println("Main done");

    }
}
