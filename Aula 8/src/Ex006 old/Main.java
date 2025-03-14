package Ex006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Piloto p1 = new Piloto("Pedro", true);
        Piloto p2 = new Piloto("Carlos", false);

        Motor m1 = new Motor("100cc", 80);
        Motor m2 = new Motor("90cc", 70);

        Kart k1 = new Kart("Kart of Pedro", m1, p1);
        Kart k2 = new Kart("Kart of Carlos", m2, p2);

        k1.drift();
        k2.jump();
        k2.turbo();

        m1.show_info(p1);
        m2.show_info(p2);


    }
}