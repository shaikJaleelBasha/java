
//this code is for thread priority checking
public class MyThread extends Thread {
    public  MyThread(String name){
        super(name);
    }
    @Override
    public void run() {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 1000000; j++) {
                String s ="";

        }
            System.out.println(Thread.currentThread().getName()+" Priority -"+Thread.currentThread().getPriority()+" count -"+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread l = new MyThread("low priority");
         MyThread m = new MyThread("medium priority");
          MyThread h = new MyThread("high priority");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();
    }
}
