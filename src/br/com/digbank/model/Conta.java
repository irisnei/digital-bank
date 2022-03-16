package br.com.digbank.model;

public abstract class Conta implements IConta {
    private static int sequencial = 0;
    protected Agencia agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    protected Conta(){
        this.numero = ++sequencial;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta conta) {
        saldo -= valor;
        conta.depositar(valor);
    }

    @Override
    public void imprimirExtratoConta() {
        System.out.printf("\nCliente: %s", this.cliente.getNome());
        System.out.printf("\nAgencia: %s", this.agencia.getNumero());
        System.out.printf("\nConta: %d", this.numero);
        System.out.printf("\nSaldo: %.2f", this.saldo);
    }

    @Override
    public String toString() {
        return "\nConta {" +
                "\n  agencia': " + agencia +
                ",\n  numero: " + numero +
                ",\n  saldo: " + saldo +
                ",\n  cliente: " + cliente +
                "\n}";
    }
}
