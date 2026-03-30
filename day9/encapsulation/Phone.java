package day9.encapsulation;

public class Phone {

    private String model;
    private double price;


    public Phone(String model, double price) {
        this.price = price;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }





}
