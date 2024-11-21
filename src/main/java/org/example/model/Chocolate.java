package org.example.model;

public class Chocolate extends ProductForSale{

    public Chocolate(String type, int price, String description) {
        super(type, price, description);

    }



    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public int getSalesPrice(int quantity) {
        return super.getSalesPrice(quantity);
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());

    }
}
