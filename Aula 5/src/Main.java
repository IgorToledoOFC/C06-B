public class Main {
    public static void main(String[] args) {
        // Criando conta
        Criando_um_Banco conta1 = new Criando_um_Banco();
        Criando_um_Banco conta2 = new Criando_um_Banco();
        Criando_um_Banco conta3 = new Criando_um_Banco();

        conta1.nome = "Conta do Chirs";
        conta2.nome = "Conta da Laura";
        conta3.nome = "Conta do Luan";

        conta3.depositar(-1000000000);

    }
}
