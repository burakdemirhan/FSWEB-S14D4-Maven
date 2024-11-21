package org.example.model;

public abstract class ProductForSale {
    private String type;
    private int price;
    private String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

  public int getSalesPrice(int quantity){
        return price * quantity;
  }

  public abstract void showDetails();
}