package Ex003;

public class Zumbi {
    String name;
    double life;
    int Strength;

    void show_hp(Zumbi alvo){
        System.out.println(this.life);
    }

    void reverse_life(Zumbi zumbi1, Zumbi zumbi2){
        Zumbi aux = new Zumbi();

        System.out.println("Trocando Vidas");
        aux.life = zumbi1.life;
        zumbi1.life = zumbi2.life;
        zumbi2.life = aux.life;

        System.out.print("HP of zombie 1: ");
        zumbi1.show_hp(zumbi1);

        System.out.print("HP of zombie 2: ");
        zumbi2.show_hp(zumbi2);

    }

}