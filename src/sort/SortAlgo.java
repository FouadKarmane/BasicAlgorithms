package sort;

/**
 *@author Fouad Karmane
 */
public interface SortAlgo {

    /**
     * @param arr array unsorted
     * @return the sorted array
     */
    <T extends Comparable<T>> void sort(T[] arr);
}
