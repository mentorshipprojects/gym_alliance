package com.GYM.Domaine;

/**
 * Created by ivan on 18.02.17.
 */
public class Client {

    private int id;
    private static int count;

    private int age;
    private String name, birthday, town, sex;

    public Client(String nameIn, int ageIn, String birthdayIn, String townIn, String sexIn) {
        name = nameIn;
        age = ageIn;
        birthday = birthdayIn;
        town = townIn;
        sex = sexIn;

        count++;
        id=count;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

}
