package com.algafood.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlgaConfig {

    @Bean
    public NotificationEmail notificationEmail() {
        NotificationEmail notificador = new NotificationEmail();
        return notificador;
    }


}
