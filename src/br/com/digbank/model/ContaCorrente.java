package br.com.digbank.model;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, Agencia agencia) {
        super();
        this.cliente = cliente;
        this.agencia = agencia;
    }

    @Override
    public void imprimirExtratoConta() {
        System.out.print("\n\n##### EXTRATAO DE CONTA CORRENTE #####");
        super.imprimirExtratoConta();
    }
}
