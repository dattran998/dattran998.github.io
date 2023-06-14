import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCard {
    private List<Card> cards;

    public ManagerCard() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public boolean deleteCard(String id) {
        Card card = this.cards.stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
        if (card == null) {
            return false;
        }
        this.cards.remove(card);
        return true;
    }

    public void showInforCard() {
        this.cards.forEach(o -> System.out.println(o.toString()));
    }
}
