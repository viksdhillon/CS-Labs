public class Card {
    private String value;
    private String suit;
    private int order;
    public Card(String initValue, String initSuit) {
        value = initValue;
        suit = initSuit;
        //defining order of each card value
        if (value.equals("Ace")) {
            order = 1;
        }
        if (value.equals("2")) {
            order = 2;
        }
        if (value.equals("3")) {
            order = 3;
        }
        if (value.equals("4")) {
            order = 4;
        }
        if (value.equals("5")) {
            order = 5;
        }
        if (value.equals("6")) {
            order = 6;
        }
        if (value.equals("7")) {
            order = 7;
        }
        if (value.equals("8")) {
            order = 8;
        }
        if (value.equals("9")) {
            order = 9;
        }
        if (value.equals("10")) {
            order = 10;
        }
        if (value.equals("Jack")) {
            order = 11;
        }
        if (value.equals("Queen")) {
            order = 12;
        }
        if (value.equals("King")) {
            order = 13;
        }
    }

    public String getSuit() {
        return suit;
    }
    
    public String getValue() {
        return value;
    }

    public int getOrder() {
        return order;
    }

    public String toString() {
        //toString set up
        return value + " of " + suit;
    }
}
