package br.com.futurebank.contas;

import br.com.futurebank.cliente.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public String toString() {
        return "Conta Poupança{" +
                "agência='" + super.agencia + '\'' +
                ", número= " + super.numero + '\'' +
                ", saldo= R$" + super.saldo + '\'' +
                '}';
    }
}
