import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Printer showInfos = new Printer();

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
                break;

            case 2:
                System.out.println("Criar conta");
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