package com.Alliance;

import com.Alliance.Domaine.Bill;
import com.Alliance.Service.BillService;
import com.Alliance.Service.ClientService;
import com.Alliance.Service.ProductService;

import static com.Alliance.Service.ClientService.*;
import static com.Alliance.Service.ProductService.*;


/**
 * Created by ivan on 18.02.17.
 */
public class Launcher {

    public static void main(String[] args) {

        ClientService.clientFilling();  //filling client base
        ProductService.productFilling();    //filling product base

        clientChoose();   //choose client by id

        printProductList();  //print list of product
        BillService.fillingBill();

        BillService.billPrint();
    }
}
