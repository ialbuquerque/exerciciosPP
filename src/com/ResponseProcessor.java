package com;

import static com.AutomobileType.AUTOMOBILE_TYPE_CAR;
import static com.AutomobileType.AUTOMOBILE_TYPE_MOTORCYCLE;

/**
 * Created by isa on 3/24/15.
 */
public class ResponseProcessor {


    public static void processResponse(String response) {
        Automobile automobile = new Automobile();
        if (response.equals("1")) {
            automobile.setType(AUTOMOBILE_TYPE_CAR);
            automobile.setNumberOfWheels(4);
            MessageSender.sendAnswer(automobile);
        } else if (response.equals("2")) {
            automobile.setType(AUTOMOBILE_TYPE_MOTORCYCLE);
            automobile.setNumberOfWheels(2);
            MessageSender.sendAnswer(automobile);
        } else {
            System.out.printf(String.format("A opção %s não é válida. Por favor, tente novamente!", response));
        }
    }
}
