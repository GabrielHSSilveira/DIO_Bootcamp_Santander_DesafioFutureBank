package br.com.futurebank.cliente;



public class Cliente {

    private String nome;
    private String cpf;
    private String numeroTelefone;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {

        return cpf.length();
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public int getNumeroTelefone() {

        return numeroTelefone.length();
    }

    public void setNumeroTelefone(String numeroTelefone) {

        this.numeroTelefone = numeroTelefone;
    }


    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }
}


