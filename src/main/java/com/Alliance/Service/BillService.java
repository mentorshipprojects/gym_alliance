package com.Alliance.Service;

import com.Alliance.Domaine.Bill;
import com.Alliance.Domaine.Client;
import com.Alliance.Domaine.Product;

import java.util.Scanner;

/**
 * Created by ivan on 28.02.17.
 */
public class BillService {
    public void fillingBill() {

        int f=0;
        Bill bill[] = new Bill[100];

        do {
            String nameProductBill;
            int priceProductBill;

            boolean errId = false;
            do {
                System.out.print("Введіть номер вибраного продукту: ");
                Scanner scanIdProduct = new Scanner();
                System.out.println();
                if (CheckService.isTextNumber(scanIdProduct)) {
                    nameProductBill = product[scanIdProduct.nextInt()].getNameProduct();
                    priceProductBill = product[scanIdProduct.nextInt()].getPriceProduct();
                } else {
                    System.out.print(" Ви ввели не ціле число.");
                    errId = true;
                }
            } while (errId);

            boolean errQuantity = false;
            do {
                System.out.print("Введіть кількість вибраного продукту: ");
                Scanner quantityProductBill = new Scanner();
                System.out.println();
                if (CheckService.isTextNumber(quantityProductBill)) {
                    //заповнення рахунку за допомогою конструктора
                    bill[f] = new Bill(nameProductBill, priceProductBill, quantityProductBill.nextInt());
                } else {
                    System.out.print(" Ви ввели не ціле число.");
                    errQuantity = true;
                }
            } while (errQuantity);

            f++;
        } while (CheckService.areWeContinue());

        //записуємо кількість позицій в рахунку
        Bill.setCountBill(f);
    }


    public void billPrint() {
        int sum = 0;
        System.out.println(Bill.getClientBill()+", Ви вибрали: ");
        for (int p = 0; p < Bill.getCountBill(); p++) {
            int quantity = Bill[p].getQuantityProduct();
            int price = Bill[p].getPriceBillProduct();
            sum += quantity * price;
            System.out.println(p+1 +". " + Bill[p].getNameProductBill() + " " + quantity + " = " + quantity * price);
        }
        System.out.println("---------------------------------");
        System.out.println("Загальна сума складає: "+sum);

        if (DiscountService.hasClientDiscount()) {
            double persentDiscount = DiscountService.getDiscount()/100;
            double finalSum = sum * persentDiscount;
            System.out.println("Ваша знижка складає : " + DiscountService.getDiscount() + "%");
            System.out.println("---------------------------------");
            System.out.println("Сума до оплати: "+finalSum);
        }
    }
}
