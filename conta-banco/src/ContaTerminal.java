import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        //COnhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //exibir as msgs para o nosso usuário

        System.out.println("Por favor, digite o seu primeiro nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome!");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
        //obter pela scanner os valores digitados pelo usuário

        //exibir a mensagem da conta criada
        //"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"
    }
}
