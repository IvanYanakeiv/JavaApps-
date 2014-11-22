/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class Account {

    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }

    public void credit(double amaount) {
        if (amaount > 0.0) {
            balance = balance + amaount;
        }
    }

    public void debit(double amaount) {
        if (amaount > 0.0 && balance > amaount) {
            balance = balance - amaount;

        }
    }

    public double getBalance() {
        return balance;
    }
}

