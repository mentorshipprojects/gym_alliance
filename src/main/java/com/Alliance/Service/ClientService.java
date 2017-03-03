package com.Alliance.Service;

import com.Alliance.Domaine.Bill;
import com.Alliance.Domaine.Client;

import java.util.Scanner;

import static com.Alliance.Domaine.Bill.*;


/**
 * Created by ivan on 28.02.17.
 */
public class ClientService {

    private int mainIdClient;
    private boolean err = false;

    public void clientFilling() {
        Client client[] = new Client[4];
        {
            client[0] = new Client("Жирик І.В.", 29, "07.07.1987", "Івано-Франківськ", "чоловік");
            client[1] = new Client("Клон П.В.", 30, "01.02.1987", "Івано-Франківськ", "чоловік");
            client[2] = new Client("Ружицька Г.І.", 29, "09.12.1987", "Чікаго", "жінка");
            client[3] = new Client("Іванова І.І.", 20, "08.03.1996", "Львів", "жінка");
        }
        int g = client[].length();
        Client.setCountClient(g);
    }

    public static void clientChoose() {

        boolean errClient = false;
        do {
            System.out.println("Введіть номер клієнта: ");
            Scanner scanClientId = new Scanner(System.in);
            System.out.println();
            if (CheckService.isTextNumber(scanClientId)) {
                int id = scanClientId.nextInt();
                Bill.setClientBill(Client[id].getName());
            } else {
                System.out.print(" Ви ввели не вірний номер. Спробуйте ще раз.");
                errClient = true;
            }
        }while (errClient);

        System.out.println("Вітаємо "+Bill.getClientBill());
    }
}
