import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // Inicialização das variáveis
        int numberAccount = 0;
        String agency = "";
        String clientName = "";
        float balance = 0.00f;

        // Criação da instância do Scanner para entrada do usuário
        Scanner userInput = new Scanner(System.in);

        // Solicitação do número da conta
        System.out.println("Por favor, informe o número da conta.");
        numberAccount = userInput.nextInt();
        // Consumir a nova linha deixada pelo nextInt()
        userInput.nextLine();

        // Solicitação do número da agência
        System.out.println("Por favor, digite o número da Agência!");
        agency = userInput.nextLine();

        // Solicitação do nome do cliente
        System.out.println("Por favor, informar o nome do cliente");
        clientName = userInput.nextLine();

        // Solicitação do saldo da conta
        System.out.println("Informe o saldo da conta.");
        balance = userInput.nextFloat();

        // Exibir mensagem final
        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agency + ", conta " + numberAccount + " e seu saldo " + balance + " já está disponível para saque.");

        // Fechar o Scanner
        userInput.close();
    }
}


