package com.algafood.di;

import org.springframework.stereotype.Component;


@TipoQualifier(NivelUrgencia.NORMAL)
public class NotificationSMS implements INotification {

    @Override
    public void notification(Cliente cliente, String msg) {
        System.out.printf("Notificando %s através do SMS - Telefone %s - %s\n",
                cliente.getNome(), cliente.getTelefone(), msg);
    }
}
