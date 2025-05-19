import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Printer showInfos = new Printer();
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        int choiceEntry, choiceAccount;

        System.out.println("-------------------");
        System.out.println("       BANCO       ");
        System.out.println("-------------------");
        showInfos.showMenu();
        choiceEntry = sc.nextInt();

        switch (choiceEntry){
            case 1:
                System.out.println("-------------------");
                System.out.println("Bem-Vindo(a)");
                System.out.println("");
                showInfos.showAccountOptions();
                choiceAccount = sc.nextInt();
                switch (choiceAccount){
                    case 4:
                        break;

                    default: while(choiceAccount != 1 && choiceAccount != 2 && choiceAccount != 3 && choiceAccount != 4){
                        System.out.println("Essa não é uma opção válida!");
                        showInfos.showAccountOptions();
                        choiceAccount = sc.nextInt();
                    }
                }

                break;

            case 2:
                showInfos.showInfo("Nome: ");
                String nome = sc.next();
                showInfos.showInfo("CPF: ");
                String cpf = sc.next();
                showInfos.showInfo("Depósito Inicial: ");
                float depositoInicial = sc.nextFloat();

                cliente.createClientAccount(nome,cpf,depositoInicial);

                System.out.println("-------------------");
                System.out.println("Bem-Vindo(a)");
                System.out.println("");
                showInfos.showAccountOptions();
                choiceAccount = sc.nextInt();
                break;

            case 3:
                System.out.println("Sair");
                break;

            default: while(choiceEntry != 1 && choiceEntry != 2 && choiceEntry != 3){
                System.out.println("Essa não é uma opção válida!");
                showInfos.showMenu();
                choiceEntry = sc.nextInt();
            }
        }

    }
}