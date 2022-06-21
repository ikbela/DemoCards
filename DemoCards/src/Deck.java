import java.util.ArrayList;
import java.util.Arrays;

public class Deck {
    ArrayList<Cards> arrayList= new ArrayList<Cards>();
    String[] strings = {"Hearts", "Clubs", "Diamonds", "Speads"};

    public Deck() {
        for (int j = 0; j < strings.length; j++) {
            for (int i = 1; i <= 13; i++) {
                arrayList.add( new Cards(strings[j],i));
            }
        }
        arrayList.add(new Cards(null,Integer.MAX_VALUE-1));
        arrayList.add(new Cards(null,Integer.MAX_VALUE));

    }

    @Override
    public String toString() {

        return arrayList.toString();
    }
}
