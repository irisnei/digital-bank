package br.com.digbank.model;

public interface IConta {
    /**
     * Realiza um saque da conta
     * @param valor
     */
    void sacar(double valor);

    /**
     * Realiza um depósito na conta
     * @param valor
     */
    void depositar(double valor);

    /**
     * Faz uma transferência entre contas
     * @param valor
     * @param conta
     */
    void transferir(double valor, Conta conta);

    /**
     * Imprime o extrato da conta
     */
    void imprimirExtratoConta();
}
