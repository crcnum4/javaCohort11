package com.company;

import Account.*;
import Bank.Client;
import BankTools.DebitCard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Client cliff = new Client("Cliff", "Choiniere", "555", "1 chestnut");

        cliff.addAccount(new CheckingAccount(1000, "Cliff", "1234", 500));
        cliff.addAccount(new SavingAccount(3000, "Pao", "5543", 5));
        cliff.addAccount(new InvestmentAccount(10000, "Cliff", "9987", 8));

        System.out.println(cliff.displayAccounts());
        System.out.println();
        cliff.withdrawAccount("5543", 745);
        cliff.withdrawAccount("1234", 387);
        cliff.withdrawAccount("9987", 100);
        System.out.println(cliff.displayAccounts());

        cliff.addDebitCard("1234");

        System.out.println(cliff.displayAccounts());

    }
}
