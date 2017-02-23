package com.GYM.Domaine;

/**
 * Created by ivan on 18.02.17.
 */
public class PriceList {

    private int idList;
    private static int countList;

    private String nameList;
    private int priceList;

    public PriceList(String nameListIn, int priceListIn) {
        nameList = nameListIn;
        priceList = priceListIn;

        countList++;
        idList=countList;
    }

    public int getPriceList() {
        return priceList;
    }

    public String getNameList() {
        return nameList;
    }

    public int getIdList() {
        return idList;
    }

    public static int getCountList () {
        return countList;
    }

}
