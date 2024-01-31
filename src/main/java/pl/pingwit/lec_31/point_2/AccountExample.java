package pl.pingwit.lec_31.point_2;


public class AccountExample {

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(20000);
        Account account2 = new Account(20000);

        AccountThread accountThread = new AccountThread(account, account2);
        AccountThread accountThread2 = new AccountThread(account2, account);

        accountThread.start();
        accountThread2.start();

        System.out.println(String.format("First thread state: %s", accountThread.getState()));
        System.out.println(String.format("Second thread state: %s", accountThread2.getState()));

        accountThread.join();
        accountThread2.join();

        System.out.println(account);
        System.out.println(account2);

    }
}
