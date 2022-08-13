
package com.mycompany.mapa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class Evento {

    private String nome;
    private String data;
    private int valorUnico;
    private String capacidade;
    private List<Ingressos> ingresso;

    public Evento() {

    }

    public Evento(String nome, String data, int valorUnico, String capacidade) {
        this.nome = nome;
        this.data = data;
        this.valorUnico = valorUnico;
        this.capacidade = capacidade;
        this.ingresso = new ArrayList<Ingressos>();

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

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public void setIngresso(List<Ingressos> ingresso) {
        this.ingresso = ingresso;
    }

    public List<Ingressos> getIngresso() {

        for (int i = 0; i < ingresso.size(); i++) {
            System.out.println("\n\n\n-------  DADOS DO INGRESSO  -------\n\n");
            System.out.println("EVENTO: " + ingresso.get(i).getEvento());
            System.out.println("Data: " + ingresso.get(i).getData());
            System.out.println("NOME: " + ingresso.get(i).getNome());
            System.out.println("CPF: " + ingresso.get(i).getCpf() + "\n");
            System.out.println("-----------------------------------\n\n");
        }
        return ingresso;
    }

    public void cadastraIngresso(Ingressos ingresso) {
        this.ingresso.add(ingresso);

    }

}
