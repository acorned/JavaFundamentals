package task03;

import java.util.LinkedList;
import java.util.List;

public class Clerk {
    private List<Clerical> workplace = new LinkedList<>();

    public void addItem(Clerical item){
        workplace.add(item);
    }

    int getWholeCost() {
        int sum = 0;
        for (Clerical item:
             workplace) {
            sum += item.getCost();
        }
        return sum;
    }
}
