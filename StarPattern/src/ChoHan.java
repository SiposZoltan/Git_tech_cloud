import java.util.Scanner;

public class ChoHan {
    public static void main(String[] args) {

        final int MAX_ROUNDS = 5; //numarul de runde
        String palyer1Name;      //Numele primului jucator
        String palyer2Name;      //Numele jucatorului secund

        Scanner keyboard = new Scanner(System.in); //Obiect scanner pt a citi input de pe tst
        System.out.print("Enter the first player's name ");
        palyer1Name = keyboard.nextLine(); // Aici introduce numele primului jucator
        System.out.print("Enter the second player's name ");
        palyer2Name = keyboard.nextLine(); // Aici introduce numele jucatorului secund

        Dealer dealer = new Dealer(); // Cream un obiect de tip dealer nou
        Player player1 = new Player(palyer1Name); //Obiect nou de tip jucator
        Player player2 = new Player(palyer2Name); //Obiect nou de tip jucator

        for (int round = 0; round < MAX_ROUNDS; round++) {  //aici dam drumul la joc prin pornirea rundelor
            System.out.println("-------------------------------------");
            System.out.printf("Now playing round %d.  \n", round + 1);
            dealer.rollDice(); // dealerul aplica metoda roll dice *(se arunca zarurile)

            player1.makeGuess(); //jucatorul 1 ghiceste rezultatul
            player2.makeGuess(); //jucatorul 2 ghiceste rezultatul

            roundResults(dealer, player1, player2); //Determina castigatorul rundei.
        }
        displayGrandWinner(dealer, player1, player2); // Afiseaza marele castigator.
    }


    public static void displayGrandWinner(Dealer dealer, Player player1, Player player2) {
        System.out.printf("The dealer rolled %d and %d. \n",
                dealer.getDie1Value(), dealer.getDie2Value());
        System.out.printf("Result: %s \n", dealer.getChoOrHan());

        checkGuess(player1, dealer);
        checkGuess(player2, dealer);


    }

    public static void checkGuess(Player player, Dealer dealer) {
        final int POINTS_TO_ADD = 1;
        String guess = player.getGuess();
        String choHanResult = dealer.getChoOrHan();
        System.out.printf("The player %s guessed %s \n",
                player.getName(), player.getGuess());
        if (guess.equalsIgnoreCase(choHanResult)) {
            player.addPoints(POINTS_TO_ADD);
            System.out.printf("Awarding %d point(s) to %s. \n",
                    POINTS_TO_ADD, player.getName());
        }
    }

    public static void roundResults(Dealer dealer, Player player1, Player player2) {
        System.out.println("-------------------------------------------");
        System.out.println("Game over, here are the results:");
        System.out.printf("%s: %d points. \n", player1.getName(), player1.getPoints());
        System.out.printf("%s: %d points. \n", player2.getName(), player2.getPoints());
        if (player1.getPoints() > player2.getPoints()) {
            System.out.println(player1.getName() + "Is the Grand Winner");
        } else if (player1.getPoints() < player2.getPoints()) {
            System.out.println(player2.getName() + "Is the Grand Winner");
        } else
            System.out.println("Tied!");
    }
}

