// Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
// Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

public class Main {
    public static void main(String[] args) {
        int number = 4;
        
        if (number >= 0) {
            System.out.println("El " + number + " es positivo");
        } else {
            System.out.println(number + " es negativo");
        }
    }
}



// Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
// el bloque de código que tendrá el bucle deberá:

// Incrementar el valor de la variable en uno cada vez que se ejecute.

// Mostrarlo por pantalla cada vez que se ejecute.



public class Main {
    public static void main(String[] args) {
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }
}

// Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

public class Main {
    public static void main(String[] args) {
        int numeroDoWhile = 0;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
    }
}

// Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1
// su valor cada vez que se ejecute y deberá mostrarse por pantalla.

public class Main {
    public static void main(String[] args) {
        int numeroFor = 2;
        for (let index = 0; index <= 3; index++) {
   System.out.println(numeroFor);
}

    }
}

// / Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del
// valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner
// un default para cuando el valor de la variable no sea una estación.

public class Main {
    public static void main(String[] args) {
        String estacion = "Verano";
        switch (estacion) {
            case "Otono":
                System.out.println("Estamos en Otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            default:
                System.out.println("Estamos en Verano");
                break;
        }
    }
}