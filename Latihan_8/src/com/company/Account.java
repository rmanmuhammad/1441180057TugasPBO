package com.company;

/**
 * Created by User on 17/06/2015.
 */
public class Account {

    private double saldo;
    private double hasil=0;

    public Account() {
    }


    public Account(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tarik(double tarik) {
        this.saldo = saldo - tarik;
    }

    public void setor(double setor){
        this.saldo = saldo + setor;
    }

    @Override
    public String toString() {
        return "Account{" +
                "saldo=" + saldo +
                '}';
    }


}