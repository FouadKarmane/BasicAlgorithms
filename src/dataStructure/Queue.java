package dataStructure;

import java.util.ArrayList;

public class Queue<T> {

    private ArrayList<T> _elements =  new ArrayList<>();

    /**
     *
     * @return
     */
    public boolean isEmpty(){
        return _elements.isEmpty();
    }

    /**
     *
     * @return
     */
    public T peek(){
        if(!isEmpty()) return _elements.get(0);
        return null;
    }

    /**
     *
     * @return
     */
    public T poll(){
        if(!isEmpty()) return _elements.remove(0);
        return null;
    }

    public void add(T elt){
        _elements.add(elt);
    }


}
