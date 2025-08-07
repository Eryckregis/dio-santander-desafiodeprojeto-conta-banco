import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        
Scanner scanner = new Scanner(System.in);

System.out.println("digite seu nome");
String nameClient = scanner.nextLine();

System.out.println("Por favor, digite o número da agencia!");
String agency = scanner.nextLine();

System.out.println("digite o numero de Usuario:");
int numberUser = scanner.nextInt();


System.out.println("digite seu saldo:");
double balance = scanner.nextDouble();

System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco %n", nameClient);
System.out.printf("sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",agency,numberUser,balance);


    }
}
