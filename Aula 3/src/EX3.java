import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da NPA: ");
        int NPA = entrada.nextInt();

        if (NPA >= 60 ){
            System.out.println("Parabens você foi APROVADO!!!");
        }
        else {
            System.out.print("Digite o Valor da nova Nota: ");
            int NP = entrada.nextInt();

            if ( (NP + NPA)/2 >= 50){
                System.out.println("Parabens você foi APROVADO!!!");
            }
            else {
                System.out.println("REPROVADO, Te vejo no semestre que vem");
            }
        }
        entrada.close();
    }
}