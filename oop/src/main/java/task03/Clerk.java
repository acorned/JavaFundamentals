package task03;

import java.util.LinkedList;
import java.util.List;

public class Clerk {
    private List<Stationery> workplace = new LinkedList<>();

    public void addItem(Stationery item){
        workplace.add(item);
    }

    public int getWholeCost() {
        int sum = 0;
        for (Stationery item:
             workplace) {
            sum += item.getCost();
        }
        return sum;
    }

    public String[] getAllNames() {
        String[] items = new String[workplace.size()];
        for (int i = 0; i < workplace.size(); i++) {
            items[i] = workplace.get(i).getName();
        }
        return items;
    }
    public List<Stationery> getWorkplace(){
        return this.workplace;
    }


}
