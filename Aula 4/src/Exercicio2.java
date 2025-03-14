import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Adivinhe o numero que eu estou pensando :) ");
        System.out.println(" O numero esta entre 0-10");

        Random rand = new Random();
        int numAleatorio = rand.nextInt(10);

        int escolha = -1;
        int cont = 0;

        do {
            escolha = entrada.nextInt();
            cont += 1;
            if (escolha != numAleatorio){
                System.out.println("Você errou, Tente mais uma vez ");
            }
        } while(escolha != numAleatorio);

        if( cont < 5) {
            System.out.println("Parabens, você acertou com " + cont + " tentativas");
        } else if (cont >5 && cont < 10) {
            System.out.println("Você ganhou com " + cont + " tentativas");
        }
        else{
            System.out.println("kkkkkkkkkk muleque burro do Caralho, você acerout só na " + cont + " tentativa" );
        }


    }
}
