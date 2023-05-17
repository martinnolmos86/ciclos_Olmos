
// primero

public class Main {
    public static int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        int resultado = sumar(2, 4, 6);
        System.out.println("El resultado de la suma es: " + resultado);
    }
}


// segundo

public class Coche {
    private int numPuertas;

    public Coche() {
        numPuertas = 0;
    }

    public void incrementarPuertas() {
        numPuertas++;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("Número de puertas: " + miCoche.getNumPuertas());
    }
}
