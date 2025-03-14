package Ex004;

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

        // Ignore
        entrada.nextLine();

        // Zombie 2

        System.out.println("Write Zombie Name: ");
        z2.name = entrada.nextLine();

        System.out.println("Write Zombie HP: ");
        z2.life = entrada.nextDouble();

        z1.show_hp();
        z2.show_hp();

        System.out.println("Write the value to transfer hp to Zombie " + z2.name);
        double value = entrada.nextDouble();

        z1.transfer_hp(value, z1, z2);



    }
}
