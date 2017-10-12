/*
Acest program simuleaza aruncatul a doua zaruri.
 */

public class DiceDemo {
    public static void main(String[] args) {

        final int DIE1_SIDES = 6; //Numarul de laturi pt zarul 1
        final int DIE2_SIDES = 12; //Numarul de laturi pt zarul 2
        final int MAX_ROLLS = 10;  //De cate oride arunca zarul

        Die die1 = new Die(DIE1_SIDES); //Instanta a clasei Die
        Die die2 = new Die(DIE2_SIDES); //Instanta a clasei Die

        System.out.println("This simulates the rolling of a " +
                DIE1_SIDES + " sided and a " +
                DIE2_SIDES + " sided die.");
        System.out.println("Initial value of the dice: ");
        System.out.println(die1.getValue() + "  " + die2.getValue());

        System.out.println("Rolling the dice " + MAX_ROLLS + " times."); // Aruncam zarul;

        for (int i = 0; i < MAX_ROLLS; i++) {
            die1.roll();
            die2.roll();

            System.out.println(die1.getValue() + "  " + die2.getValue());
        }
    }
}
