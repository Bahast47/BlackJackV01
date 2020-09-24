import java.util.Scanner;

public class cards {

    //card generator
    static String cardGenerator() {

        String[] numbers = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"};
        String[] symbols = {"CLOVERS", "HEARTS", "SPADES", "DIAMONDS"};

        String randomNumbers = numbers[(int) Math.floor(Math.random() * numbers.length)];
        String randomSymbols = symbols[(int) Math.floor(Math.random() * symbols.length)];

        return randomNumbers + " OF " + randomSymbols;

    }


    static String playersCardOne() {

        return cardGenerator();
    }

    static String playersCardTwo() {

        return cardGenerator();
    }

    static String playersCardThree() {

        return cardGenerator();
    }
    static String playersCardFour() {

        return cardGenerator();
    }



    static String dealersCardOne() {

        return cardGenerator();
    }

    static String dealersCardTwo() {

        return cardGenerator();
    }


    public static void main(String[] args) {
        System.out.println("Your cards are: " + playersCardOne() + " -&- " + playersCardTwo());
        System.out.println("Dealers cards: " + dealersCardOne() + " -&- " + "******");
        boolean moreCards = true;


            Scanner newCard = new Scanner(System.in);  // Create a Scanner object
        while (moreCards) {
            System.out.println("Would you like another card");

            String userInput = newCard.nextLine();  // Read user input


            if (userInput.equals("yes")) {
                System.out.println("Your new card is: " + playersCardThree());
                System.out.println("Your cards are: " + playersCardOne() + " -&- " + playersCardTwo() + " -&- " + playersCardThree());
                System.out.println("Dealers cards: " + dealersCardOne() + " -&- " + "******");

            } else if (userInput.equals("yes")) {
                System.out.println("Your new card is: " + playersCardFour());
                System.out.println("Your cards are: " + playersCardOne() + " -&- " + playersCardTwo() + " -&- " + playersCardThree() + "-&-" + playersCardFour());
                System.out.println("Dealers cards: " + dealersCardOne() + " -&- " + "******");
            }

            if (userInput.equals("no")) {
                moreCards = false;
                System.out.println("Your cards are: " + playersCardOne() + " -&- " + playersCardTwo());
                System.out.println("Dealers cards: " + dealersCardOne() + " -&- " + dealersCardTwo());
            }
        }
    }
}
