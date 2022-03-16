package br.com.digbank;

import br.com.digbank.exceptions.ContaNaoCadastradaExcetpion;
import br.com.digbank.model.*;

import java.util.List;

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

        Conta contaCorrentePedro = new ContaPoupanca(pedro, agencia);
        contaPoupancaPedro.depositar(250.30);

        banco.adicionarConta(contaCorrentePaulo);
        banco.adicionarConta(contaPoupancaPedro);
        banco.adicionarConta(contaCorrentePedro);

        contaCorrentePaulo.imprimirExtratoConta();
        contaPoupancaPedro.imprimirExtratoConta();

        banco.listarContas();

        List<Conta> contasEncontradas = banco.buscarConta("Pedro Maia");
        if (contasEncontradas != null && !contasEncontradas.isEmpty()) {
            System.out.println("###### RELAÇÃO DE CONTAS ENCONTRADAS #####");
            for (Conta conta : contasEncontradas) {
                System.out.println(conta.toString());
            }
        }

        try {
            System.out.println("\n##### BUSCANDO CONTA CADASTRADA #####");
            Conta contaEncontrada = banco.buscarConta(1, 3);
            System.out.println("\n##### CONTA LOCALIZADA #####");

            System.out.println(contaEncontrada.toString());
        } catch (ContaNaoCadastradaExcetpion e) {
            System.out.println("Conta não localizada!");
            e.printStackTrace();
        }

        System.exit(0);
    }
}
