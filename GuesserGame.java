import java.util.Scanner;

class Guesser {
    int GuesserNumber;

    public int YourNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Guesser what's your Number");
        GuesserNumber = sc.nextInt();
        return GuesserNumber;

    }

}

class Players {
    int PlayerNumber;

    public int guessYourNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Players, Guess your Number");
        PlayerNumber = s.nextInt();
        return PlayerNumber;

    }

}

class Umpire {
    int GuesserNumber;
    int P1Number;
    int P2Number;
    int P3Number;

    public void getNumberFromGuesser() {
        Guesser guesser = new Guesser();
        GuesserNumber = guesser.YourNumber();

    }

    public void getNumbersFromPlayers() {
        Players P1 = new Players();
        P1Number = P1.guessYourNumber();

        Players P2 = new Players();
        P2Number = P2.guessYourNumber();

        Players P3 = new Players();
        P3Number = P3.guessYourNumber();

    }

    public void evaluateResults() {
        if (GuesserNumber == P1Number) {
            if (GuesserNumber == P2Number && GuesserNumber == P3Number) {
                System.out.println("Game tied between all players");
            } else if (GuesserNumber == P2Number) {
                System.out.println("Player 1 & Player2 are Winners");
            } else if (GuesserNumber == P3Number) {
                System.out.println("Player 1 & Player3 are Winners");
            } else {
                System.out.println("Player 1 is Winner");
            }
        } else if (GuesserNumber == P2Number) {
            if (GuesserNumber == P3Number) {
                System.out.println("Player 2 & Player 3 are Winners");
            } else {
                System.out.println("Player 2 is Winner");
            }
        } else if (GuesserNumber == P3Number) {
            System.out.println("Player 3 is Winner");
        } else {
            System.out.println("Players Better Luck Next Time");
        }
    }

}

public class GuesserGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.getNumbersFromPlayers();
        umpire.evaluateResults();
    }
}