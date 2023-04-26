import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        int opcion;
        do {
            System.out.println("---JUEGO DE PIEDRA PAPEL O TIJERA---\n");
            System.out.println("Escoje lo que vas a sacar:\n");
            System.out.println(" [1] Piedra");
            System.out.println(" [2] Papel");
            System.out.println(" [3] Tijeras");
            System.out.println(" [4] Salir del juego");
            opcion = scanner.nextInt();
            if(opcion != 4) {
                System.out.println("Respuesta del jugador 1 :");
                if(opcion==1){System.out.println("Piedra");
                } else if (opcion == 2) {System.out.println("Papel");
                }else{System.out.println("Tijera");
                }
                operaciones.opera(opcion);
            }

        }while(opcion!=4);

    }
}
