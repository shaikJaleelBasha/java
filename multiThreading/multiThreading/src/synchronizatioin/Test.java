package synchronizatioin;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread myThread1 = new MyThread(counter);
        MyThread myThread2 = new MyThread(counter);

        myThread2.start();
        myThread1.start();


        try{
            myThread1.join();
            myThread2.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println(counter.getCount());


    }
}
