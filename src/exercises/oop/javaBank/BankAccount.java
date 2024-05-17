package exercises.oop.javaBank;

public class BankAccount {

    //attributi
    private int accountNumber;
    private String accountOwnerName;
    private double accountBalance;

    //costruttori
    public BankAccount(int accountNumber, String accountOwnerName) {
        this.accountNumber = accountNumber;
        this.accountOwnerName = accountOwnerName;
        this.accountBalance = 0;
    }

    //metodi

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountOwnerName='" + accountOwnerName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    public void deposit(double sum) {
        accountBalance += sum;
    }

    public void withdraw(double sum) {
        if (sum > accountBalance) {
            System.out.println("Errore, non hai abbastanza soldi nel conto");
        }  else {
            accountBalance -= sum;
        }
    }

    public String getAccountInfo() {
        return String.format("Il conto numero %d di %s ha un bilancio di: %.2f€", accountNumber, accountOwnerName, accountBalance);
    }

    public String getFormattedBalance() {
        return String.format("%.2f€", accountBalance);
    }

    //getter e setter


    public int getAccountNumber() {
        return accountNumber;
    }


    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }


}
