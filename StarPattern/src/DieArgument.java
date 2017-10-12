/*
Acest program invarte doua zaruri unul cu 6 fete altul cu 20.
 */
public class DieArgument {

    public static void main(String[] args) {
        final int SIX_SIDES = 6;
        final int TWENTY_SIDES = 20;

        Die sixDie = new Die(SIX_SIDES); // Am creat doua zaruri noi
        Die twentyDie = new Die(TWENTY_SIDES);

        rollDie(sixDie);
        rollDie(twentyDie);

    }

    private static void rollDie(Die d) { //aceasta metoda simuleaza "aruncatul zarurilor"
        System.out.println("Rolling a "+ d.getSides()+ " d sided die"); //laturile zarului.

        d.roll(); //Arunca zarul

        System.out.println("The die's value "+ d.getValue()); // rezultatul "aruncarii" zarului
    }
}
