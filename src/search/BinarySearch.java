package search;

/**
 *
 */
public class BinarySearch implements  SearchAlgo{

    /**
     *
     * @param arr is an array where the element should be found
     * @param elt is an element which should be found
     * @param <T>
     * @return
     */
    public <T extends Comparable<T>> int find(T[] arr, T elt) {
        if(arr==null) return -1;
        return recuFind(arr,0,arr.length-1,elt);
    }

    /**
     *
     * @param arr
     * @param l
     * @param r
     * @param elt
     * @param <T>
     * @return
     */
    public <T extends Comparable<T>> int recuFind(T[] arr, int l, int r,T elt){
        if(l<r){
            int mid = (l+r)/2;
            if(arr[mid].compareTo(elt)==0) return mid;
            if(arr[mid].compareTo(elt)<0) return  recuFind(arr,l,mid-1,elt);
            if(arr[mid].compareTo(elt)<0) return  recuFind(arr,mid+1,r,elt);
        }
        return -1;
    }
}
