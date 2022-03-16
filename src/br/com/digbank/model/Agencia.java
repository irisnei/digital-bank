package br.com.digbank.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Agencia {
    private String nome;
    private int numero;
    private String telefone;
    private String gerente;
    private String endereco;
}
