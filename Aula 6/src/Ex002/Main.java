package Ex002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        System.out.println("Write Zombie1 Name");
        zumbi1.name = entrada.nextLine();
        System.out.println("Write Zombie1 Life Value");
        zumbi1.life = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Write Zombie2 Name");
        zumbi2.name = entrada.nextLine();
        System.out.println("Write Zombie2 Life Value");
        zumbi2.life = entrada.nextDouble();

        System.out.println(zumbi1.showLife());
    }
}
