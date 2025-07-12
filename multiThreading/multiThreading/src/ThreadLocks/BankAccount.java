package ThreadLocks;

public class BankAccount extends Thread {
    private  int balance=100;

    public synchronized void withDraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempt to with draw ->"+amount);
        if(amount<=balance){
            System.out.println(Thread.currentThread().getName()+" proceeding to withdraw");
            try {
                Thread.sleep(2000);
            }catch (Exception e){

            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName()+"Transaction sucessfull your current balance is -> "+balance);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" insuffinet amount to with draw your balance is"+balance);
        }
    }
}
