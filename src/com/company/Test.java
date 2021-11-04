package com.company;

public class Test {
    public static void main(String[] args) {

        Account a = new Account(0);
        a.deposit(1500);
        a.withdraw(1200);
        Customer c = new Customer("Alisson","Brandi",a);

        Account a2 = new Account(0);
        a2.deposit(1500);
        a2.withdraw(1700);

        Customer c2 = new Customer("Evelin","Brandi",a2);

        System.out.println("Mi nombre completo es: " + c.getFirstName() + " " + c.getLastName());
        System.out.println("Y mi balance es: " + a.getBalance());
        System.out.printf(" ");
        System.out.println("Mi nombre completo es: " + c2.getFirstName() + " " + c2.getLastName());
        System.out.println("Y mi balance es: " + a2.getBalance());

    }
}
