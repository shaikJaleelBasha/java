public class YieldThread extends Thread {

    YieldThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" hello world");
            Thread.yield();
        }
    }

    public static void main(String[] args) {

        YieldThread yieldThread1 = new YieldThread("t1");
        YieldThread yieldThread2 = new YieldThread("t2");
        YieldThread yieldThread3 = new YieldThread("t3");

        yieldThread1.start();
        yieldThread2.start();
        yieldThread3.start();
    }
}
