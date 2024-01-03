package com.algafood.di;

import org.springframework.stereotype.Component;

//@Component
public class NotificationEmail implements INotification {


    public NotificationEmail() {
        System.out.println("Notificador por email");
    }
    @Override
    public void notification(Cliente cliente, String msg) {
        System.out.printf("Notificando %s através do e-mail %s\n",
                cliente.getNome(), cliente.getEmail(), msg);
    }
}
