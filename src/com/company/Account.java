package com.company;

public class Account {

    private double Balance;

    public Account(double balance) {
        Balance = balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double deposit(double monto){
        this.Balance = this.Balance+monto;
        return this.Balance;
    }

    public double withdraw(double monto){
        if(monto>this.Balance){
            return this.Balance;
        }else{
            Balance = this.Balance-monto;
            return this.Balance;
        }
    }

}
