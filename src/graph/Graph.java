package graph;

import java.util.ArrayList;

/**
 * @author Fouad Karmane
 *
 * @param <T>
 */
public class  Graph<T extends Comparable<T>> {

    private class Node{
        T data;
        ArrayList<Node> adjacentNodes;

        public Node(T data){
            this.data=data;
            adjacentNodes = new ArrayList<>();
        }

        /**
         *
         * @param newNode
         * @return
         */
        public boolean addAdjNode(Node newNode){
            for (Node curNode : adjacentNodes){
                if(curNode.data.compareTo(newNode.data)==0){
                    //Node exists
                    return false;
                }
            }
            return adjacentNodes.add(newNode);
        }

        /**
         *
         * @param rNode
         * @return
         */
        public boolean removeAdjNode(Node rNode){
            for (Node curNode : adjacentNodes){
                if(curNode.data.compareTo(rNode.data)==0){
                    return adjacentNodes.remove(curNode);
                }
            }
            return false;
        }
    }

    private ArrayList<Node> nodes;

    public Graph(){
        nodes = new ArrayList<>();
    }

    /**
     *
     * @param from
     * @param to
     * @return
     */
    public boolean addEdge(T from, T to){
        return false;
    }

    /**
     *
     * @param from
     * @param to
     * @return
     */
    public boolean removeEdge(T from, T to){
        return false;
    }
}
