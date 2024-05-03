package br.com.futurebank.contas;

import br.com.futurebank.cliente.Cliente;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public String toString() {
        return "Conta Corrente{" +
                "agência='" + super.agencia + '\'' +
                ", número= " + super.numero + '\'' +
                ", saldo= R$" + super.saldo + '\'' +
                '}';
    }
}
