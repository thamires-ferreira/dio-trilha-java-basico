import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite os seguintes dados:");
        System.out.print("Número da conta: ");
        int numero = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Agência: ");
        String agencia = teclado.nextLine();
        System.out.print("Nome do Cliente: ");
        String nomeCliente = teclado.nextLine();
        System.out.print("Saldo: ");
        double saldo = teclado.nextDouble();

        ContaBancaria conta = new ContaBancaria(numero, agencia, nomeCliente, saldo);
        System.out.println();

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + " e seu saldo " + conta.getSaldo() + " já esta sisponível para saque");

        teclado.close();
    }
}
