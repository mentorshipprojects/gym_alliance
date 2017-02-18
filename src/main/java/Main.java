import java.util.Scanner;

/**
 * Created by ivan on 14.02.17.
 */
class Main {
    //оголошення змінних для лічильника клієнтів
    public int id;
    public static int count=0;

    //оголошення змінних для клієнта
    public int _age;
    public String _name, _birthday, _town, _sex;

    //конструктор для прискоренного введення клієнта з лічильником
    public Main (String name, Integer age, String birthday, String town, String sex) {
        _name = name;
        _age = age;
        _birthday = birthday;
        _town = town;
        _sex = sex;

        count++;
        id=count;
    }

    //оголошення змінних для лічильника послуг та товарів
    public int idList;
    public static int countList=0;

    //оголошення змінних для меню
    public String nameList;
    public int priceList;

    //конструктор для прискореного введення товару та послуг (з лічильником)
    public Main (String name2, int price) {
        nameList = name2;
        priceList = price;

        countList++;
        idList = countList;
    }

    //оголошення змінних чеку
    public int _priceBill, _quantityBill;

    //конструктор введення товарів у чек
    public Main (int priceBill, int quantityBill) {
        _priceBill = priceBill;
        _quantityBill = quantityBill;
    }

    public static void main(String[] args) {

        //введення даних клієнтів
        Main client[] = new Main[4];
        client[0] = new Main("Жирик І.В.", 29, "07.07.1987", "Івано-Франківськ", "чоловік");
        client[1] = new Main("Клон П.В.", 30, "01.02.1987", "Івано-Франківськ", "чоловік");
        client[2] = new Main("Ружицька Г.І.", 29, "09.12.1987", "Чікаго", "жінка");
        client[3] = new Main("Іванова І.І.", 20, "08.03.1996", "Львів", "жінка");

        //введення прайс-листа
        Main priceList[] = new Main[14];
        priceList[0]=new Main("Загалтний масаж", 200);
        priceList[1]=new Main("Сауна", 400);
        priceList[2]=new Main("Солярій", 150);
        priceList[3]=new Main("Кросфіт", 30);
        priceList[4]=new Main("Йога", 35);
        priceList[5]=new Main("Відвідування залу", 35);
        priceList[6]=new Main("Рушник", 5);
        priceList[7]=new Main("Одноразові тапочки", 5);
        priceList[8]=new Main("Фреш", 50);
        priceList[9]=new Main("Абонемент на регулярне відвідування залу (зранку до 16.00) 12 разів", 390);
        priceList[10]=new Main("Абонемент на регулярне відвідування залу (весь день) 12 разів", 420);
        priceList[11]=new Main("Абонемент на регулярне відвідування залу (зранку до 16.00) цілий місяць безлім",450);
        priceList[12]=new Main("Абонемент на регулярне відвідування залу (весь день) цілий місяць безлім", 490);
        priceList[13]=new Main("Особистий тренер 12 занять", 800);

        Main bill[] = new Main[countList];

        int bill0=0;

        //визначення клієнта та робота з його замовленням
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Доброго дня. Вас вітає GYM. Введіть номер своєї картки клієнта: ");
        Integer clientId;
        boolean err;
        do {
            err = false;
            if (scan1.hasNextInt()) {
                clientId = scan1.nextInt();
                System.out.println("Вітаємо Вас, " + client[clientId-1]._name);
    //друк прайс-листа
                System.out.println("На даний час можемо Вам запропонувати такі товари та послуги:");
                for (int i=0; i < countList; i++) {
                    System.out.println(i+"."+priceList[i].nameList+" - "+priceList[i].priceList+"грн.;  ");
                }
                System.out.println();
                boolean err2;
    //заповнення рахунку
                do {
                    err2 = false;
                    int y;
                    System.out.print("Вкажіть номер продукту чи послуги з вищепереліченого списку, який Ви хочете замовити: ");
                    Scanner scan2 = new Scanner(System.in);
                    if (scan2.hasNextInt()) {
                        System.out.println();
                        Scanner scan21 = new Scanner(System.in);
                        System.out.print("Вкажіть кількість продукту/послуги яку ви хочете придбати: ");
                        if (scan21.hasNextInt()) {
                            bill0 = bill0 + priceList[scan2.nextInt()]*scan21.nextInt();
                            Scanner scan3 = new Scanner(System.in);
                            System.out.print("Замовите ще щось? Введіть y/n: ");
                            switch (scan3.nextLine()) {
                                case "y":
                                    err2=true;
                                    break;
                                case "n":
                                    err2=false;
                                    break;
                                default:
                                    System.out.println("введений неправильний символ");
                            }
                        } else {
                            System.out.println("Ви ввели не число");
                            err2 = true;
                        }
                    } else {
                        System.out.println("Ви ввели не число, попробуйте знову");
                        err2 = true;
                    }
                } while (err2);


            } else {
                System.out.println("Ви ввели не число, попробуйте знову");
                err = true;
            }
        } while (err);
    System.out.println("your bill = "+bill0);

    }
}
