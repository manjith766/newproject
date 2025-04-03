package com.neoteric.Banking;

public  abstract class Transfer {
    public abstract String getType();
    public abstract boolean isValidAmount(double amount);
    public abstract double getCharges(double amount);


    public boolean process(Account from,Account to,double amount) {
        double charges = getCharges(amount);
        double totalDebit = amount + charges;
        if (!isValidAmount(amount)) {
            System.out.println(getType() + "failed amount " + amount + "exceeds transcation limit");
            return false;
        }

        if (from.getBalance() < amount) {
            System.out.println(getType() + "failed: insufficient balance(need" + totalDebit + ").");
            return false;

        }
        from.withdrawl(totalDebit);
        to.deposit(amount);
        System.out.printf( "sucess: ",getType(), amount, from.getAccountNo(), to.getAccountNo(), charges);
        return true;
    }

}
