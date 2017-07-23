package quicksort;
import java.util.Comparator;

public class QuickSortRec {

    public static <T> void sort(Comparator<T> comparator, T... array){
        sort(comparator, 0, array.length - 1, array);
    }

    public static <T> void sort(Comparator<T> comparator, int left, int right, T... array) {
        if (left < right) {
            int separatingIndex = partition(comparator, left, right, array);
            sort(comparator, left, separatingIndex, array);
            sort(comparator,separatingIndex + 1, right, array);
        }

    }
    private static <T> int partition(Comparator<T> comparator, int left, int right, T... array){
        T separator = array[(left + right) / 2];
        int i = left;
        int j = right;
        while (i <= j) {
            while (comparator.compare(array[i], separator) < 0) i++;
            while (comparator.compare(array[j], separator) > 0)
                j--;

            if (i <= j) {
                T tmp = array[i];
                array[i++] = array[j];
                array[j--] = tmp;
            }
        }
        return --i;

    }
}
