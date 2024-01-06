package com.algafood.di;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoQualifier(NivelUrgencia.URGENTE)
@Component
public class NotificationEmailMock implements INotification {


    public NotificationEmailMock() {
        System.out.println("Notificador MOCK por email");
    }
    @Override
    public void notification(Cliente cliente, String msg) {
        System.out.printf("MOCK: Notificando %s através do e-mail %s\n",
                cliente.getNome(), cliente.getEmail(), msg);
    }
}
