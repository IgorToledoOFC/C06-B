package Ex000;

public class Main {
    public static void main(String[] args) {
        Cantina cantinas = new Cantina();
        cantinas.salgados = new Salgado[3];

        Salgado s1 = new Salgado();
        Salgado s2 = new Salgado();
        Salgado s3 = new Salgado();

        s1.name = "coxinha";
        s2.name = "pastel";
        s3.name = "hamburger";

        System.out.println("Adding Salgado");
        cantinas.add_salgado(s1);
        cantinas.add_salgado(s2);
        cantinas.add_salgado(s3);

        cantinas.show_info();

    }
}
