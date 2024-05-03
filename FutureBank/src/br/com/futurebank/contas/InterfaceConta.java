package br.com.futurebank.contas;

public interface InterfaceConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, InterfaceConta contaDestino);

}
