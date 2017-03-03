package com.Alliance.Domaine;

/**
 * Created by ivan on 18.02.17.
 */
public class Client {

    private static int countClient;

    private int id;
    private int age;
    private String name;
    private String birthday;
    private String town;
    private String sex;

    //constructor
    public Client(String name, int age, String birthday, String town, String sex) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.town = town;
        this.sex = sex;
    }

    //setters
    public static void setCountClient(int countClient) {
        Client.countClient = countClient;
    }

    //getters
    public String getName() {
        return name;
    }

    public static int getCountClient() {
        return countClient;
    }
}
