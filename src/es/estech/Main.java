package es.estech;

import java.util.Scanner;

public class Main {


    //Haz una clase llamada Password que siga las siguientes condiciones:

    //Que tenga los atributos longitud y contraseña .

    // Por defecto, la longitud sera de 8. Los constructores serán los siguiente:
    //        - Un constructor por defecto.
    //        - Un constructor con la longitud que nosotros le pasemos. Generará una contraseña aleatoria con esa longitud.

    //Los métodos que implementa serán:

    //        - esFuerte(): devuelve un booleano si es fuerte o no,
    // para que sea fuerte debe tener más de 2 mayúsculas, más de 1 minúscula y más de 5 números.

    //        - generarPassword(): genera la contraseña del objeto con la longitud que tenga.

    //Método get para contraseña y longitud.
    //Método set para longitud.


    //Ahora, crea una clase clase ejecutable:
    //Crea un array de Passwords con el tamaño que tú le indiques por teclado.

    //Crea un bucle que cree un objeto para cada posición del array.

    //--->>Indica también por teclado la longitud de los Passwords (antes de bucle).

    //Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).

    //Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior).
    //Usa este simple formato:
    //contraseña1 valor_booleano1
    //contraseña2 valor_bololeano2


    public static void main(String[] args) {

        System.out.println("Introduce un número entero, será la longitud del array de password");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            System.out.println("Recuerda, debes introducir un número entero");
            String cleanScanner = scanner.next();
        }

        int lengthArray = scanner.nextInt();
        Password[] arrayPasswords = new Password[lengthArray];

        System.out.print("Introduce un número entero, será la longitud de los password");
        while (!scanner.hasNextInt()){
            System.out.println("Recuerda, debes introducir un número entero");
            String cleanScanner = scanner.next();
        }

        int passwordLength = scanner.nextInt();
        boolean[] arrayCheck = new boolean[lengthArray];


        for (int i = 0; i < arrayPasswords.length; i++ ){
            arrayPasswords[i] = new Password(passwordLength);
            arrayCheck[i] = arrayPasswords[i].esFuerte();
            System.out.println(arrayPasswords[i].getmPassword()+"      "+arrayCheck[i]);
        }




    }


    private String generateRandomPassword (int length){
        String keys="0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";//un String es un array de tipo char
        String password = "";//antes de empezar a generar el password debemos inicializarlo vacío
        for(int i = 0; i < length; i++){//generamos un bucle que se repita tantas veces como longitud queremos que tenga nuestra password
            password += keys.charAt((int)(Math.random()*keys.length()));//por cada iteración añadimos al password una posición aleatoria de keys al password
        }
        return password;
    }
}
