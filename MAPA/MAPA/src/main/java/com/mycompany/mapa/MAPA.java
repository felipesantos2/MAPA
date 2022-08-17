
package com.mycompany.mapa;

/**
 *
 * @author Felipe
 *         versão: 0.0.1;
 */
public class MAPA {

    public static void main(String[] args) {
        ///// criando o evento
        Evento evento = new Evento("Evento 01", "2022-12-31", 1550, 2);

        String nomeEvento = evento.getNome();
        String dataEvento = evento.getData();

        int valorUnico = evento.getValorUnico();

        ////// Ingressos;
        Ingressos ingresso1 = new Ingressos();

        ingresso1.setNome("Felipe");
        ingresso1.setCpf("999.999.999-99");
        ingresso1.setEvento(nomeEvento);
        ingresso1.setValorIngresso(valorUnico);
        ingresso1.setData(dataEvento);
        ingresso1.setTipo(2);

        evento.cadastraIngresso(ingresso1);
        
        Ingressos ingresso2 = new Ingressos();

        ingresso2.setNome("Saulo");
        ingresso2.setCpf("123.999.999-99");
        ingresso2.setEvento(nomeEvento);
        ingresso2.setValorIngresso(valorUnico);
        ingresso2.setData(dataEvento);
        ingresso2.setTipo(3);

        evento.cadastraIngresso(ingresso2);

        // retornado a lista de ingressos

        System.out.println(evento.getIngresso());
       
    }
    
    
    
    
    
          // Professor, eu não consegui trabalhar com herança e polimorfismo para criar subclasses especificas para os ingressos
          // E também não consegui criar um método que verifica a quantidade de ingressos
          // Esse conceito é complicado de se lidar.
}
