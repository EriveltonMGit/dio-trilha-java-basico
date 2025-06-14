import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência!");
        numero = sc.nextInt();
        // Consome a quebra de linha pendente após nextInt()
        sc.nextLine();

        System.out.println("Por favor, digite o número da Conta (EX: 067-8)!");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente!");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo!");
        saldo = sc.nextDouble();

        sc.close();

        System.out.println("------------Conta criada com sucesso--------------");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero
                + " e seu saldo " + saldo + " já está disponível para saque."
        );
    }
}