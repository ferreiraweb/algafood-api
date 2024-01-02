package com.algafood.di;

import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private INotification notificador;
    public AtivacaoClienteService(INotification notificador) {
        System.out.println();
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notification(cliente, "Seu cadastro no sistema foi ativado");
    }
}
