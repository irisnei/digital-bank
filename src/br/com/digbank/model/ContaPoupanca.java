package br.com.digbank.model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, Agencia agencia) {
        super();
        this.cliente = cliente;
        this.agencia = agencia;
    }

    @Override
    public void imprimirExtratoConta() {
        System.out.print("\n\n##### EXTRATAO DE CONTA POUPANÇA #####");
        super.imprimirExtratoConta();
    }
}
