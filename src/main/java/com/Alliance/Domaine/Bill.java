package com.Alliance.Domaine;

/**
 * Created by ivan on 21.02.17.
 */
public class Bill {

    private static int countBill;

    private String clientBill;
    private int quantityProduct;
    private int priceBillProduct;
    private String nameProductBill;

    //constructor
    public Bill(String nameProductBill, int priceBillProduct, int quantityProduct) {
        this.nameProductBill = nameProductBill;
        this.priceBillProduct = priceBillProduct;
        this.quantityProduct = quantityProduct;
    }

    //setters
    public void setClientBill(String clientBill) {
        this.clientBill = clientBill;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public void setPriceBillProduct(int priceBillProduct) {
        this.priceBillProduct = priceBillProduct;
    }

    public void setNameProductBill(String nameProductBill) {
        this.nameProductBill = nameProductBill;
    }

    public void setCountBill(int countBill) {
        this.countBill=countBill;
    }

    //getters
    public String getClientBill() {
        return clientBill;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public int getPriceBillProduct() {
        return priceBillProduct;
    }

    public static int getCountBill() {return countBill;}

    public String getNameProductBill() {
        return nameProductBill;
    }
}
