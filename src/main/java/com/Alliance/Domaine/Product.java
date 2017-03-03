package com.Alliance.Domaine;

/**
 * Created by ivan on 18.02.17.
 */
public class Product {

    private static int lengthProduct;

    private int idProduct;
    private String nameProduct;
    private int priceProduct;

    //тимчасовий метод, що визначає кількість продуктів у прайсі
    public static void setLengthProduct(int lengthProduct) {
        this.lengthProduct = lengthProduct;
    }

    //тимчасовий метод, що повертає кількість продуктів у класі
    public static int getLengthProduct() {
        return lengthProduct;
    }

    //constructor
    public Product(int idProduct, String nameProduct, int priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    //getters
    public int getPriceProduct() {
        return priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

}
