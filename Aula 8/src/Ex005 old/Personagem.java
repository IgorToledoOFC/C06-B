package Ex005;

public class Personagem {
    String name;
    int points;
    Arma arma;

    // Constructor
    public Personagem(String name, int points, Arma arma){
        this.name = name;
        this.points = points;
        this.arma = arma;
    }

    void using_gun(){
        arma.use_gun();
    }

    void get_hit(){
        if(points <= 0){
            System.out.println("You get hit and die, its the end of your history");
        }
        else{
            System.out.println("you suffer a hit, be careful");
            points -= 5;
        }
    }
}
