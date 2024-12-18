import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner cadena = new Scanner(System.in);
        try {
            System.out.println("Ingresa un txt: ");
            String nombre = cadena.nextLine();
            String corta = nombre.substring(2, 15);
            System.out.println(corta);

        } catch (Exception e) {
            System.out.println("Tienes que escribir un texto mas largo");
        }

        System.out.println("TENEMOS LAS SIGUENTES BEBIDAS");
        System.out.println("1. Cafe");
        System.out.println("2. Gaseosa");
        System.out.println("3. Volt");
        System.out.println("4. Emoliente");

        System.out.print("Escribe una opción:  ");
        int opcion = cadena.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("tomas cafe");
                break;

            case 2:

                System.out.println("tomas gaseosa");
                break;
            case 3:

                System.out.println("tomas volt");
                break;
            case 4:

                System.out.println("tomas emoliente");
                break;

            default:

                System.out.println("No es una opcion valida");
                break;
        }

        if (opcion < 5) {
            System.out.println("Disfruta tu bebida");

        }

        int[] numeros= new int[3];
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        for (int i : numeros) {
            System.out.println(i);
        }

        cadena.close();

    }
}
