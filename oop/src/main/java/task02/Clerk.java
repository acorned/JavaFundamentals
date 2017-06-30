package task02;

import java.util.LinkedList;
import java.util.List;

public class Clerk {
    private List<Stationery> workplace = new LinkedList<>();

    public void addItem(Stationery item){
        workplace.add(item);
    }

    int getWholeCost() {
        int sum = 0;
        for (Stationery item:
             workplace) {
            sum += item.getCost();
        }
        return sum;
    }
}
