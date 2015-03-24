package com;

import java.util.Scanner;

/**
 * Created by isa on 3/24/15.
 */
public class MessageSender {

    public static void sendStartMessage() throws NotAValidAutomobileException {
        System.out.println("Fique sabendo quantas rodas tem o seu automóvel. Digite:\n1 para carro\n2 para moto\nResposta: ");

        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        ResponseProcessor.processResponse(response);
    }

    public static void sendAnswer(Automobile automobile) {
        System.out.println("\nA quantidade de rodas do " + automobile.getType().getAutomobileType() + " é " + automobile.getNumberOfWheels());


    }
}
