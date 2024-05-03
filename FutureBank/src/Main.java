import java.util.Scanner;
import br.com.futurebank.cliente.Cliente;
import br.com.futurebank.contas.Conta;
import br.com.futurebank.contas.ContaCorrente;
import br.com.futurebank.contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente1 = new Cliente();

        // Solicita e defini o nome do cliente
        System.out.println("Digite o nome do cliente:");
        cliente1.setNome(scanner.nextLine());

        // Solicita e defini o CPF do cliente
        System.out.println("Digite o CPF do cliente:");
        cliente1.setCpf(scanner.nextLine());

        // Solicita e defini o número de telefone do cliente
        System.out.println("Digite o número de telefone do cliente:");
        cliente1.setNumeroTelefone(scanner.nextLine());
        // Exibir informações do cliente
        System.out.println("Cliente cadastrado: " + cliente1);

        // Cria contas corrente e poupança para o cliente
        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente1);

        //Setamos a agência e os números das contas do cliente, assim como atribuimos a conta a um cliente.
        contaCorrente.setAgencia("1234-56");
        contaPoupanca.setAgencia("1234-56");
        contaCorrente.setNumero("1234");
        contaPoupanca.setNumero("5678");
        contaPoupanca.setCliente(cliente1);
        contaCorrente.setCliente(cliente1);



        contaCorrente.depositar(500);
        System.out.println(contaCorrente.getSaldo());
        contaCorrente.transferir(500, contaPoupanca);
        System.out.println(contaPoupanca);
        System.out.println(contaCorrente);
        scanner.close();
    }
}