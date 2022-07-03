import java.util.Scanner;

public class piedraPapelOTijera {
    public static void main(String[] args) {
        String player1name, player2name;
        int player1points = 0;
        int player2points = 0;

        System.out.println("Nombre Player1: ");
        player1name = new Scanner(System.in).nextLine();
        System.out.println("Nombre Player2: ");
        player2name = new Scanner(System.in).nextLine();

        while (true) {
            System.out.println("Piedra = 1 || Papel = 2 || Tijera = 3 || Salir = *");

            System.out.println("Jugada " + player1name + ": ");
            String input1 = new Scanner(System.in).nextLine();

            gameOver(input1, player1name, player2name, player1points, player2points);

            System.out.println("Jugada " + player2name + ": ");
            String input2 = new Scanner(System.in).nextLine();

            if (cualGana(input1, input2) == 1) {
               player1points++;
            } else if (cualGana(input1, input2) == 2) {
                player2points++;
            }
            System.out.println(player1name + " tiene " + player1points + " y " + player2name + " tiene " + player2points);
        }

    }

    static void gameOver(String breakPoint, String player1, String player2, int player1points, int player2points) {
        if(breakPoint.equals("*")) {
            if (player1points > player2points) {
                System.out.println("Ganó " + player1);
            } else if (player1points < player2points) {
                System.out.println("Ganó " + player2);
            } else {
                System.out.println("¡Empataron!");
            }
            System.exit(0);
        }
    }
    static int cualGana(String player1, String player2) {
        if (player1.equals("1") && player2.equals("2")) {
            return 2;
        } else if (player1.equals("1") && player2.equals("3")) {
            return 1;
        } else if (player1.equals("2") && player2.equals("1")) {
            return 1;
        } else if (player1.equals("2") && player2.equals("3")) {
            return 2;
        } else if (player1.equals("3") && player2.equals("1")) {
            return 2;
        } else if (player1.equals("3") && player2.equals("2")) {
            return 1;
        } else {
            return 0;
        }
    }
}