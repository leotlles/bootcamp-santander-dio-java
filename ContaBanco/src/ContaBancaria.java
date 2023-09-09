import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);    
        
        String nomeCliente;
        int numero;
        String agencia;
        double saldo;

        System.out.println("Digite seu nome: ");
        if(scanner.hasNext()){
            nomeCliente = scanner.nextLine().trim();
        } else {
            System.out.println("Houve um erro com os dados fornecidos, o programa será interrompido.");
            return;
        }
        
        System.out.println("Digite o numero de sua conta: ");
        if(scanner.hasNextInt()) {
            numero = scanner.nextInt();
        } else {
            System.out.println("Houve um erro com os dados fornecidos, o programa será interrompido.");
            return;
        }

        System.out.println("Digite sua agência: ");
        if (scanner.hasNext()) {
            agencia = scanner.next();
        } else {
            System.out.println("Houve um erro com os dados fornecidos, o programa será interrompido.");
            return;
        }

        System.out.println("Realize um primeiro depósito, Digite um valor: R$ ");
        if (scanner.hasNextDouble()) {
            saldo = scanner.nextDouble();
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            String saldoFormatado = currencyFormat.format(saldo);
            System.out.println("Depósito confirmado");

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia +", conta: "+ numero + " e seu saldo: " + saldoFormatado + " já está disponível para saque." );
        } else {
            System.out.println("Valor de depósito inválido. Por favor, digite um valor válido.");
            return;
        }
        
    }
}
