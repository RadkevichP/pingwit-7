package pl.pingwit.lec_31.point_2;


import java.util.Objects;

public class AccountThread extends Thread {

    private Object lock = new Object();
    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            synchronized (accountFrom) {
                synchronized (accountFrom) {
                    if (accountFrom.withDraw(10)) {
                        accountTo.add(10);
                    }
                }
            }
        }
    }
}
