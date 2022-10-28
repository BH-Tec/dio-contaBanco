import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // TODO: conhecer e importar a classe scanner
        // exibir as mensagens para o nosso usuario
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o número da sua conta: ");
        int conta = scan.nextInt();

        // obter pela scanner os valores digitados no terminal
        System.out.println("Digite o número da sua agência com o dígito: ");
        String agencia = scan.next();

        System.out.println("Digite o seu nome de Cliente: ");
        String nomeCLiente = scan.next();

        System.out.println("Digite o seu Saldo (com vírgula): ");
        Double saldo = scan.nextDouble();

        // exibir a mensagem de conta criada
        System.out.println("Olá " + nomeCLiente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
