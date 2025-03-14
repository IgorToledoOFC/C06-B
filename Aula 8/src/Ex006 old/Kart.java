package Ex006;

public class Kart {
    String name;
    Piloto piloto;
    Motor motor;

    // Construtor
    public Kart(String name, Motor motor, Piloto piloto){
        this.name = name;
        this.motor = motor;
        this.piloto = piloto;
    }


    void jump(){
        System.out.println(name + " is Jumping");
    }

    void turbo(){
        System.out.println(name + " activated Turbo");
    }

    void drift(){
        System.out.println(name + " is drifting now");
    }
}
