package com.company;

import Account.*;
import Bank.Bank;
import Bank.Client;
import BankTools.DebitCard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Client cliff = new Client("Cliff", "Choiniere", "555", "1 chestnut");

        Bank ourBank = new Bank("Coders Credit Union", "Dev Island");

        ourBank.addClient("Cliff", "Choiniere", "555", "1 chestnut");
        ourBank.addClient("Will", "Brown", "1337");

        System.out.println(ourBank.displayClients());

        // instantiate a Ui and then call create Account to create a checking account.

    }
}
