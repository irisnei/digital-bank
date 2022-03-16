package br.com.digbank.model;

import lombok.Data;

@Data
public class Cliente {
    private String nome;
    private String telefone;
    private String endereco;

    public Cliente() {}

    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
