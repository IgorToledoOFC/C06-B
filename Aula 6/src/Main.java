public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        // Setting Zombies name
        zumbi1.nome = "Chris";
        zumbi2.nome = "Laura";

        // Defining Zombies Calvice
        zumbi1.careca = true;
        zumbi2.careca = false;

        // Setting Zombies Life Value
        zumbi1.vida = 100;
        zumbi2.vida = 200;

        // Using methods
        zumbi1.seAlimentar();
        zumbi2.correr();
    }
}