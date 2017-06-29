package task01;

public class Pen {
    private int cost;
    private String color;

    public Pen(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Pen pen = (Pen) object;

        if (cost != pen.cost) return false;
        if (color != null ? !color.equals(pen.color) : pen.color != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + cost;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public java.lang.String toString() {
        return "Pen{" +
                "cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
