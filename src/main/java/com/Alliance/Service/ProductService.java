package com.Alliance.Service;

import com.Alliance.Domaine.Client;
import com.Alliance.Domaine.Product;

/**
 * Created by ivan on 28.02.17.
 */
public class ProductService {

    public void productFilling() {
        Product listProduct[] = new Product[14];
        listProduct[0] = new Product(1, "Абонемент на регулярне відвідування залу (зранку до 16.00) 12 разів", 390);
        listProduct[1] = new Product(2, "Абонемент на регулярне відвідування залу (весь день) 12 разів", 420);
        listProduct[2] = new Product(3, "Абонемент на регулярне відвідування залу (зранку до 16.00) цілий місяць безлім", 450);
        listProduct[3] = new Product(4, "Абонемент на регулярне відвідування залу (весь день) цілий місяць безлім", 490);
        listProduct[4] = new Product(5, "Особистий тренер 12 занять", 800);
        listProduct[5] = new Product(6, "Загалтний масаж", 200);
        listProduct[6] = new Product(7, "Сауна", 400);
        listProduct[7] = new Product(8, "Солярій", 150);
        listProduct[8] = new Product(9, "Кросфіт", 30);
        listProduct[9] = new Product(10, "Йога", 35);
        listProduct[10] = new Product(11, "Відвідування залу", 35);
        listProduct[11] = new Product(12, "Рушник", 5);
        listProduct[12] = new Product(13, "Одноразові тапочки", 5);
        listProduct[13] = new Product(14, "Фреш", 50);
        int l=listProduct[].length();
        Product.setLengthProduct(l);
    }

    public static void printProductList() {
        for (int g=0; g<Product.getLengthProduct(); g++) {
            int a = listProduct[g].getIdProduct();
            String b = listProduct[g].getNameProduct();
            int c = listProduct[g].getPriceProduct();
            System.out.print(a + ". " + b + " - " + c + "\n");  //print product's parameters
        }
    }

}
