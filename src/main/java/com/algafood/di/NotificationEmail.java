package com.algafood.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Profile("prod")
@TipoQualifier(NivelUrgencia.URGENTE)
@Component
public class NotificationEmail implements INotification {


    public NotificationEmail() {
        System.out.println("Notificador: (PROD) por email");
    }
    @Override
    public void notification(Cliente cliente, String msg) {
        System.out.printf("Notificando PROD %s através do e-mail %s\n",
                cliente.getNome(), cliente.getEmail(), msg);
    }
}
