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
        if (node == null) return 0;
        else return 1 + size(node.getReferenceToNextNode());
    }

     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
        String rep = Integer.toString(this.size()) + " elements [" + toString(headReference) + "]";
        return rep;
    }
    
    private String toString(Node node) {
        if (node == null) return "";
        else return node.getCargoReference().toString() + "," + toString(node.getReferenceToNextNode());
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
    
    private Node getNode(int index) {
        Node node;
        int i;
        for(i = 0, node = headReference; i < index; i++, node = node.getReferenceToNextNode()) { }
        return node; 
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
        return getNode(index).getCargoReference();
    }
    
    /**
      Set value at @index to @newValue

      @return old value at @index
      @precondition: @index is within the bounds of this list.
     */
    public Object set( int index, int newValue ) {
        Object oldValue = get(index);
        Node newNode = new Node(newValue);
        if (index == 0) {
            newNode.setReferenceToNextNode(headReference.getReferenceToNextNode());
            headReference = newNode;
        }
        else {
            Node previous = getNode(index - 1);
            newNode.setReferenceToNextNode(previous.getReferenceToNextNode().getReferenceToNextNode());
            previous.setReferenceToNextNode(newNode);
        }
        return oldValue;
    }
    
    /**
      Insert @value at position @index in this list.
     */
    public void add( int index, int value) {
        if (index == 0) addAsHead(value);
        else {
            Node newNode = new Node(value);
            Node previous = getNode(index - 1);
            newNode.setReferenceToNextNode(previous.getReferenceToNextNode());
            previous.setReferenceToNextNode(newNode);
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
        Object value = get(index);
        if (index == 0) headReference = headReference.getReferenceToNextNode();
        else {
            Node previous = getNode(index - 1);
            previous.setReferenceToNextNode(previous.getReferenceToNextNode().getReferenceToNextNode());
        }
        return value;
    }
}