package Ex004;

public class Zumbi {
    String name;
    double life;

    void show_hp(){
        System.out.println("The HP of Zumbi " + this.name + " é: " + this.life);
    }

    boolean verifying(double value, Zumbi z1){
        if(value >= z1.life){
            return false;
        }
        else return true;
    }

    void transfer_hp(double value, Zumbi z1, Zumbi z2){
        boolean condition= verifying(value, z1);
        if(condition == false){
            System.out.println("It's not possible transfer the hp of Zombie " + z1.name + " because its shorter than you choice");
        }
        else{
            z2.life += value;
            z2.show_hp();
        }

        System.out.println("Was the transfer completed? : " + condition);
    }
}
