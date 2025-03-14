package Ex006;

public class Piloto {
    String name;
    boolean vilao;

    // Constructor
    public Piloto(String name, boolean vilao){
        this.name = name;
        this.vilao = vilao;
    }


    void drop_super_power(){
        System.out.println(name + " Is dropping super power");
    }
}
