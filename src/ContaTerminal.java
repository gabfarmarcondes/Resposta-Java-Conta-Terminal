import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Digite o numero da conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.next();

        System.out.println("Digite a agencia da conta: ");
        agencia = sc.next();

        System.out.println("Digite o saldo da conta: ");
        saldo = sc.nextDouble();

        System.out.println("""
                    \nDados da conta:
                    numero da conta: %d
                    agencia: %s
                    nome do titular: %s
                    saldo disponivel: %.2f
                """.formatted(numeroConta, agencia, nomeCliente, saldo));
    }
}
