package com.neoteric.bank;


public class test {
    public static void main(String[] args) {
        Account account;
        Coustmer coustmer;
        Nominee nominee;
        Balance balance;
        Address address;
        AccountService accountService = new AccountService();
        Address address1 = new Address("kphb","hyd","india","500034","2233");
       Coustmer coustmer1 = new Coustmer("ram","9989950321","223355","88558",address1);
       account= accountService.populateaccount(coustmer1);
        Account account1 = accountService.populateaccount(coustmer1);
        System.out.println(account1);
        System.out.println("Account created with Account No: " + account.getAccountno());


        // Depositing money
        accountService.deposit(account.getAccountno(), 10000);
        System.out.println("Deposited 10000. Current Balance: " + accountService.balancedata.get(account.getAccountno()).getBalance());

        // Withdrawing money
        boolean success = accountService.balancedata.get(account.getAccountno()).withdraw(11000);
        if (success) {
            System.out.println("Withdrawal successful. Current Balance: " + accountService.balancedata.get(account.getAccountno()).getBalance());
        } else {
            System.out.println("Withdrawal failed due to insufficient balance.");
        }

        // Checking balance
        System.out.println("Final Balance: " + accountService.balancedata.get(account.getAccountno()).getBalance());
    }
}


