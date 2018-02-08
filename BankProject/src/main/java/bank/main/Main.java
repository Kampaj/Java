package bank.main;


import bank.controllers.BankService;


public class Main {

    public static void main(String[] args) {
        BankService bankController = BankService.getInstance();
        do {
        } while (bankController.bankMenu());
    }
}
