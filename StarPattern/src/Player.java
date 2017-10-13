import java.util.Random;

/*
Clasa Player pentru jocul de Cho-Han
 */
public class Player {

    private String name; //Numele jucatorului
    private String guess; //Scorul jucatorului
    private int points; //Punctele jucatorului

    public Player(String playerName) { // Constructor cu numele jucatorului atribuit @param playerName
        name = playerName;
        guess = "";
        points = 0;
    }

    public void makeGuess() { // Metoda prin care se ghiceste rezultatul de catre jucator.
        Random rand = new Random(); // obiect nou random
        int guessNumber = rand.nextInt(2); //numar random nou (0 sau 1)
        if (guessNumber == 0)   // Conditia if-else prin care asignam valoare lui 0 SI 1
            guess = "Cho (Even)";
        else
            guess = "Han (Odd)";
    }

    public void addPoints(int newPoints) { //metoda addPoints adauga puncte la totalul jucatorului
        points += newPoints;                //@newPoints reprezinta punctele de adaugat
    }

    public String getName() { //Metoda getName returneaza numele jucatorului
        return name;            //@return Valoarea campului name.
    }

    public String getGuess() { //Metoda getGuess returneaza ce a ghicit jucatorul
        return guess;           //@return Valoarea campului guess;
    }

    public int getPoints() { //Metoda getPoints returneaza punctele jucatorului
        return points;          //@return valoarea campului points;
    }
}
