package task04;
import task03.*;

public class NoviceSet implements Comparable<NoviceSet>{

    private Stationery item;

    public NoviceSet(Stationery item){
        this.item = item;
    }

    Stationery getItem(){
        return item;
    }

    public int compareTo(NoviceSet set) {
        String sort = "name";
        switch (sort) {
            case "name":
                //sort by name
                return 0;
            case "cost":
                //sort by cost
                return 0;
            case "cost and name":
                //sort by cost, then by name
                return 0;
            default:
                //no way
                return -1;
        }

    }
}
