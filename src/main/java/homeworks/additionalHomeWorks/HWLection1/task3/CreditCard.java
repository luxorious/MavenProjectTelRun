package homeworks.additionalHomeWorks.HWLection1.task3;

import java.util.Scanner;

public class CreditCard {
    private long cardNumber;
    private int pinCode;
    private double balance = 0.0;
    private double creditLimit = 0.0;
    private double loanDebt = 0.0;

    public CreditCard(long cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public void deposit(double inputMoney){
        if (inputPin()) {
            if(this.loanDebt < 0){
                this.loanDebt+=inputMoney;
                if (this.loanDebt > 0){
                    this.balance+=this.loanDebt;
                    this.loanDebt = 0.0;
                    showBalance();
                }
            } else {
                this.balance+=inputMoney;
                showBalance();
            }
        } else {
            System.out.println("Wrong pin!");
        }
    }

    public void withdraw(Double cashWithdrawal) {
        if (inputPin()) {
            double allMoney = this.balance + this.creditLimit - this.loanDebt;
            if(cashWithdrawal > allMoney){
                System.out.printf("You have no %.2f on your count\n" +
                        "total sum which you can use - %.2f", cashWithdrawal, allMoney);
                showBalance();
            } else {
                this.balance -= cashWithdrawal;
                if(this.balance < 0){
                    this.loanDebt -= this.balance;
                    this.balance = 0.0;
                }
                showBalance();
            }
        }
    }

    private boolean inputPin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Pin!");
        int pinInput = scanner.nextInt();
        if(pinInput == this.pinCode) {
            return true;
        }
        return false;
    }

    private void showBalance(){
        System.out.printf("\nBalance - %.2f;\nloanDebt - %.2f;" +
                        "\ncreditLimit - %.2f.\n",
                        balance, loanDebt, creditLimit);
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

}
