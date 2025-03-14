package Ex006;

public class Motor {
    String cilindradas;
    float max_speed;

    // Constructor
    public Motor(String cilindradas, float max_speed){
        this.cilindradas = cilindradas;
        this.max_speed = max_speed;
    }


    void show_info(Piloto piloto){
        System.out.println(" ");
        System.out.println("Kart of " + piloto.name);
        System.out.println("Motor has " + cilindradas + " cilinders");
        System.out.println("The maximum speed is " + max_speed);
        System.out.println(" ");
    }
}
