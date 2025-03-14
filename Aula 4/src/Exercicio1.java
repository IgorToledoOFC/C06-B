import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int qtd_aluno = entrada.nextInt();

        switch (qtd_aluno){

            case 10, 20:
                System.out.println("Sala I-16");
            break;

            case 30:
                System.out.println("Sala I-17");
            break;


        }



        entrada.close();
    }
}
