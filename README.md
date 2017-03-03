#GYM Alliance

<<<<<<< HEAD
Logic program:
1. Load client's base and product's base.
2. Choose client.
3. Print price-list.
4. Client choose products and quantity of them.
5. Print bill with discount.
=======
<опис роботи програми (меню) тут>

##Review #1

1. Java Code Conventions: переглянь правила написання пакетів
2. клас Bill містити тільки приватні поля, як ти збираєшся доступатись до його значень?
3. логіка зашита в Launcher. Виведи її в якийсь сервіс і назви його відповідно
4. .idea папка не задізейблена в .gitignore
5. Опиши інструкцію як твоя програма має працювати в цьому файлі (див. вище)
6. програма не працює коли вводжу цифру 1, десь провтик з не правильним індексом (14) 

    ~~~
    java.lang.ArrayIndexOutOfBoundsException: 14
        at com.GYM.Launcher.main(Launcher.java:47)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
    ~~~

7. private static int countList; - не добре робити статичні мембери класу, 
взагалі рекомендується уникати статики. Подумай як можна переписати без її використання.

##Review #2

Що добре:

1. Програма містить domain класи (кастомні типи) і дотримані code conventions щодо їх написання
2. Є опис роботи програми в Readme.md
3. Виглядає так що логіка роботи програми розбита на логічні частини (біни, робота з консоллю, сервіси), 
що є дуже добре
4. Є коментарі до більшості методів
5. Стало менше статичних як методів так і полів

Що зле:

1. Програма на компілиться. Щоб провірити себе використовуй mvn compile або mvn install
Будь ласка виправ всі помилки!
2. Дивись п.1 Review #1
3. дуже багато однотипних помилок типу: CheckService.isTextNumber де ти намагаєшся достукатись до
методу обєкта, так наче че метод класу (static)
4. повідомлення не перекладені на англ
5. Дивись п.4 Review #1
6. Чи можна використовувати this в статичних методах? Якщо ні то коли можна?

    ~~~
    public static void setLengthProduct(int lengthProduct) {
            this.lengthProduct = lengthProduct;
        }
    ~~~

7. Досі присутня така зміння як countBill. Ми про це говорили на занятті що з нею робити