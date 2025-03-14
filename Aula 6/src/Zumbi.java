public class Zumbi {
    String nome;
    String genero;
    boolean careca;
    int forca;
    int vida;

    void correr(){
        System.out.println("Zumbi Correndo...");
    }

    void seAlimentar(){
        System.out.println(nome + "Esta se alimentando");
        vida++;
    }
}
