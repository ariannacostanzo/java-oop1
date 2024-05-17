package exercises.oop.javaShop;

import java.util.Random;

public class Product {

    //attributi
    private int code;
    private String name;
    private String description;
    private double price;
    private int vat;

    //costruttore
    public Product(int vat, String name, String description, double price) {
        code = getRandom();
        this.vat = (vat > 0) ? vat : 22;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    //metodi

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }

    public double getVatPrice() {
        double vatPrice = ((price * vat) / 100) + price;
        return Math.round(vatPrice * 100.0) / 100.0;
    }

    //metodi di servizio
    private int getRandom() {
        Random random = new Random();
        return random.nextInt(1, 999999);
    }

    //getter e setter


    public String getName() {
        return code + "-" + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return String.format("%06d", code);

    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }
}
