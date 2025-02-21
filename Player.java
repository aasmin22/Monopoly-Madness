import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    int pos;
    int cash;
    Player opponent;
    List<Integer> propertiesOwned;

    public Player(String name, Player opponent) {
        this.name = name;
        this.pos = 0;
        this.cash = 31;
        this.opponent = opponent;
        this.propertiesOwned = new ArrayList<>();
    }


    public void addProperty(int propertyIndex) {
        propertiesOwned.add(propertyIndex);
    }


    public boolean ownsProperty(int propertyIndex) {
        return propertiesOwned.contains(propertyIndex);
    }


    public int getNumberOfProperties() {
        return propertiesOwned.size();
    }

    public void move(int newPos) {
        pos = newPos % 32;
    }
}