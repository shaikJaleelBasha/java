public class Test  extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("running");


        try {
            Thread.sleep(2000);
            System.out.println("sleeping time out");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {


//        World world = new World();
//        Thread thread = new Thread(world);
//        thread.start();
        Test t1 = new Test();
        System.out.println(t1.getState());
        t1.start();


        System.out.println(t1.getState());
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());










    }
}
