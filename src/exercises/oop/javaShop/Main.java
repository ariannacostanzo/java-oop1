package exercises.oop.javaShop;

public class Main {
    //supermercato
    public static void main(String[] args) {


        Product product1 = new Product(5, "Svelto", "Sapone per piatti", 2.99);
        //il codice è un numero randomico tra 1 e 99
        System.out.println(product1);

        //il codice prodotto sia accessibile solo in lettura e deve essere restituito come Stringa con un padleft a 6 caratteri (es. codice 15->“000015")
        String product1Code = product1.getCode();
        System.out.println("Codice del prodotto: " + product1Code);

        // il prodotto esponga un metodo per avere il prezzo base
        double product1basePrice = product1.getPrice();
        System.out.println("Prezzo base: " + product1basePrice);

        // il prodotto esponga un metodo per avere il prezzo comprensivo di iva
        double product1vatPrice = product1.getVatPrice();
        System.out.println("Prezzo comprensivo del " + product1.getVat() + "% di iva: " + product1vatPrice );

        //il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
        String product1Name = product1.getName();

        //prodotto 2
        Product product2 = new Product(22, "Dash", "Detersivo lavatrice", 5.49);
        //il codice è un numero randomico tra 2 e 99
        System.out.println(product2);

        //il codice prodotto sia accessibile solo in lettura e deve essere restituito come Stringa con un padleft a 6 caratteri (es. codice 25->“000025")
        String product2Code = product2.getCode();
        System.out.println("Codice del prodotto: " + product2Code);

        // il prodotto esponga un metodo per avere il prezzo base
        double product2basePrice = product2.getPrice();
        System.out.println("Prezzo base: " + product2basePrice);

        // il prodotto esponga un metodo per avere il prezzo comprensivo di iva
        double product2vatPrice = product2.getVatPrice();
        System.out.println("Prezzo comprensivo del " + product2.getVat() + "% di iva: " + product2vatPrice );

        //il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
        String product2Name = product2.getName();
        System.out.println("Nome del prodotto: " + product1Name);
    }
}
