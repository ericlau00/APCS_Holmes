/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_recursiveStyle{
    private Node headReference;

    /**
      Construct an empty list
     */
     
    /**
      @return the number of elements in this list
     */
    public int size() {
        return size(headReference);
    }
    
    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        else {
            return 1 + size(node.getReferenceToNextNode());
        }
    }

     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
        String rep = Integer.toString(this.size()) + " elements [";
        rep += toString(headReference);
        rep += "]";
        return rep;
    }
    
    private String toString(Node node) {
        if (node == null) {
            return "";
        }
        else {
            return node.getCargoReference().toString() + "," 
                 + toString(node.getReferenceToNextNode());
        }
    }
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean addAsHead( Object val) {
        Node newNode = new Node(val);
        newNode.setReferenceToNextNode(headReference);
        headReference = newNode; 
        return true;
    }
}