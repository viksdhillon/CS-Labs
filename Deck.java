import java.util.*;
import java.lang.Math;
public class Deck {

    ArrayList<Card> list;

    public Deck() {
        list = new ArrayList<Card>();
    }

    public void addCard(Card c) {
        list.add(c);
    }

    

    public void shuffle() {
        int randomRemove;
        int randomAdd;
        Card addTemp;
        Card temp;
        int counter = 1;
        while (counter <= list.size()) {
            //randomly inserting two cards in different spots
             randomRemove = (int) (Math.random() * list.size());
             randomAdd = (int) (Math.random() * list.size());
             if (randomAdd == randomRemove) {
                 randomAdd = (int) (Math.random() * list.size());
             }
            temp = list.get(randomRemove);
            addTemp = list.get(randomAdd);
            list.remove(temp);
            list.remove(addTemp);
            list.add(list.size() - 1, addTemp);
            list.add(list.size() - 1, temp);
            counter++;

        }
        
    }
    public Card draw() {
        Card tempCard = list.get(0);
        list.remove(tempCard);
        return tempCard;
    }

    

    

    public String toString() {
        if (list.size() == 0) {
            return "Deck is empty";
        }

        else {
            //setting up to string by concatenating to a blank string
            String tempString = "Deck:";
            for (Card e : list) {
                tempString += "\n" + e;
            }
            return tempString;
        }
        
    }


 }
