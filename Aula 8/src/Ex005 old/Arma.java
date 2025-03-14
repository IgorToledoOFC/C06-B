package Ex005;

public class Arma {
    String name;
    int power;
    int durability;
    String description;

    // Constructor
    public Arma(String nome, int power, int durability, String description){
        this.name = nome;
        this.power = power;
        this.durability = durability;
        this.description = description;
    }

    void show_info(){
        System.out.println(" ");
        System.out.println("Name of Gun: " + this.name);
        System.out.println("Power of Gun: " + this.power);
        System.out.println("Durability of Gun: " + this.durability);
        System.out.println("Description of Gun: " + this.description);
        System.out.println(" ");
    }

    void use_gun(){
        if(durability < 0){
            System.out.println("Gun has ben broken, you cant use it now");
        }
        else{
            System.out.println("The guns has ben used");
            durability -= 2;
        }
    }
}
