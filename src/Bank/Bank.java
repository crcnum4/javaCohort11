package Bank;

import Account.Account;
import Account.CheckingAccount;
import Account.SavingAccount;
import BankTools.Ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bank {
    private String name;
    private int onHandCash;
    private String city;
    private HashMap<Integer, Client> clients = new HashMap<Integer, Client>();
    private List<Account> accounts = new ArrayList<Account>();
    private int clientCount = 0;
    // list of accounts?

    //create the bank.
    public Bank(String name, String city) {
        this.name = name;
        this.city = city;
        this.onHandCash = 100000000;
    }

    //add client
    public void addClient(String firstName, String lastName, String ssn, String address) {
        Client newClient  = createClient(firstName, lastName, ssn, address);
        clients.put(newClient.getClientID(), newClient);
    }

    public void addClient(String firstName, String lastName, String ssn ) {
        Client newClient  = createClient(firstName, lastName, ssn, this.city);
        clients.put(newClient.getClientID(), newClient);
    }

    private Client createClient(String firstName, String lastName, String ssn, String address) {
        return new Client(firstName, lastName, ssn, address, ++clientCount);
    }

    //display clients
    public String displayClients() {
        String output = name + " clients:\n";
        //logic
        for (var client : clients.values()) {
            output += client.getName() + "\n" + client.displayAccounts() + "\n";
        }
        return output;
    }

    public void addAccount(int balance, int ownerId, String accountType, Ui ui) {
        Client client = clients.get(ownerId);
        Account newAccount = createAccount(balance, client.getName(), accountType, ui);
        accounts.add(newAccount);
        client.addAccount(newAccount);
    }

    //Create Account
    private Account createAccount(int balance, String owner, String accountType, Ui ui) {
        switch (accountType) {
            case "checking":
                return new CheckingAccount(
                        balance,
                        owner,
                        Integer.toString(accounts.size() + 1),
                        ui.getNumber(
                                "What is this clients Daily limit? " + 20 + " - " + balance,
                                20,
                                balance
                        )
                );
            case "savings":
                return new SavingAccount(
                        balance,
                        owner,
                        Integer.toString(accounts.size() + 1),
                        ui.getNumber("Savings Interest rate 3% to 10%? ", 3, 10)
                );
            default:
                System.out.println("ERROR: Invalid Account Type");
                return null;
        }
    };

    public void addDebitCard() {
        return;
    };

    public void createDebitCard() {
        return;
    }

}
