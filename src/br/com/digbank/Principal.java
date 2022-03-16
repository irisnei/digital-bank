package br.com.digbank;

import br.com.digbank.exceptions.ContaNaoCadastradaExcetpion;
import br.com.digbank.model.*;

public class Principal {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco da DIO");

        Agencia agencia = new Agencia();
        agencia.setNome("Ouro Branco");
        agencia.setNumero(1);
        agencia.setGerente("Fábio Arruda");
        agencia.setTelefone("8532456464");

        // Cria o cliente Paulo e sua conta
        Cliente paulo = new Cliente("Paulo Sousa", "85898989898", "Rua das Acácias, 199");
        Conta contaCorrentePaulo = new ContaCorrente(paulo, agencia);
        contaCorrentePaulo.depositar(100);
        // Cria o cliente Pedro e sua conta
        Cliente pedro = new Cliente("Pedro Maia", "858932343435", "Rua Amélia, 456");
        Conta contaPoupancaPedro = new ContaPoupanca(pedro, agencia);
        contaPoupancaPedro.depositar(150.90);

        banco.adicionarConta(contaCorrentePaulo);
        banco.adicionarConta(contaPoupancaPedro);

        contaCorrentePaulo.imprimirExtratoConta();
        contaPoupancaPedro.imprimirExtratoConta();

        banco.listarContas();

        try {
            System.out.println("\n##### BUSCANDO CONTA CADASTRADA #####");
            Conta contaEncontrada = banco.buscarConta(1,2);
            System.out.println("\n##### CONTA LOCALIZADA #####");

            System.out.println(contaEncontrada.toString());
        } catch (ContaNaoCadastradaExcetpion e) {
            System.out.println("Conta não localizada!");
            e.printStackTrace();
        }

        System.exit(0);
    }
}
