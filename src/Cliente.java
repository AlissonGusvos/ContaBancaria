import java.util.Random;

public class Cliente {

    Random random = new Random();

    private String nome;
    private String cpf;
    private float saldo;
    private int numeroConta;

    // ARMAZENAMENTO TEMPORARIO DE CONTA
    Object[] clienteFic = {"João","123.456.789.01",4570,54321};

    public Cliente(){}

    public void createClientAccount(String nome, String cpf, float saldoInicial){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldoInicial;
        this.numeroConta = 10000 + random.nextInt(99999);
    }

}
