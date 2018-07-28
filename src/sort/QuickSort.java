package sort;

/**
 *
 *
 *
 */
class QuickSort implements SortAlgo{


    public <T extends Comparable<T>> void sort(T[] arr) {
        if (arr==null) return;
        sort(arr,0,arr.length-1);
    }

    /**
     *
     * @param arr
     * @param l
     * @param r
     * @param <T>
     */
    private <T extends Comparable<T>> void sort(T[] arr, int l, int r){
        if(l<r){
            int p=partition(arr,l,r);
            sort(arr,l,p-1);
            sort(arr,p+1,r);
        }
    }

    /**
     * Chooses a pivot from the input table and swaps all elements
     * smaller than pivot to the left, and all the greater elements to the right
     *
     * @param arr
     * @param l
     * @param r
     * @param <T>
     * @return the index of the pivot in the new table
     */
    private <T extends Comparable<T>> int partition(T[] arr, int l, int r){
        T pivot = getPivot(arr,l,r);
        int i = l-1;
        for(int j=0;j<r;j++){
            if(arr[j].compareTo(pivot)<=0){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }

    /**
     * returns the value of pivot used for quick sort
     * Can be much, much smarter than this.
     *
     * @param arr
     * @param l
     * @param r
     * @param <T>
     * @return
     */
    private <T extends Comparable<T>> T getPivot(T[] arr, int l, int r){
        return  arr[r];
    }

    /**
     * swaps two objects of an array.
     *
     * @param arr array of object
     * @param i index of first object to swap
     * @param j index of second object to swap
     * @param <T>
     */
    private <T extends Comparable<T>> void swap(T[] arr, int i, int j){
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
