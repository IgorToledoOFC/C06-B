package Ex000;

public class Cantina {
    String name;
    Salgado salgados[];

    void add_salgado(Salgado novo_salgado){
        for(int i=0; i< salgados.length; i++){
            if(salgados[i] == null){
                salgados[i] = novo_salgado;
                break;
            }
        }
    }

    void show_info(){
        for(int i=0; i< salgados.length; i++){
            System.out.println(salgados[i].name);
        }
    }
}
