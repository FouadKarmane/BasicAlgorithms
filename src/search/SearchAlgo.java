package search;

public interface SearchAlgo {

    /**
     *
     * @param elt is an element which should be found
     * @param arr is an array where the element should be found
     * @param <T> Comparable type
     * @return first found index of the element; -1 if element not present
     */
    <T extends Comparable<T>> int find(T arr[], T elt);
}
