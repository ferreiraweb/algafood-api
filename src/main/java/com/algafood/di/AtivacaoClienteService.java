package com.algafood.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {



    private INotification notificador;

   @TipoQualifier(NivelUrgencia.NORMAL)
   public AtivacaoClienteService(INotification notificador) {
      System.out.println();
      this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notification(cliente, "Seu cadastro no sistema foi ativado");
    }
}
