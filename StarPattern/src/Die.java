import java.util.Random;

/*
Sipos Zoltan 12 Oct 2017.
Acesta este un program de dat cu zarurile.
Se pot configura numarul de zaruri, de fete si de cate ori se pot "arunca" acestea.
 */

public class Die {  //Clasa Die unde simulam un zar.

    private int sides;  //Laturile zarului.
    private int value;  //Valoarea laturii zarului.

    public Die(int numSides) { // Constructorul zarului.
        sides = numSides;
        roll();
    }

    public void roll() {    //Metoda roll, simuleaza "aruncatul" zarului.
        Random rand = new Random();  //Metoda roll utilizeaza un obiect de tip random.
        value = rand.nextInt(sides) + 1; //Se populeaza "value" cu rand nr laturi (+ 1 deoarece incepe de la 0)
    }

    public int getSides() { return sides; } //getter de laturi.

    public int getValue() {
        return value;
    } //getter de valori.

}
