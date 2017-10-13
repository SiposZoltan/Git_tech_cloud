/*
Jocul Cho-Han: se folosesc doua zaruri cu 6 laturi, se amesteca intr-un pahar si se arunca;
Daca suma laturilor e para atunci e Cho;
Daca suma laturilor e impara atunci e Han.

 */
public class Dealer {

    private int die1Value; // valoarea zarului 1
    private int die2Value; // valoarea zarului 2


    public Dealer() { //Constructor
        this.die1Value = die1Value;
        this.die2Value = die2Value;
    }

    public void rollDice() { // metoda de rulat zarurile
        final int SIDES = 6; //declaram numarul de fete a zarului

        Die die1 = new Die(SIDES);
        Die die2 = new Die(SIDES); // Am creat doua obiecte de tip zar si le-am alocat nr de fete.

        die1Value = die1.getValue();
        die2Value = die2.getValue(); // Container de inregistrat valorile zar 1 si zar 2
    }

    public String getChoOrHan(){ //metoda de a determina daca rezultatul rularii zarurilor e par sau impar.
        String result; //pentru a pastra rezultatul
        int sum = die1Value+die2Value; // suma valorilor laturilor dupa rulare
        if (sum %2 == 0)
            return result = "Cho (even)";
        else
            return result = "Han (odd)"; //  if/else determina daca rezultatul este par sau impar.

        //return result;

    }

    public int getDie1Value(){
        return die1Value;
    }

    public int getDie2Value() {
        return die2Value;
    }
}
