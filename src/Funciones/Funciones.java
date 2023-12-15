package Funciones;

import java.util.Scanner;

public class Funciones {

    public static final String ANSI_BLACK = "\u001B[30m";

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_GREEN = "\u001B[32m";

    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_PURPLE = "\u001B[35m";

    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_RESET = "\u001B[0m";


    public static void menuBienvenida(){    // [0]----->      MENÚ DE BIENVENIDA


        System.out.println(ANSI_YELLOW + "\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                                                             *");
        System.out.println("*  [  BIENVENIDOS A PIEDRA, PAPEL, TIJERAS, LAGARTO, SPOCK  ] *");
        System.out.println("*                     [ El Videojuego ]                       *");
        System.out.println("*                                                             *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + ANSI_RESET);
    }


    public static String nombreJugador(){   // [0.1]---->      ELECCIÓN NOMBRE JUGADOR


        Scanner teclado = new Scanner(System.in);

        System.out.println(ANSI_YELLOW + "\n [INGRESA TU NOMBRE PARA EMPEZAR]\n");
        System.out.print("[NOMBRE]----> " + ANSI_RESET);


        return teclado.nextLine();
    }


    public static void menuPrincipal(){     // [0.2]---->       MENU PRINCIPAL

        System.out.println(ANSI_YELLOW + "\n* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                                             *");
        System.out.println("*              [MENÚ PRINCIPAL]               *");
        System.out.println("*                                             *");
        System.out.println("*           Selecciona una opción:            *");
        System.out.println("*                                             *");
        System.out.println("*            [1] Partida 1               *");
        System.out.println("*            [2] Partida Mejor de 5           *");
        System.out.println("*            [3] Estadísticas                 *");
        System.out.println("*            [4] Instrucciones                *");
        System.out.println("*            [5] Salir                        *");
        System.out.println("*                                             *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *\n" + ANSI_RESET);
    }


    public static int opcionValidar( int jugador){

        String jugadorNombre = nombreJugador();
        Scanner teclado = new Scanner(System.in);

        boolean correcto1;
        
        do {
            System.out.println("- ¿Qué vas a elegir?:\n \n [1]-Piedra\n [2]-Papel\n [3]-Tijeras\n [4]-Lagarto\n [5]-Spock");
            System.out.print("\n[" + jugadorNombre + "👤] ELIGE ---->");

            try {
                jugador = teclado.nextInt();
                if ((jugador > 0) && (jugador < 6)) {
                    correcto1 = true;
                } else {
                    correcto1 = false;
                    teclado.nextLine();
                    System.out.println("\n[ELECCIÓN INCORRECTA - intentalo de nuevo.]\n");
                }
            } catch (Exception e) {
                teclado.nextLine();
                System.out.println("\n[ELECCIÓN INCORRECTA - intentalo de nuevo.]\n");
                correcto1 = false;
            }

        } while (!correcto1);

        return jugador;
    }














}
