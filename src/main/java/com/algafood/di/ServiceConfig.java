package com.algafood.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class ServiceConfig {


    public AtivacaoClienteService ativacaoClienteService(INotification notification) {
        AtivacaoClienteService acs = new AtivacaoClienteService(notification);
        return acs;

    }

}
