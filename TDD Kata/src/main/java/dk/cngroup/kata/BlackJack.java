package dk.cngroup.kata;

import java.util.*;

public class BlackJack {

    public static void main(String[] args) {

        BlackJack blackJack = new BlackJack();
        Queue<BlackJackCard> deck = blackJack.createDeck();

        List<BlackJackCard> dealerCards = new ArrayList<>();
        List<BlackJackCard> playerCards = new ArrayList<>();

        dealerCards.add(deck.poll());
        playerCards.add(deck.poll());
        dealerCards.add(deck.poll());
        playerCards.add(deck.poll());

        System.out.println("Welcome to BlackJack");
        System.out.println("Dealer's first card is:");
        System.out.println(dealerCards.get(0));
        System.out.println("Points: " + (dealerCards.get(0).cardValue.value));

        System.out.println("You are dealt:");
        System.out.println(playerCards.get(0));
        System.out.println(playerCards.get(1));
        System.out.println("Points: " + (playerCards.get(0).cardValue.value + playerCards.get(1).cardValue.value));

        boolean gameOver = false;

        while (!gameOver) {

            System.out.println("You wanna 'Hit'(H) or 'Skip'(S)?");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("S")) {
                gameOver = true;

            } else if (input.equals("H")) {
                playerCards.add(deck.poll());
                int points = playerCards.stream().mapToInt(x -> x.cardValue.value).sum();
                if (points > 21) {
                    break;
                } else {
                    playerCards.stream().forEach(x-> System.out.println(x));
                    System.out.println("Points:" + points);
                }
            } else {
                System.out.println("Unknown input");
            }
        }

        int dealerPoints = dealerCards.stream().mapToInt(x -> x.cardValue.value).sum();
        int playerPoints = playerCards.stream().mapToInt(x -> x.cardValue.value).sum();

        System.out.println("Dealer points: " + dealerPoints);
        System.out.println("Player points: " + playerPoints);

        if (dealerPoints > playerPoints || playerPoints > 21) {
            System.out.println("YOU LOST");
        } else {
            System.out.println("YOU WON");

        }

    }

    Queue<BlackJackCard> createDeck() {
        Queue<BlackJackCard> queue = new LinkedList<>();
        List<BlackJackCard> list = new ArrayList<>();

        for (CardSuite cardSuite : CardSuite.values()) {
            for (CardValue cardValue : CardValue.values()) {
                list.add(new BlackJackCard(cardSuite, cardValue));
            }
        }

        Collections.shuffle(list);
        queue.addAll(list);
        return queue;

    }

    class BlackJackCard {
        public CardSuite cardSuite;
        public CardValue cardValue;

        public BlackJackCard(CardSuite cardSuite, CardValue cardValue) {
            this.cardSuite = cardSuite;
            this.cardValue = cardValue;
        }

        @Override
        public String toString() {
            return cardValue.name() + " of " + cardSuite.name();
        }
    }
    enum CardSuite{
        SPADES,CLUBS,DIAMONDS,STARS;
    }

    enum CardValue{
        ACE(11),
        KING(10),
        QUEEN(10),
        JACK(10),
        NINE(9),
        EIGHT(8),
        SEVEN(7),
        SIX(6),
        FIVE(5),
        FOUR(4),
        THREE(3),
        TWO(2);

        public Integer value;
        CardValue(Integer value) {
            this.value = value;
        };
    }
}
