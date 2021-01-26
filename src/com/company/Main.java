package com.company;

import Account.*;
import Bank.Bank;
import Bank.Client;
import BankTools.Chaos;
import BankTools.Console;
import BankTools.DebitCard;
import BankTools.Ui;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Ui console = new Console();
        Bank ourBank = new Bank("Cliff Trust", "GoodTown");
        ourBank.addClient("Jim", "McGee", "5555");

        ourBank.addAccount(10000, 1, "checking", console);
        ourBank.addAccount( 4000, 1, "savings", console);

        ourBank.addClient("Elaine", "Froehlich", "1234");

        ourBank.addAccount(15000, 2, "savings", console);
        ourBank.addAccount(3000, 2, "checking", console);

        System.out.println(ourBank.displayClients());

    }
}
