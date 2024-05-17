package exercises.oop.javaBank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(1523, "Arianna Costanzo");
        System.out.println(account1);

        //Il codice conto sia accessibile solo in lettura
        System.out.println("Numero conto: " + account1.getAccountNumber());
        // il proprietario sia accessibile in lettura e in scrittura
        System.out.println("Nome proprietario precedente: " + account1.getAccountOwnerName());
        account1.setAccountOwnerName("Pippo Paperino");
        System.out.println("Nome proprietario successivo: " + account1.getAccountOwnerName());
        // il saldo sia accessibile solo in lettura
        System.out.println("Saldo del conto: " + account1.getAccountBalance());

        //siano presenti un metodo per versare una somma di denaro sul conto
        account1.deposit(120.50);
        System.out.println(account1.getAccountBalance());

        // e uno per prelevare una somma di denaro dal conto (attenzione: il saldo non può mai diventare negativo)
        account1.withdraw(200); //questo non funziona
        account1.withdraw(10.5); //questo si
        System.out.println(account1.getAccountBalance());

        //altri metodi per ritornare le informazioni del conto
        System.out.println(account1.getAccountInfo());

        // saldo formattato
        System.out.println(account1.getFormattedBalance());

        //ora chiediamo all'utente di creare un proprio conto bancario

        Scanner scanner = new Scanner(System.in);

        int userAccountNumber;
        String userName;
        System.out.println("Inserisci il tuo nome: ");
        userName = scanner.nextLine();
        Random random = new Random();
        BankAccount userAccount = new BankAccount(random.nextInt(1,1000), userName);
        System.out.println(userAccount.getAccountInfo());


        while(true) {
            System.out.println("*************************************");
            System.out.println("Il tuo saldo attuale è: " + userAccount.getFormattedBalance());
            System.out.println("Scegli l'operazione: ");
            System.out.println("Versare una somma (Scrivi 1); ");
            System.out.println("Prelevare una somma (Scrivi 2); ");
            System.out.println("Esci (Scrivi 0)");
            String option = scanner.nextLine();



            if (option.equals("0")) {
                break;
            } else if (option.equals("1")) {
                System.out.println("Quanto vuoi depositare?");
                double depositValue = Double.parseDouble(scanner.nextLine());

                if(depositValue >= 0 ) {
                    userAccount.deposit(depositValue);
                    System.out.println(String.format("Hai depositato: %.2f€. ", depositValue));
                } else {
                    System.out.println(String.format("L'operazione non è andata a buon fine, %.2f non è un numero valido. ", depositValue));
                }

            } else if (option.equals("2")) {
                System.out.println("Quanto vuoi prelevare?");
                double withdrawValue = Double.parseDouble(scanner.nextLine());

                if(withdrawValue >= 0 ) {
                    if(withdrawValue >= userAccount.getAccountBalance()) {
                        System.out.println("Errore, non hai abbastanza soldi sul conto");
                    } else {
                        userAccount.withdraw(withdrawValue);
                        System.out.println(String.format("Hai prelevato: %.2f€. ", withdrawValue));
                    }
                } else {
                    System.out.println(String.format("L'operazione non è andata a buon fine, %.2f non è un numero valido. ", withdrawValue));
                }
            }

        }



        scanner.close();

    }
}

