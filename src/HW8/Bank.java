package HW8;

class Account {
    int balance = 0;

    // 存款存入
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("媽媽存入 " + amount + "，目前餘額: " + balance);
        notifyAll(); // 通知正在等待領錢的人
    }

    // 提款
    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                System.out.println("餘額不足，兒子等待中...");
                wait(); // 錢不夠，進入等待狀態
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("兒子領走 " + amount + "，目前餘額: " + balance);
    }
}

class Me extends Thread {
    Account account;
    Me(Account acc) { this.account = acc; }

    public void run() {
        for (int i = 0; i < 3; i++) {
            account.withdraw(1000);
        }
    }
}

class Mom extends Thread {
    Account account;
    Mom(Account acc) { this.account = acc; }

    public void run() {
        for (int i = 0; i < 2; i++) {
            account.deposit(2000);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Account sharedAccount = new Account();
        Thread me = new Me(sharedAccount);
        Thread mom = new Mom(sharedAccount);

        me.start();
        mom.start();
    }
}