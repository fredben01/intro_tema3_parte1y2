public class Main {
    public static void main(String[] args) {
        //Parte1
        var valor = suma(3,4,5);
        System.out.println("suma: " + valor);

        //Parte2
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println("nroPuertas: " + miCoche.nropuertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int nropuertas = 0;

    public void agregarPuerta() {
        nropuertas++;
    }
}

