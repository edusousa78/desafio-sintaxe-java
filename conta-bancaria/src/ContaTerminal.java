
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scaanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Obter os valores digitados pelo terminal
        System.out.println(" Digite o seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite o Numero da Agencia ex. 000-0: ");
        String agencia = scanner.next();

        System.out.println("Digite o nomero da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o Saldo da sua da Conta: ");
        double saldoConta = scanner.nextDouble();
        // Exibir as Saídas dos dados após digitados
        System.out.println("Olá " + nome + " Obrigado por criar sua conta em nosso banco! \nSua agencia é: " + agencia + "\nConta: " + numeroConta + "\nSeu Saldo de R$" + saldoConta + " já está disponivel!" );

    }
}
