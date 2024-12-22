import java.util.ArrayList;
import java.util.HashMap;

public class Cards {
   private String suit;
    private int rank;
    private HashMap<String,Integer> hashMap=new HashMap<String,Integer>();

    private String name;
//comment
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Integer> hashMap) {
        this.hashMap = hashMap;
    }




    public Cards(String suit,int rank){
//        this.name=name;
        this.suit=suit;
        this.rank=rank;
//        hashMap.put("A",1);
//        hashMap.put("Jack",11);
//        hashMap.put("Queen",12);
//        hashMap.put("King",13);
        switch (rank){
            case 1: this.name="A";
            break;
            case 11: this.name="Jack";
            break;
            case 12: this.name="Queen";
            break;
            case 13: this.name="King";
            break;
            case  Integer.MAX_VALUE: this.name="Red Joker";
            break;
            case Integer.MAX_VALUE-1: this.name="Black Joker";
            break;
            default: this.name=String.valueOf(rank);
            break;
        }

    }

    @Override
    public String toString() {
        return "Cards{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                ", name='" + name + '\'' +
                '}';
    }
}
