import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Integer numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Sistema do Banco ---");
        System.out.print("Digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.print("Digite o seu nome: ");
        nomeCliente = scanner.next();

        System.out.print("Digite o seu saldo: ");
        saldo = Double.parseDouble(scanner.next().replace(",", "."));

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia 
                            + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        
    }
}
