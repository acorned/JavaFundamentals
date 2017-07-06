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

    String[] getAllNames() {
        String[] items = new String[workplace.size()];
        for (int i = 0; i < workplace.size(); i++) {
            items[i] = workplace.get(i).getName();
        }
        return items;
    }
}
