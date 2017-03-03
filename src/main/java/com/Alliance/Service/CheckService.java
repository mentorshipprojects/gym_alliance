package com.Alliance.Service;

import java.util.Scanner;

/**
 * Created by ivan on 28.02.17.
 */
public class CheckService {

    //перевірка бажання клієнта продовжувати добавлення продуктів у чек
    public boolean areWeContinue() {
        boolean wrongText = false;
        System.out.print("We are continue? Choose y or n : ");
        Scanner yesOrNo = new Scanner();
        do {
            if (CheckService.isTextCorrectYesOrNo(yesOrNo)) {
                if (yesOrNo.nextLine() == "y") {
                    return true;
                    break;
                } else {
                    return false;
                    break;
                }
            } else {
                System.out.println("You lead in wrong text. Try one more time.");
                wrongText=true;
            }
        } while (wrongText);
    }

    //перевірка правильності введеного тексту y (так) чи n (ні)
    public boolean isTextCorrectYesOrNo(String someText) {
        switch (someText) {
            case "y":
                return true;
                break;
            case "n":
                return true;
                break;
            default:
                return false;
                break;
        }
    }

    //перевірка чи це цифри
    public boolean isTextNumber(String someText) {
        if (someText instanceof int) {
            return true;
        } else {
            return false;
        }
    }
}
