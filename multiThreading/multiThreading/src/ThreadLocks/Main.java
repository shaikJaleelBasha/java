package ThreadLocks;

public class Main {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withDraw(50);
            }
        };
        Thread t1 = new Thread("Thread1");
        Thread t2 = new Thread("Thread1");

        t1.start();
        t2.start();

    }
}
