import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
       
        int resp, datoIn;
        Scanner teclado = new Scanner(System.in);
        teclado = new Scanner(System.in);
        resp = 1;

        while (resp == 1) {

            System.out.println("Menu");
            System.out.println("1 Array de 10 numeros");
            System.out.println("2 ");
            System.out.println("3 ");
            System.out.println("4 ");
            System.out.println("******************************************************************");

            int array[] = new int[10];
            float arraypromedio = 0;
            float arraypromediot = 0;
            int cont = 0;
            Scanner scann;
            datoIn = teclado.nextInt();

            switch (datoIn) {

                case 1:
                    System.out.println("******************************************************************");
                    System.out.println("ingrese 10 numeros enteros, todos esos se promediaran");

                    do {
                        int x = 0;
                        scann = new Scanner(System.in);
                        x = scann.nextInt();

                        array[cont] = x;
                        arraypromediot += array[cont];
                        cont++;

                    } while (cont < 10);

                    arraypromedio = arraypromediot / 10;

                    System.out.println("el promedio de esos 10 es: " + arraypromedio);
                    break;

                case 2:
                    System.out.println("ingrese 10 numeros enteros, los lugares pares del array se promediaran");

                    do {
                        int x = 0;
                        scann = new Scanner(System.in);
                        x = scann.nextInt();

                        array[cont] = x;

                        if ((cont % 2 == 0)) {

                            arraypromediot += array[cont];
                        }

                        cont++;

                    } while (cont < 10);

                    arraypromedio = arraypromediot / 5;

                    System.out.println("el promedio de los pares es: " + arraypromedio);
                    System.out.println("******************************************************************");
                    break;

                case 3:
                    System.out.println("******************************************************************");
                    break;

                default:
                    System.out.println("SOLO DEBE DIGITAR 1 o 2");
            }

            System.out.println("Desea hacer otra conversion? digite: 1 si / 2 no");
            System.out.println("******************************************************************");
            resp = teclado.nextInt();

        }
    }
    
}//Clase
