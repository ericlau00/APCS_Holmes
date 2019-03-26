/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
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
    
    /**
      accessor
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether user violated the condition.)
     */
    public Object get( int index ) {
        int current = 0;
        Node currentNode = headReference;
        Object getThis = new Object(); 
        while (currentNode != null) {
            if (current == index) {
                getThis = currentNode.getCargoReference();
            }
            current++;
            currentNode = currentNode.getReferenceToNextNode();
        }
        return getThis;
    }
    
    /**
      Set value at @index to @newValue

      @return old value at @index
      @precondition: @index is within the bounds of this list.
     */
    public Object set( int index, int newValue ) {
        Object oldValue = new Object();
        Node newNode = new Node(newValue);
        if (index == 0) {
            oldValue = headReference.getCargoReference();
            newNode.setReferenceToNextNode(headReference.getReferenceToNextNode());
            headReference = newNode;
        }
        else {
            int current = 0;
            Node currentNode = headReference;
            while (currentNode != null) {
                if (current == index - 1) {
                    oldValue = currentNode.getReferenceToNextNode().getCargoReference();
                    newNode.setReferenceToNextNode(currentNode.getReferenceToNextNode().getReferenceToNextNode());
                    currentNode.setReferenceToNextNode(newNode);
                }
                current++;
                currentNode = currentNode.getReferenceToNextNode();
            }
        }
        return oldValue;
    }
    
    /**
      Insert @value at position @index in this list.
     */
    public void add( int index, int value) {
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.setReferenceToNextNode(headReference);
            headReference = newNode;
        }
        else {
            int current = 0;
            Node currentNode = headReference;
            while (currentNode != null) {
                if (current == index - 1) {
                    newNode.setReferenceToNextNode(currentNode.getReferenceToNextNode());
                    currentNode.setReferenceToNextNode(newNode);
                }
                current++;
                currentNode = currentNode.getReferenceToNextNode();
            }
        }
    }
    
    public void add (int value) {
        add(this.size(), value);
    }
    
     /**
      Remove the element at position @index in this list.

      @return the value that was removed from the list
     */
    public Object remove( int index) {
        Object value = new Object();
        if (index == 0) {
            value = headReference.getCargoReference();
            headReference = headReference.getReferenceToNextNode();
        }
        else {
            int current = 0;
            Node currentNode = headReference;
            while (currentNode != null) {
                if (current == index - 1) {
                    value = currentNode.getReferenceToNextNode().getCargoReference();
                    currentNode.setReferenceToNextNode(currentNode.getReferenceToNextNode().getReferenceToNextNode());
                }
                current++;
                currentNode = currentNode.getReferenceToNextNode();
            }
        }
        return value;
    }
}