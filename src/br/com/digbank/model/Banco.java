package br.com.digbank.model;

import br.com.digbank.exceptions.ContaNaoCadastradaExcetpion;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas;

    /**
     * Adiciona uma nova conta ao banco
     * @param conta
     */
    public void adicionarConta(Conta conta) {
        if (contas == null)
            contas = new ArrayList<Conta>();
        contas.add(conta);
    }

    /**
     * Lista todas as contas do banco
     */
    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta.toString());
        }
    }

    public Conta buscarConta(int agenciaNumero, int numero) throws ContaNaoCadastradaExcetpion {
        Conta contaEncontrada = null;
        for (Conta conta : contas) {
            if (conta.agencia.getNumero() == agenciaNumero && conta.numero == numero) {
                return conta;
            }
        }
        if (contaEncontrada == null) {
            throw new ContaNaoCadastradaExcetpion("A conta solicitada não foi localizada!");
        }

        return contaEncontrada;
    }

    /**
     * Retorna uma conta pelo nome do cliente
     *
     * @param nomeCliente
     * @return
     */
    public List<Conta> buscarConta(String nomeCliente) {
        return null;
    }
}
