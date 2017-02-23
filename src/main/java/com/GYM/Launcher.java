package com.GYM;

import com.GYM.Domaine.Client;
import com.GYM.Domaine.PriceList;

import java.util.Scanner;

/**
 * Created by ivan on 18.02.17.
 */
public class Launcher {

    public static void main(String[] args) {

        PriceList listPrice[] = new PriceList[14];
        listPrice[0]=new PriceList("Абонемент на регулярне відвідування залу (зранку до 16.00) 12 разів", 390);
        listPrice[1]=new PriceList("Абонемент на регулярне відвідування залу (весь день) 12 разів", 420);
        listPrice[2]=new PriceList("Абонемент на регулярне відвідування залу (зранку до 16.00) цілий місяць безлім",450);
        listPrice[3]=new PriceList("Абонемент на регулярне відвідування залу (весь день) цілий місяць безлім", 490);
        listPrice[4]=new PriceList("Особистий тренер 12 занять", 800);
        listPrice[5]=new PriceList("Загалтний масаж", 200);
        listPrice[6]=new PriceList("Сауна", 400);
        listPrice[7]=new PriceList("Солярій", 150);
        listPrice[8]=new PriceList("Кросфіт", 30);
        listPrice[9]=new PriceList("Йога", 35);
        listPrice[10]=new PriceList("Відвідування залу", 35);
        listPrice[11]=new PriceList("Рушник", 5);
        listPrice[12]=new PriceList("Одноразові тапочки", 5);
        listPrice[13]=new PriceList("Фреш", 50);

        Client client[] = new Client[4];
        client[0] = new Client("Жирик І.В.", 29, "07.07.1987", "Івано-Франківськ", "чоловік");
        client[1] = new Client("Клон П.В.", 30, "01.02.1987", "Івано-Франківськ", "чоловік");
        client[2] = new Client("Ружицька Г.І.", 29, "09.12.1987", "Чікаго", "жінка");
        client[3] = new Client("Іванова І.І.", 20, "08.03.1996", "Львів", "жінка");

        int clientId;

        System.out.print("Доброго дня. Введіть номер катртки клієнта: ");
        Scanner scan1 = new Scanner(System.in);
        //scan1.checkClient();
        clientId = scan1.nextInt()-1;
        System.out.println(client[clientId].getName()+", для Вас доступні наступні послуги та товари:");
        int k=0;
        while (k<PriceList.getCountList()) {
            k++;
            System.out.println(listPrice[k].getIdList()+". "+listPrice[k].getNameList()+" - "+listPrice[k].getPriceList()+" грн.");
        }

        System.out.println("Далі ще буде :) Програміст в роботі...");
        //System.out.println();
        //System.out.println("name: "+client[0].getName());
        //System.out.println("client count = "+Client.getCount());
    }
}
