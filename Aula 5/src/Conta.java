public class Conta{
    int saldo;
    int limite;
    int numeroDaConta;
    String nome;

    void sacar(int quantia){
        if(saldo >= quantia) {
            saldo -= quantia;
            System.out.println("Foram depositados " + quantia + "R$");
        }
    }

    void depositar(int quantia){
        saldo += quantia;
        System.out.println("Foram depositados " + quantia + "R$");
    }



}
