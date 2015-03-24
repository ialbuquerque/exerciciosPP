package com;

/**
 * Created by isa on 3/24/15.
 */
public class NotAValidAutomobileException extends Exception {
    public NotAValidAutomobileException(String response) {
        super(String.format("A opção %s não é válida. Por favor, tente novamente!", response));
    }
}