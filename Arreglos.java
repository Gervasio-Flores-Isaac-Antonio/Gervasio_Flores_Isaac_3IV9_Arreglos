import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        Arreg();
    }//MAIN

    public static void Arreg() {

        int resp, datoIn;
        Scanner teclado = new Scanner(System.in);
        teclado = new Scanner(System.in);
        resp = 1;

        while (resp == 1) {

            System.out.println("Menu");
            System.out.println("1.- Array de 10 numeros");
            System.out.println("2.- Posiciones pares");
            System.out.println("3.- Calificaciones");
            System.out.println("4.- Suma de matrices ");
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
                    System.out.println("ingrese calif 10 alumnos");
                    int arrayCalificaciones[] = new int[10];
                    float alumnos = 0;
                    float alumnost = 0;
                    //int cont = 0;
                    float promedio = 0;
                    int mayor = 0;
                    int menor = 0;
                    float y = 0;
                    int r = 0;
                    int aprobado = 0;
                    int superioresalpromedio = 0;

                    while (cont < 10) {
                        scann = new Scanner(System.in);
                        alumnos = scann.nextInt();
                        arrayCalificaciones[cont] = (int) alumnos;
                        alumnost += arrayCalificaciones[cont];

                        // Asumir que el mayor es el primero
                        mayor = arrayCalificaciones[0];
                        menor = arrayCalificaciones[0];

                        // Recorrer arreglo y ver si no es así
                        // (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
                        for (int x = 1; x < arrayCalificaciones.length; x++) {
                            if (arrayCalificaciones[x] > mayor) {
                                mayor = arrayCalificaciones[x];
                            }
                        }

                        //numero menor 
                        for (int x = 1; x < arrayCalificaciones.length; x++) {
                            if (arrayCalificaciones[x] < menor) {
                                menor = arrayCalificaciones[x];
                            }
                        }

                        cont++;

                    }

                    //imprimir las calificaciones
                    System.out.println("******************************************************************");
                    System.out.println("Las calificaciones son:");
                    for (int i = 0; i < arrayCalificaciones.length; i++) {
                        System.out.println(arrayCalificaciones[i]);
                    }

                    //Promedio
                    promedio = (alumnost / 10);
                    System.out.println("El promedio de esas calificaciones es: " + promedio);

                    //calificacion mas alta y baja
                    System.out.println("La calificacion mas alta es: " + mayor);
                    System.out.println("La calificacion mas baja es: " + menor);

                    //numero de calificaciones superiores al promedio   
                    for (int x = 0; x < arrayCalificaciones.length; x++) {
                        if (arrayCalificaciones[x] >= promedio) {
                            //System.out.println("reprobado");
                            superioresalpromedio++;
                        }
                    }
                    System.out.println("El numero de calificaciones superiores al promedio son: " + superioresalpromedio);

                    //numero de alumnos aprobados y reprobados
                    for (int x = 0; x < arrayCalificaciones.length; x++) {
                        if (arrayCalificaciones[x] <= 5.9) {
                            //System.out.println("reprobado");
                            r++;
                        } else {
                            //System.out.println("aprobado");
                            ++aprobado;
                        }
                    }
                    System.out.println("La cantidad de alumnos aprobados son: " + aprobado);
                    System.out.println("La cantidad de alumnos reprobados son: " + r);
                    
                    break;

                case 4:
                    int matriza[][] = new int[3][3];
        int matrizb[][] = new int[3][3];
        int matrizc[][] = new int[3][3];
        int i, j;

        Scanner dato = new Scanner(System.in);

        System.out.println("Datos de la Matriz A :");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Escribir valor " + i + " , " + j + " : ");
                matriza[i][j] = dato.nextInt();
            }
        }

        System.out.println("Datos de la Matriz B :");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Escribir valor " + i + " , " + j + " : ");
                matrizb[i][j] = dato.nextInt();
            }
        }

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                matrizc[i][j] = matriza[i][j] + matrizb[i][j];
            }
        }

        System.out.println("Matriz resultante de la suma :");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(matrizc[i][j] + " ");
            }
            System.out.println("");

        }
                    break;
                    
                    
                default:
                    System.out.println("SOLO DEBE DIGITAR 1 o 2");
            }

            System.out.println("******************************************************************");
            System.out.println("Desea hacer otra conversion? digite: 1 si / 2 no");
            System.out.println("******************************************************************");
            resp = teclado.nextInt();

        }

    }//Arreg
}//Clase
