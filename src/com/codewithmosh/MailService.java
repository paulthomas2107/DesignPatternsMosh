package com.codewithmosh;

public class MailService {

    public void sendEmail() {
        connect(5000);
        authenticate();
        // Send mail
        disconnect();

    }

    private void connect(int timeout) {
        System.out.println("Connect");
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }
}
