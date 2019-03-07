/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    int[] refArray;
    int filledElements;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        refArray = new int[10];
        filledElements = 0;
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }

     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
    public String toString() {
        String representation = "[";
        for(int currentElement = 0; currentElement < filledElements; currentElement++) {
            representation += refArray[currentElement] + ",";
        }
        representation += "]";
        return representation;
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
         refArray[filledElements++] = value;
         return true;
     }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     // private void expand() {
        // System.out.println( "expand... (for debugging)");
           // /* S.O.P. rules for debugging:
              // Working methods should be silent. But during 
              // development, the programmer must verify that 
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // */
     // }
}