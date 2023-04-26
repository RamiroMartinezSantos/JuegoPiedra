public class Operaciones {
    public void opera(int opcion){

        int numero = (int)(Math.random()*3 + 1);

        System.out.println("Respuesta del jugador 2 :");
        if(numero==1){System.out.println("Piedra");
        } else if (numero == 2) {System.out.println("Papel");
        }else{System.out.println("Tijera");
        }

        System.out.println("Resultado:\n");
        if(opcion == 1 & numero == 2){System.out.println("     PERDISTE!!      ");
        } else if (opcion == 2 & numero == 3) {System.out.println("     PERDISTE!!      ");
        } else if (opcion == 3 & numero == 1) {System.out.println("     PERDISTE!!      ");
        } else if (opcion == 1 & numero == 1) {System.out.println("     EMPATE      ");
        } else if (opcion == 2 & numero == 2) {System.out.println("     EMPATE      ");
        } else if (opcion == 3 & numero == 3) {System.out.println("     EMPATE      ");
        }else {System.out.println("     GANASTE!!       ");
        }
    }
}

