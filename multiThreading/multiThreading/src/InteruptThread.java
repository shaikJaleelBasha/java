

//use of Interupt thread
public class InteruptThread extends Thread {

    @Override
    public void run() {
        System.out.println("thread is running");
        try {
            Thread.sleep(1000);
            for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {

        InteruptThread inThread = new InteruptThread();
        System.out.println(inThread.getName());
        inThread.start();
        inThread.interrupt();
        System.out.println("thread completed");
//        inThread.interrupt();

    }
}
