public class Printer {

    public void showInfo(String mensagem){
        System.out.println(mensagem);
    }

    public void showMenu(){
        showInfo("[1] Acessar conta");
        showInfo("[2] Criar conta");
        showInfo("[3] SAIR");
        System.out.print("Escolha uma opção: ");
    }

    public void showAccountOptions(){
        showInfo("[1] Depositar");
        showInfo("[2] Sacar");
        showInfo("[3] Transferir");
        showInfo("[4] Sair");
        System.out.print("Escolha uma opção: ");
    }
}
