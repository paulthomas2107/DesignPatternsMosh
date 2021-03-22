package com.codewithmosh;

import com.codewithmosh.memento.Editor;
import com.codewithmosh.memento.History;

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

        var editor = new Editor();
        var history = new History();
        editor.setContent("AAA");
        history.push(editor.createState());
        editor.setContent("BBB");
        history.push(editor.createState());
        editor.setContent("CCC");
        editor.restore(history.pop());
        System.out.println(editor.getContent());







    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}
