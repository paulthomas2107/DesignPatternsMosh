package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        TaxCalculator calc = getCalculator();
        calc.calculateTax();

        var account = new Account();
        account.deposit(20);
        account.withdraw(5);
        account.printBalance();

        var mailService = new MailService();
        mailService.sendEmail();

        var textBox = new TextBox();
        textBox.enable();

        drawUIControl(new CheckBox());
        drawUIControl(new TextBox());



    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}
