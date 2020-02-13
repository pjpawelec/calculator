package com.kodilla;

class Calculator {
    public void addNumbers(int a, int b) {
        System.out.println("Wynik dodawania: " + (a + b));
    }

    public void subtractNumbers(int a, int b) {
        System.out.println("Wynik odejmowania: " + (a - b));
    }

    public static void main(String args[]) {
        Calculator run = new Calculator();
        run.addNumbers(12, 23);
        run.subtractNumbers(44, 23);
    }
}