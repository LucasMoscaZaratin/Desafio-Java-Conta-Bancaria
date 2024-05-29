import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception   {
    
        Scanner scanner = new Scanner(System.in);
  
        System.out.println("Digite o numero da conta");
        int conta = scanner.nextInt();

        System.out.println("Digite o numero da Agência");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite o nome do Cliente");
        String cliente = scanner.nextLine();

        System.out.println("Digite o Saldo do Cliente");
        Float saldo = scanner.nextFloat();   

        System.out.println("Ola " + cliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " 
        + agencia + ", conta " + conta + ", e seu saldo " + saldo + " já esta disponivel para saque" );

        scanner.close();
    }
}
