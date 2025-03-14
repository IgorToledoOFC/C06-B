package Ex005;

public class Game {
    public static void main(String[] args){
        Arma axe = new Arma("Iced Axe",50, 200, "An Axe that can freeze your enemies ");

        Personagem gow = new Personagem("Kratos", 1000, axe);

        axe.show_info();
        gow.get_hit();
        gow.using_gun();
        gow.using_gun();
        axe.show_info();
    }
}
