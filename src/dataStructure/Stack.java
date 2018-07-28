package dataStructure;

import java.util.ArrayList;

/**
 *
 * @param <T>
 */
public class Stack<T> {

    private ArrayList<T> _data;

    /**
     *
     */
    public Stack(){
        _data=new ArrayList<>();
    }

    /**
     *
     * @param elt
     * @return
     */
    public boolean push(T elt){
        return _data.add(elt);
    }

    /**
     *
     * @return
     */
    public T pop(){
        if(!isEmpty()){
            return _data.remove(_data.size()-1);
        }
        System.out.print("The stack is empty, no elements to pop :-(");
        return null;
    }

    /**
     *
     * @return
     */
    public T peek(){
        if(!isEmpty()){
            return _data.get(_data.size()-1);
        }
        System.out.print("The stack is empty, no element to peek at :-(");
        return null;
    }

    public boolean isEmpty(){
        return _data.isEmpty();
    }

}
