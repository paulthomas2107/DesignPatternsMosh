package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        TaxCalculator calc = getCalculator();
        calc.calculateTax();

        var account = new Account();

    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}
