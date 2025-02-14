import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do Lanche1");
        int lanche1 = entrada.nextInt();


        System.out.println("Digite o valor do Lanche2");
        int lanche2 = entrada.nextInt();

        System.out.println("Digite o valor do Lanche3");
        int lanche3 = entrada.nextInt();


        int total = lanche1 + lanche2 + lanche3;
        int media = total /3;

        System.out.println("O total de lanches e: " + total);
        System.out.println("A media de lanches e: " + media);

        entrada.close();
    }
}