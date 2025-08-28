import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {""
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite o seu nome: "); 
        String nome = sc.nextLine();

        System.out.println("Digite a sua agencia: "); 
        String agencia = sc.nextLine();

        System.out.println("Digite a sua conta: "); 
        int conta = sc.nextInt();

        System.out.println("Digite o seu saldo: "); 
        double saldo = sc.nextInt();

        System.out.println("Olá " + nome + 
            ", obrigado por criar conta em nosso banco. Sua agência " + agencia + ", conta " + conta + 
            " e saldo " + saldo + " já estão disponíveis para saque.");

         sc.close();
    }
}
