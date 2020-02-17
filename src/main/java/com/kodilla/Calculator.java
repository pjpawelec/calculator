package com.kodilla;

class Calculator {
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public int subtractNumbers(int a, int b) {
        return a - b;
    }

    public static void main(String args[]) {
        Calculator run = new Calculator();
        int resultOfAddition = run.addNumbers(12, 23);
        int resultOfSubtraction = run.subtractNumbers(44, 23);
        System.out.println("Wynik dodawania: " + resultOfAddition);
        System.out.println("Wynik odejmowania: " + resultOfSubtraction);
    }
}