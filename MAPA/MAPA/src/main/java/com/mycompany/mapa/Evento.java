
package com.mycompany.mapa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class Evento {

    private String nome;
    private String data;
    private int valorUnico;
    private int capacidade;
    private List<Ingressos> ingresso;
    private  ArrayList<String> mensagem = new ArrayList<>();

    public Evento() {

    }

    public Evento(String nome, String data, int valorUnico, int capacidade) {
        this.nome = nome;
        this.data = data;
        this.valorUnico = valorUnico;
        this.capacidade = capacidade;
        this.ingresso = new ArrayList<Ingressos>();
        // valor fixo da menssagem
        mensagem.add("obrigado");
       

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(int valorUnico) {
        this.valorUnico = valorUnico;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setIngresso(List<Ingressos> ingresso) {
        this.ingresso = ingresso;
    }
    
    public double getIngressoValorTipo(int tipo, int valorUnico)
    {
        int valorTipo = tipo;
        int valorUnicoIngresso = valorUnico;
        
        switch (valorTipo) {
        case 2:
            return valorUnicoIngresso * 1.3;
        case 3:
            return valorUnicoIngresso * 1.6;
        default:
            return valorUnicoIngresso;
        }
    }

    public ArrayList<String> getIngresso() {
        
        int QtdIngressos = ingresso.size();
        
        System.out.println("Capacidade Total Disponível: " + capacidade);

        for (int i = 0; i < ingresso.size(); i++) {
            
            if( capacidade >= (i+1) ){
                System.out.println("\n\n\n-------  DADOS DO INGRESSO  -------\n\n");
                System.out.println("Com esta venda estão disponíveis: " + (capacidade-(i+1)));
            }
            else {
                System.out.println("Ingressos Indisponíveis: Venda Não pode ser concluída" );
                return this.mensagem;
            }
            
            
            System.out.println("EVENTO: " + ingresso.get(i).getEvento());
            System.out.println("Data: " + ingresso.get(i).getData());
            System.out.println("NOME: " + ingresso.get(i).getNome());
            System.out.println("CPF: " + ingresso.get(i).getCpf() + "\n");
            System.out.println("Tipo Local: " + ingresso.get(i).getTipo()+ "\n");
            System.out.println("Valor do Ingresso: " + this.getIngressoValorTipo(ingresso.get(i).getTipo(), ingresso.get(i).valorIngresso() ) + "\n");
            System.out.println("-----------------------------------\n\n");
            System.out.println("-----------------------------------\n\n");
        }
        
        return this.mensagem;
    }

    public void cadastraIngresso(Ingressos ingresso) {
        this.ingresso.add(ingresso);

    }

}
