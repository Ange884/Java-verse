package lala;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

 public class MultiThreadingQuestion {

    // ==============================
    // BANK ACCOUNT CLASS
    // ==============================
    static class BankAccount {
        private int balance = 0;
        private final int MAX_BALANCE;
        private final AtomicInteger totalTransactions;
        private final int LIMIT;

        public BankAccount(int maxBalance, AtomicInteger counter, int limit) {
            this.MAX_BALANCE = maxBalance;
            this.totalTransactions = counter;
            this.LIMIT = limit;
        }

        // ----------------------------
        // DEPOSIT METHOD
        // ----------------------------
        public synchronized void deposit(int amount) throws InterruptedException {
            // Wait if deposit would exceed MAX_BALANCE
            while (balance + amount > MAX_BALANCE && totalTransactions.get() < LIMIT) {
                wait();
            }

            if (totalTransactions.get() >= LIMIT) return;

            balance += amount;
            totalTransactions.incrementAndGet();

            System.out.println(Thread.currentThread().getName() +
                    " DEPOSITED: " + amount +
                    " | BALANCE = " + balance);

            notifyAll();  // wake up all threads
        }

        // ----------------------------
        // WITHDRAW METHOD
        // ----------------------------
        public synchronized void withdraw(int amount) throws InterruptedException {
            // Wait if not enough money to withdraw
            while (balance < amount && totalTransactions.get() < LIMIT) {
                wait();
            }

            if (totalTransactions.get() >= LIMIT) return;

            balance -= amount;
            totalTransactions.incrementAndGet();

            System.out.println(Thread.currentThread().getName() +
                    " WITHDREW: " + amount +
                    " | BALANCE = " + balance);

            notifyAll();  // wake up all threads
        }
    }

    // ==============================
    // DEPOSITOR THREAD
    // ==============================
    static class Depositor extends Thread {
        private final BankAccount account;
        private final Random random = new Random();

        public Depositor(BankAccount acc, String name) {
            super(name);
            this.account = acc;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    int amount = 10 + random.nextInt(91);  // 10–100
                    account.deposit(amount);

                    Thread.sleep(100); // readability only
                }
            } catch (InterruptedException e) {
                // Thread ends
            }
        }
    }

    // ==============================
    // WITHDRAWER THREAD
    // ==============================
    static class Withdrawer extends Thread {
        private final BankAccount account;
        private final Random random = new Random();

        public Withdrawer(BankAccount acc, String name) {
            super(name);
            this.account = acc;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    int amount = 10 + random.nextInt(71);  // 10–80
                    account.withdraw(amount);

                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                // Thread ends
            }
        }
    }

    // ==============================
    // MAIN METHOD
    // ==============================
    public static void main(String[] args) throws InterruptedException {

        final int TOTAL_LIMIT = 30;  // total successful transactions allowed
        AtomicInteger counter = new AtomicInteger(0);

        BankAccount account = new BankAccount(500, counter, TOTAL_LIMIT);

        // Create threads
        Thread d1 = new Depositor(account, "Depositor-1");
        Thread d2 = new Depositor(account, "Depositor-2");
        Thread w1 = new Withdrawer(account, "Withdrawer-1");
        Thread w2 = new Withdrawer(account, "Withdrawer-2");

        // Start threads
        d1.start();
        d2.start();
        w1.start();
        w2.start();

        // Wait until all transactions are completed
        while (counter.get() < TOTAL_LIMIT) {
            Thread.sleep(200);
        }

        // Stop all threads safely
        d1.interrupt();
        d2.interrupt();
        w1.interrupt();
        w2.interrupt();

        // Join threads
        d1.join();
        d2.join();
        w1.join();
        w2.join();

        System.out.println("\n=== FINISHED: TOTAL OPERATIONS = " + counter.get() + " ===");
    }
}
