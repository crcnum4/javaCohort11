package com.company;

import Account.*;
import Bank.Bank;
import Bank.Client;
import BankTools.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Ui console = new Chaos();
        Bank ourBank = new Bank("Cliff Trust", "GoodTown");
        ourBank.addClient("Jim", "McGee", "5555");

        ourBank.addAccount(10000, 1, "checking", console);
        ourBank.addAccount( 4000, 1, "savings", console);

        ourBank.addClient("Elaine", "Froehlich", "1234");

        ourBank.addAccount(15000, 2, "savings", console);
        ourBank.addAccount(3000, 2, "checking", console);

        ourBank.addDebitCard(1, "1");
        ourBank.addDebitCard(2, "3");
        System.out.println(ourBank.displayClients());


    }
}
