/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    private int[] elements;     // container for the elements of the list
    private int filledElements; // the number of elements in this list

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        elements = new int[ INITIAL_CAPACITY];
        // filledElements has been initialized to the desired value, 0
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
        String result = "[";
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
            result += elements[ elemIndex] + ",";
        return result + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
         // expand if necessary
         if( filledElements == elements.length) expand();

         elements[ filledElements] = value;
         filledElements++;
         // idiomatic version: elements[ filledElements++] = value;
        return true;
}


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
        int[] bigger = new int[ elements.length * 2];
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
            bigger[ elemIndex] = elements[ elemIndex];
        elements = bigger;
     }
}