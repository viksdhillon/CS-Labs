import java.util.*;
public class Hand {
    ArrayList<Card> handList;
    public Hand() {
        handList = new ArrayList<Card>();
    }

    public void addCard(Card c) {
        handList.add(c);
    }

    public boolean isEmpty() {
        if (handList.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void sort() {
        for (int j = 0; j < handList.size() - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < handList.size(); k++) {
                //sorting by order
                if (handList.get(k).getOrder() < handList.get(minIndex).getOrder()) {
                    minIndex = k;
                }
            }
            Card temp = handList.get(j);
            handList.set(j, handList.get(minIndex));
            handList.set(minIndex, temp);
        }
    }

    public String toString() {
        if (handList.size() == 0) {
            return "Hand is Empty!";
        }

        else {
            //concatenating to a string
            String temporaryString = "Hand:";
            for (Card e : handList) {
                temporaryString += "\n" + e;
            }
            return temporaryString;
        }
    }
 }
