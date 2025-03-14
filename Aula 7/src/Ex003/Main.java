package Ex003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        // Zombie 1
        System.out.println("Write Zombie Name: ");
        z1.name = entrada.nextLine();

        System.out.println("Write Zombie HP: ");
        z1.life = entrada.nextDouble();

        System.out.println("Write Zombie Strength: ");
        z1.Strength = entrada.nextInt();

        // Ignore
        entrada.nextLine();

        // Zombie 2

        System.out.println("Write Zombie Name: ");
        z2.name = entrada.nextLine();

        System.out.println("Write Zombie HP: ");
        z2.life = entrada.nextDouble();

        System.out.println("Write Zombie Strength: ");
        z2.Strength = entrada.nextInt();

        System.out.print("HP of zombie 1: ");
        z1.show_hp(z1);

        System.out.print("HP of zombie 2: ");
        z2.show_hp(z2);

        z1.reverse_life(z1, z2);


    }
}
